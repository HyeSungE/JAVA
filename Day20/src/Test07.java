import java.awt.*;
import javax.swing.*;

class MyFrame07 extends JFrame{
	private JDesktopPane pane = new JDesktopPane();
	private JInternalFrame jif1 = new JInternalFrame("1번", true, true, true, true);
	private JInternalFrame jif2 = new JInternalFrame("2번", true, true, true, false);
	//1-title, 2-resizeble, 3-close, 4-최대화, 5-최소화
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		pane.add(jif1);
		jif1.setBounds(10, 10, 200, 150);
		jif1.setVisible(true);
		pane.add(jif2);
		jif2.setBounds(310, 10, 200, 150);
		jif2.setVisible(true);
		con.add("Center", pane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public MyFrame07(String title) {
		super(title);
		this.init();
		
		this.setSize(800,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}

public class Test07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("swing예제");
	}
}
