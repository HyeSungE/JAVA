import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
class Member implements Serializable{
	private String name;
	private String tel;
	public Member(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
	String getName() {
		return this.name;
	}
	String getTel() {
		return this.tel;
	}
}
class Input extends JFrame implements ActionListener{
	
	private JPanel jp= new JPanel();
	private JPanel jp2= new JPanel();
	private Label nameL = new Label("이름        ",Label.LEFT);
	private Label telL = new Label("전화번호",Label.LEFT);
	private JTextField nameTf = new JTextField();
	private JTextField telTf = new JTextField();
	private JButton jbt = new JButton("전 송");
	private JButton jbt2 = new JButton("종 료");
	
	private ArrayList<Member> al = new ArrayList<Member>();
	
	public void init() {
		Container con = this.getContentPane();
		con.add("Center",jp);
		con.add("South",jp2);
		jp2.setLayout(new GridLayout(1,2));
		jp2.add(jbt);jp2.add(jbt2);
		
		jp.setLayout(new FlowLayout());
		jp.add(nameL);jp.add(nameTf);
		jp.add(telL);jp.add(telTf);
		nameTf.setPreferredSize(new Dimension(150,25));
		telTf.setPreferredSize(new Dimension(150,25));
		jbt.addActionListener(this);jbt2.addActionListener(this);
		
	}
	public Input(String title) {
		super(title);
		this.init();
		this.setSize(250, 150);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbt) {
			Member m = new Member(nameTf.getText(),telTf.getText());
			al.add(m);
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				//oos.writeObject(m);
				oos.writeObject(al);
				oos.close();
				byte[] by = baos.toByteArray();
				InetAddress ia = InetAddress.getByName("localhost");
				DatagramPacket dp = new DatagramPacket(by,by.length,ia,12345);
				DatagramSocket ds = new DatagramSocket();
				ds.send(dp);
				ds.close();
				nameTf.setText(""); telTf.setText("");
 			}catch(Exception ee) {}
		}
		else if(e.getSource()==jbt2) {
			try {
				byte[] by = new String("exit").getBytes();
				InetAddress ia = InetAddress.getByName("localhost");
				DatagramPacket dp = new DatagramPacket(by,by.length,ia,12345);
				DatagramSocket ds = new DatagramSocket();
				ds.send(dp);
				ds.close();
				System.exit(0);
			}catch(Exception ee) {}
		}
	}
	
}
public class Test14 {
	public static void main(String args[]) {
		Input ip = new Input("클라이언트");
	}
}

