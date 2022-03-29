import java.awt.*;

class MyFrame11 extends Frame{
	private Label lb = new Label("전화기 예제", Label.CENTER);
	private Button bt[] = new Button[12];
	private String str[] = new String[] {"*", "0", "#"};
	
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(4,3);
	
	public void init() {
		this.setLayout(bl);
		this.add("North", lb);
		this.add("Center", p);
		
		p.setLayout(p_gl);
		for(int i=0; i<bt.length; ++i) {
			if (i>=9) {
				bt[i] = new Button(str[i-9]);
			}else {
				bt[i] = new Button(String.valueOf(i+1));
			}
			p.add(bt[i]);
		}
	}
	
	public MyFrame11(String title) {
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

public class Test11 {
	public static void main(String[] args) {
		MyFrame11 mf = new MyFrame11("frame예제");
	}
}