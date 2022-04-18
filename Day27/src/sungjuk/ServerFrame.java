package sungjuk;

import java.awt.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class ServerFrame  extends JFrame {

	private JTextArea jta= new JTextArea();
	private String jta_title = "이름\t국어\t영어\t총점\t순위\n"
			+ "------------------------------------------------------------------------------------------------------------------------\n";
	private StudentDAO dao;
	
	private ServerSocket ss;
	private Socket soc=new Socket();
	private BufferedReader br;
	private StudentProImpl stdpi=new StudentProImpl();
	

	
	void init() {
		Container con = this.getContentPane();
		jta.setText(jta_title);
		jta.setEditable(false);
		con.add("Center",jta);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stdpi.output(jta);
	}
	public ServerFrame(String title) throws Exception {
		super(title);
		init();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		super.setVisible(true);
		
		dao = new StudentDAO();
		
		//ss=new ServerSocket(12345);
		DatagramPacket dp = new DatagramPacket(new byte[65508],65508);
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true) {
			
			//soc=ss.accept();
			dp = new DatagramPacket(new byte[65508],65508);
			ds.receive(dp);
			//br = new BufferedReader
				//	(new InputStreamReader(soc.getInputStream()));
			String str="";
			str = new String(dp.getData()).trim();
			System.out.println(str);
			
			if(str.contains("@")) {
				String data[]=str.split("@");
				String name = data[0];
				int kor = Integer.parseInt(data[1]);
				int eng = Integer.parseInt(data[2]);
				if(data[3].equals("1")) {
					dao.insertStudent(name, kor, eng);
				}else {
					dao.updateStudent(name, kor, eng);
				}
			}else {
				String name = str;
				dao.deleteStudent(name);
			}
			jta.setText(jta_title);
			stdpi.output(jta);
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		ServerFrame sf = new ServerFrame("Server");
	}

}
