import java.awt.*;
class MyFrame11 extends Frame{
	private Button bt1=new Button("버튼이다!!1");
	private Button bt2=new Button("버튼이다!!2");
	private Button bt3=new Button("버튼이다!!3");
	private Button bt4=new Button("버튼이다!!4");
	private Button bt5=new Button("버튼이다!!5");
	private Button bt6=new Button("버튼이다!!6");
	//private FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
	//private GridLayout g1=new GridLayout(3,2);
	//private GridLayout g1=new GridLayout(3,2,5,10);//5 10 은 간격 좌우 상하
	//private BorderLayout b1=new BorderLayout();
	private BorderLayout b1=new BorderLayout(5,10);//좌우 상하 간격

	public MyFrame11(String title) {
		
		super(title);
		//this.setLayout(f1);
		//this.setLayout(g1);
		this.setLayout(b1);
		this.add("North",bt1);
		this.add("South",bt2);
		this.add("East",bt3);
		this.add("West",bt4);
		this.add("Center",bt5);
		
		//this.setLayout(b1);
		/*this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);*/
		this.setSize(400,300);
	
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
public class Test11 {
	public static void main(String[] args) {
		MyFrame11 mf=new MyFrame11("frmae예제");

	}

}
