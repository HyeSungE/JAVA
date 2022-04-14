import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

class Input extends JFrame implements ActionListener,Runnable{
	
	private JPanel jp= new JPanel();
	private JPanel jp2= new JPanel();
	private Label tableL = new Label("테이블 번호      ",Label.LEFT);
	private JTextField tableTf = new JTextField();
	private JButton jbt = new JButton("전 송");
	private JButton jbt2 = new JButton("종 료");

	private DatagramPacket send_dp, receive_dp;
	private DatagramSocket ds;
	private InetAddress ia;
	
	public void init() {
		Container con = this.getContentPane();
		con.add("Center",jp);
		con.add("South",jp2);
		jp2.setLayout(new GridLayout(1,2));
		jp2.add(jbt);jp2.add(jbt2);
		
		jp.setLayout(new FlowLayout());
		jp.add(tableL);jp.add(tableTf);
		tableTf.setPreferredSize(new Dimension(150,25));
		jbt.addActionListener(this);jbt2.addActionListener(this);
		
	}
	public Input(String title) throws Exception {
		super(title);
		this.init();
		this.setSize(250, 150);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		ds = new DatagramSocket(12345);
		Thread tt = new Thread(this);
		tt.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jbt) {
			String by = tableTf.getText();
			try {
				InetAddress ia = InetAddress.getByName("localhost");
				send_dp = new DatagramPacket(by.getBytes(),by.getBytes().length,ia,12346);
				ds.send(send_dp);
				tableTf.setText("");
 			}catch(Exception ee) {}
		}
		else if(e.getSource()==jbt2) {
			try {
				byte[] by = new String("exit").getBytes();
				InetAddress ia = InetAddress.getByName("localhost");
				send_dp = new DatagramPacket(by,by.length,ia,12346);
				ds.send(send_dp);
				
				System.exit(0);
			}catch(Exception ee) {}
		}
	}
	@Override
	public void run() {
		while(true) {
		try {
			String msg = "";
			byte[] by = new byte[65508];
			receive_dp = new DatagramPacket(by,by.length);
			ds.receive(receive_dp);
			ByteArrayInputStream bais = new ByteArrayInputStream(receive_dp.getData());
			ObjectInputStream ois = new ObjectInputStream(bais);
			ArrayList<BuyList>list = (ArrayList)ois.readObject();
			for(BuyList bl : list) {
				msg+=bl.getName()+" "+bl.getPrice()+"\n";
			}
			JOptionPane.showMessageDialog(null, msg, 
			"주문내역서", JOptionPane.PLAIN_MESSAGE);
		}catch(Exception e) {}
		}
	}
	
}
public class Test08 {
	public static void main(String args[]) throws Exception {
		Input ip = new Input("테이블 서버");
	}
}

