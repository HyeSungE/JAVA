import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
class MyFrameb extends JFrame implements ActionListener,KeyListener,Runnable{
	
	private JPanel jp = new JPanel();
	private JButton jb = new JButton("����");
	private Label l = new Label("�޼���");
	private JTextField jtf = new JTextField();
	private JTextArea jta = new JTextArea();

	private ServerSocket ss;
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

	
	}
	
	public MyFrameb(String title) {
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
			ss = new ServerSocket(12345);
			System.out.println("���������");
			soc = ss.accept();
			Thread tt = new Thread(this);
			tt.start();
			jta.setText("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.\n");
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
			jtf.setText("");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb) {
			String msg = jtf.getText();
			jtf.setText("");
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
				String msg=br.readLine();
				jta.append("From Client : "+msg+"\n");
			}
		}catch(Exception e){}
		
	}
}
public class ChattingServer_broad {

	public static void main(String[] args) {
		MyFrameb mf = new MyFrameb("Chatting");

	}

}
