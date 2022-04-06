import java.awt.*;
import javax.swing.*;

class MyFrame09 extends JFrame{
	private JTextArea jta1 = new JTextArea("A반");
	private JTextArea jta2 = new JTextArea("B반");
	private JSplitPane jsp = new JSplitPane();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center", jsp);
		jsp.setLeftComponent(jta1);
		jsp.setRightComponent(jta2);
	}
	
	public MyFrame09(String title) {
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

public class Test09 {
	public static void main(String[] args) {
		MyFrame09 mf = new MyFrame09("frame예제");
	}
}
