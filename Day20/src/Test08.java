import java.awt.*;
import javax.swing.*;

class MyFrame08 extends JFrame{
	private Container con;
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("¥���");
	private JButton jbt2 = new JButton("«��");
	private JButton jbt3 = new JButton("������");
	private JButton jbt4 = new JButton("������");
	
	private JTabbedPane jtp = new JTabbedPane();
	
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center", jtp);
		jp1.setBackground(Color.red);
		jp2.setBackground(Color.blue);
		jp3.setBackground(Color.green);
		jp4.setBackground(Color.DARK_GRAY);
		jtp.add("1�� �г�", jp1);
		jtp.add("2�� �г�", jp2);
		jtp.add("3�� �г�", jp3);
		jtp.add("4�� �г�", jp4);
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.add(jbt3);
		jtb.addSeparator();
		jtb.add(jbt4);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public MyFrame08(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}

public class Test08 {
	public static void main(String[] args) {
		MyFrame08 mf = new MyFrame08("frame����");
	}
}
