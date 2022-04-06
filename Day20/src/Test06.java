import java.awt.*;
import javax.swing.*;

class MyFrame06 extends JFrame{
	private ImageIcon ii1 = new ImageIcon("a.gif");
	private ImageIcon ii2 = new ImageIcon("b.gif");
	private ImageIcon ii3 = new ImageIcon("c.gif");
	private ImageIcon ii4 = new ImageIcon("d.gif");
	private JToggleButton jtb1 = new JToggleButton(ii1);
	private JToggleButton jtb2 = new JToggleButton(ii2);
	private JToggleButton jtb3 = new JToggleButton("버튼3", ii3);
	private JToggleButton jtb4 = new JToggleButton("버튼4");
	private ButtonGroup bg = new ButtonGroup();
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(1,4, 10,10));
		bg.add(jtb1);bg.add(jtb2);bg.add(jtb3);bg.add(jtb4);
		jtb1.setToolTipText("1번 버튼입니다.");
		jtb1.setRolloverIcon(ii4);
		con.add(jtb1);
		jtb2.setSelectedIcon(ii4);
		con.add(jtb2);
		jtb3.setVerticalTextPosition(SwingConstants.BOTTOM);//TOP, CENTER, BOTTOM
		jtb3.setHorizontalTextPosition(SwingConstants.CENTER);//LEFT, CENTER, RIGHT
		con.add(jtb3);
		con.add(jtb4);
		
		jtb1.setMnemonic('a');//단축키.. alt + a를 누르면 jtb1번이 클릭
		jtb2.setMnemonic('b');
		jtb3.setMnemonic('c');
		jtb4.setMnemonic('d');
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public MyFrame06(String title) {
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

public class Test06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("swing예제");
	}
}
