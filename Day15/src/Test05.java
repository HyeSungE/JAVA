import java.awt.*;

class MyFrame05 extends Frame{
	private Label lb = new Label("제목 : ", Label.RIGHT);
	private TextField tf = new TextField();
	private TextArea ta = new TextArea();
	private Button bt = new Button("확인");
	
	private Panel nor_p = new Panel();
	private Panel sou_p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", nor_p);
		nor_p.setLayout(new BorderLayout());
		nor_p.add("West", lb);
		nor_p.add("Center", tf);
		this.add("Center", ta);
		this.add("South", sou_p);
		sou_p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		sou_p.add(bt);
	}
	
	public MyFrame05(String title) {
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

public class Test05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("frame예제");
	}
}
