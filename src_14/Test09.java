import java.awt.*;

class MyFrame09 extends Frame{
	private Button bt1 = new Button("버튼이다1!");
	private Button bt2 = new Button("버튼이다2!");
	private Button bt3 = new Button("버튼이다3!");
	private Button bt4 = new Button("버튼이다4!");
	private Button bt5 = new Button("버튼이다5!");
	private Button bt6 = new Button("버튼이다6!");
	
	//private FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
	//private GridLayout gl = new GridLayout(3,2, 5, 10);
	private BorderLayout bl = new BorderLayout(5, 10);
	
	public MyFrame09(String title) {
		super(title);
		
		//this.setLayout(fl);
		this.setLayout(bl);
		this.add("North", bt1);
		//this.add("South", bt2);
		//this.add("East", bt3);
		this.add("West", bt4);
		this.add("Center", bt5);
		//this.add(bt6);
		
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
