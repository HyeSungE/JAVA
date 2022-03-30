import java.awt.*;

class MyFrame03 extends Frame{
	private Label lb = new Label("당신의 혈액형은?");
	private Choice ch = new Choice();
	
	public void init() {
		this.setLayout(new GridLayout(2, 1));
		this.add(lb);
		this.add(ch);
		ch.add("A형");
		ch.add("B형");
		ch.add("AB형");
		ch.add("O형");
		ch.add("그외");
	}
	public MyFrame03(String title) {
		super(title);
		this.init();
		this.setSize(400,150);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}

public class Test03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("choice예제");
	}
}
