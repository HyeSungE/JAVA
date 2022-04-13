import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
class MyFrame1 extends JFrame{

	
	private JPanel jp = new JPanel();
	private String title2 = "이름\t전화번호\t\n"
			+ "----------------------------------\n";
	private JTextArea jta = new JTextArea();
	
	private DatagramPacket recvP;
	private DatagramSocket ds;
	private InetAddress ia;
	
	private ArrayList<Member> al=new ArrayList<Member>();
	public void init() {
		Container con = this.getContentPane();
		con.add("Center",jta);
		jta.setText(title2);
		jta.setEditable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame1 (String title) throws Exception {
		super(title);
		init();
		this.setSize(450,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		
		ia = InetAddress.getByName("localhost");
		ds =new DatagramSocket(12345);
		
		while(true) {
			recvP = new DatagramPacket(new byte[65508],65508);
			ds.receive(recvP);
			byte[] by = recvP.getData();
			if(new String(by).trim().equals("exit")) {
				ds.close();
				jta.append("\n-------------------종료합니다"
						+ "----------------------\n");
				break;
			}
			ByteArrayInputStream bais = new ByteArrayInputStream(by);
			ObjectInputStream ois = new ObjectInputStream(bais);
			/*Member m = (Member)ois.readObject();
			jta.append(m.getName()+"\t");
			jta.append(m.getTel()+"\n");
			*/
			al = (ArrayList)ois.readObject();
			jta.setText(title2);
			for(Member mb : al) {
				jta.append(mb.getName()+"\t");
				jta.append(mb.getTel()+"\n");
				
			}
		}
		
	}
}
public class Test13{
	
	public static void main(String args[]) throws Exception {
		MyFrame1 mf =new MyFrame1("서버");
	}
}
