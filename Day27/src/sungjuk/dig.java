package sungjuk;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;
public class dig extends Dialog implements ActionListener{
	
	private Panel p = new Panel();
	private TextField name_tf = new TextField();
	private TextField kor_tf = new TextField();
	private TextField eng_tf = new TextField();
	private Label name_l = new Label("이름");
	private Label kor_l = new Label("국어");
	private Label eng_l = new Label("영어");
	private Button bt[] = new Button[3];
	
	private Socket soc;
	private InetAddress ia;
	//private PrintWriter pw;
	private DatagramPacket dp ;
	private DatagramSocket ds ;
	
	private StudentDAO dao = new StudentDAO();
	
	void init(String title) {
		for(int i=0;i<3;i++) {
			bt[i]=new Button("전송");
			bt[i].addActionListener(this);
		}
		if(title.equals("입력")) {
			p.setLayout(new GridLayout(3,3));
			p.add(name_l);p.add(name_tf);
			p.add(kor_l);p.add(kor_tf);
			p.add(eng_l);p.add(eng_tf);
			this.add("Center",p);
			this.add("South",bt[0]);
		}else if(title.equals("수정")) {
			p.setLayout(new GridLayout(3,3));
			p.add(name_l);p.add(name_tf);
			p.add(kor_l);p.add(kor_tf);
			p.add(eng_l);p.add(eng_tf);
			this.add("Center",p);
			this.add("South",bt[1]);
		}else if(title.equals("삭제")) {
			this.setLayout(new GridLayout(3,1));
			p.setLayout(new FlowLayout());
			p.add(name_l);p.add(name_tf);
			name_tf.setPreferredSize(new Dimension(180,25));
			this.add(new Label(""));
			this.add(p);
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(2,1));
			p2.add(new Label(""));
			p2.add(bt[2]);
			this.add(p2);
		}
		try {
			ia = InetAddress.getByName("localhost");
			//soc = new Socket(ia,12345);
			ds = new DatagramSocket();
		}catch(Exception e){
			System.err.println("err");
		}
		
	}
	public dig(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init(title);
		this.setSize(250, 250);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt[0]) {
			this.setVisible(false);
			String name = name_tf.getText();
			String kor = kor_tf.getText();
			String eng = eng_tf.getText();
			String str=name+"@"+kor+"@"+eng+"@"+"1";
			
			clearText();
			if(dao.inName(name) != null) {
				JOptionPane.showMessageDialog(null,"이미 존재하는 이름입니다.","이름 중복 오류",JOptionPane.WARNING_MESSAGE);
			}
			else {
				try {
				//pw = new PrintWriter(soc.getOutputStream());
				//pw.println(str);
				//pw.flush();
					System.out.println(str);
					dp=new DatagramPacket(str.getBytes(),str.getBytes().length,ia,12345);
					ds.send(dp);
					ds.close();
				}catch(Exception ee) {
					ee.printStackTrace();
				}
			}	
		}else if(e.getSource()==bt[1]) {
			this.setVisible(false);
			String name = name_tf.getText();
			int kor = Integer.parseInt(kor_tf.getText());
			int eng = Integer.parseInt(eng_tf.getText());
			String str=name+"@"+kor+"@"+eng+"@"+"2";
			clearText();
			try {
				//pw = new PrintWriter(new BufferedWriter
				//(new OutputStreamWriter(soc.getOutputStream())));
				//pw.println(name+"@"+kor+"@"+eng+"@"+"2");
				//pw.flush();
				dp=new DatagramPacket(str.getBytes(),str.getBytes().length,ia,12345);
				ds.send(dp);
				ds.close();
			}catch(Exception ee) {
				System.err.print("error");
			}
		}else if(e.getSource()==bt[2]) {
			String name = name_tf.getText();
			this.setVisible(false);
			clearText();
			if(dao.inName(name) == null) {
				JOptionPane.showMessageDialog(null,"존재하지 않는 이름입니다.","없는 이름 오류",JOptionPane.WARNING_MESSAGE);
			}
			else{
				try {
				//pw = new PrintWriter(new BufferedWriter
				//	(new OutputStreamWriter(soc.getOutputStream())));
				//pw.println(name);
				//pw.flush();
					System.out.println(name);
					dp=new DatagramPacket(name.getBytes(),name.getBytes().length,ia,12345);
					ds.send(dp);
					ds.close();
				}catch(Exception ee) {
					System.err.print("error");
				}
			}
		}
		
	}
	
	void clearText() {
		name_tf.setText("");
		kor_tf.setText("");
		eng_tf.setText("");
	}
	
	
}
