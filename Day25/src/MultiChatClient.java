import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
public class MultiChatClient extends JFrame 
			implements Runnable, ActionListener, KeyListener{
	private TextArea ta = new TextArea();
	private JLabel lb = new JLabel("메세지 : ", JLabel.RIGHT);
	private JTextField jtf = new JTextField();
	private JButton jbt = new JButton("전송");
	private JPanel jp = new JPanel();
	
	private InetAddress ia;
	private Socket soc;
	private PrintWriter pw;
	private BufferedReader in;
	
	private String name;
	
	public void init(){
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		ta.setFont(new Font("", Font.PLAIN, 15));
		ta.setEditable(false);
		con.add("Center", ta);
		con.add("South", jp);
		jp.setLayout(new BorderLayout());
		jp.add("West", lb);
		jp.add("Center", jtf);
		jp.add("East", jbt);
	}
	public void start(){
		jbt.addActionListener(this);
		jtf.addKeyListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public MultiChatClient(){
		name = JOptionPane.showInputDialog
				(this, "사용자명 : ", "입력", 
						JOptionPane.INFORMATION_MESSAGE);
		this.setTitle("사용자 : " + name);
		this.init();
		this.start();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		super.setVisible(true);
		try{
			ia = InetAddress.getByName("localhost");
			soc = new Socket(ia, 12345);
			ta.setText("서버 접속 성공!!\n");
			pw = new PrintWriter(soc.getOutputStream(), true);
			pw.println("@"+name);
			
			pw.flush();
		}catch(IOException e){}
		Thread th = new Thread(this);
		th.start();
	}
	public void run(){
		try{
			in = new BufferedReader
				(new InputStreamReader(soc.getInputStream()));
			String msg = "";
			while(true){
				msg = in.readLine();
				ta.append(msg+"\n");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbt){
			pw.println(name+":" + jtf.getText()+"\n");
			pw.flush();
			jtf.setText("");
		}
	}
	
	public static void main(String[] args){
		new MultiChatClient();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			pw.println(name+":" + jtf.getText()+"\n");
			pw.flush();
			jtf.setText("");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

