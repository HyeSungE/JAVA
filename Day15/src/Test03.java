import java.awt.*;

class MyFrame03 extends Frame{
	private Label lb = new Label("����� ��������?");
	private Choice ch = new Choice();
	
	public void init() {
		this.setLayout(new GridLayout(2, 1));
		this.add(lb);
		this.add(ch);
		ch.add("A��");
		ch.add("B��");
		ch.add("AB��");
		ch.add("O��");
		ch.add("�׿�");
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
		MyFrame03 mf = new MyFrame03("choice����");
	}
}
