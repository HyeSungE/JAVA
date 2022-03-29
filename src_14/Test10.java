import java.awt.*;

class MyFrame10 extends Frame{
	private Button yes_bt = new Button("YES");
	private Button no1_bt = new Button("NO1");
	private Button no2_bt = new Button("NO2");
	
	private BorderLayout bl = new BorderLayout();
	private Panel p1 = new Panel();
	private GridLayout p1_gl = new GridLayout(1,2);
	private Panel p2 = new Panel();
	private GridLayout p2_gl = new GridLayout(2,1);
		
	public void init() {
		this.setLayout(bl);
		this.add("South", p1);
		p1.setLayout(p1_gl);
		p1.add(yes_bt);
		p1.add(p2);
		p2.setLayout(p2_gl);
		p2.add(no1_bt);
		p2.add(no2_bt);
	}
	public MyFrame10(String title) {
		super(title);
		
		init();
		
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}

public class Test10 {
	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10("frame¿¹Á¦");
	}
}
