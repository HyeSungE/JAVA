import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class MyFrame2 extends JFrame implements ActionListener,KeyListener,Runnable{
	
	private JPanel jp = new JPanel();
	private JButton jb = new JButton("전송");
	private Label l = new Label("메세지");
	private JTextField jtf = new JTextField();
	private JTextArea jta = new JTextArea();
	
	private DatagramPacket send_dp, receive_dp;
	private DatagramSocket ds;
	private InetAddress ia;
	private Scanner in;
	
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

	
	}
	
	public MyFrame2(String title) {
		super(title);
		init();
		this.setSize(450,450);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		jta.setEditable(false);
		
		
		try {
			ia = InetAddress.getByName("localhost");
			ds = new DatagramSocket(12345);
			Thread tt = new Thread(this);
			tt.start();
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
			try {
				String msg = jtf.getText();
					jtf.setText("");
					jta.append("To  : "+msg+"\n");
					send_dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia,12346);
					ds.send(send_dp);
				}catch(Exception ee) {}
				
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {
			try {
			String msg = jtf.getText();
				jtf.setText("");
				jta.append("To  : "+msg+"\n");
				send_dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia,12346);
				ds.send(send_dp);
			}catch(Exception ee) {}
		}
	}

	@Override
	public void run() {
		try {
			receive_dp = new DatagramPacket(new byte[65508],65508);
			ds.receive(receive_dp);
			String msg = new String(receive_dp.getData()).trim();
			jta.append("From : "+ msg+"\n");
		}catch(Exception e){}
		
	}
}
public class udp02 {

	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2("Chatting");

	}

}
