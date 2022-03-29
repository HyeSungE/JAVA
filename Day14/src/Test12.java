import java.awt.*;
class MyFrame12 extends Frame{
	private Button Num1_bt=new Button("1");
	private Button Num2_bt=new Button("2");
	private Button Num3_bt=new Button("3");
	private Button Num4_bt=new Button("4");
	private Button Num5_bt=new Button("5");
	private Button Num6_bt=new Button("6");
	private Button Num7_bt=new Button("7");
	private Button Num8_bt=new Button("8");
	private Button Num9_bt=new Button("9");
	private Button Star_bt=new Button("*");
	private Button Zero_bt=new Button("0");
	private Button Hash_bt=new Button("#");
	private Label lb=new Label("전화기예제",Label.CENTER);
	
	private BorderLayout b1=new BorderLayout();
	private Panel p1=new Panel();
	private GridLayout p1_g1=new GridLayout(4,3);//1콤마2
	public void init() {
		this.setLayout(b1);
		this.add("North",lb);
		this.add("South",p1);
		p1.setLayout(p1_g1);
		p1.add(Num1_bt);
		p1.add(Num2_bt);
		p1.add(Num3_bt);
		p1.add(Num4_bt);
		p1.add(Num5_bt);
		p1.add(Num6_bt);
		p1.add(Num7_bt);
		p1.add(Num8_bt);
		p1.add(Num9_bt);
		p1.add(Star_bt);
		p1.add(Zero_bt);
		p1.add(Hash_bt);
	}
	
	public MyFrame12(String title) {
		
		super(title);
		this.setSize(400,300);
		
		init();
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
public class Test12 {
	public static void main(String[] args) {
		MyFrame12 mf=new MyFrame12("frmae예제");

	}

}
