import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class MyFrame02 extends JFrame implements ActionListener,KeyListener,Runnable{
	
	private JPanel jp = new JPanel();
	private JButton jb = new JButton("전송");
	private Label l = new Label("메세지");
	private JTextField jtf = new JTextField();
	private JTextArea jta = new JTextArea();
	
	
	//private String to ="To Client : ";
	//private String from ="From Client :";
	private InetAddress ia = null;
	private Socket soc;
	private PrintWriter pw;
	private BufferedReader br;
	
	public void init() {
	Container con = this.getContentPane();
	con.add("Center",jta);
	con.add("South",jp);
	jp.setLayout(new FlowLayout());
	jp.add(l);
	jtf.setPreferredSize(new Dimension(300,30));
	jp.add(jtf);
	jp.add(jb); jb.addActionListener(this);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jtf.addKeyListener(this);
	jta.setEditable(false);
	
	}
	
	public MyFrame02(String title) {
		super(title);
		init();
		this.setSize(450,450);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		jtf.setEnabled(false);
		jb.setEnabled(false);
		try {
			ia = InetAddress.getByName("localhost");
			
			System.out.println("서버대기중");
			soc = new Socket(ia, 12345);
			Thread tt = new Thread(this);
			tt.start();
			jta.setText("서버와 연결되었습니다.\n");
			jtf.setEnabled(true);
			jb.setEnabled(true);
			pw = new PrintWriter(soc.getOutputStream(),true);
		}catch(Exception e) {}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==e.VK_ENTER) {
			String msg = jtf.getText();
			jtf.setText("");
			jta.append("To Client : "+msg+"\n");
			pw.println(msg);
			pw.flush();
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {
			String msg = jtf.getText();
			jtf.setText("");
			//System.out.println(msg);
			//pw = new PrintWriter(soc.getOutputStream(),true);
			//String toM="";
			//toM.concat(to);
			//toM.concat(msg);
			jta.append("To Client : "+msg+"\n");
			pw.println(msg);
			pw.flush();
			}
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				//String fromM = null;
				String msg=br.readLine();
				//fromM.concat(from);
				//fromM.concat(msg);
				jta.append("From Client : "+msg+"\n");
			}
		}catch(Exception e){}
		
	}
}
public class ChattingClient_uni {

	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("Chatting");

	}

}
