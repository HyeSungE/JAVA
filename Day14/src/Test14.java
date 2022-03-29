import java.awt.*;
class MyFrame14 extends Frame{
	
	private Label lb=new Label("계산기예제",Label.CENTER);
	private Button bt[]=new Button[16];
	private String str[]=new String[] {"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"};
	private BorderLayout bl=new BorderLayout();
	private Panel pl=new Panel();
	private GridLayout pl_gl=new GridLayout(4,4);
	
	public void init() {
		this.setLayout(bl);
		this.add("North",lb);
		this.add("Center",pl);
		pl.setLayout(pl_gl);
	
	
		for(int i=0;i<bt.length;i++) {
		//패턴이없으면 패턴을 만들어주기
			bt[i]=new Button(str[i]);
			pl.add(bt[i]);
		}
	}
	
	public MyFrame14(String title) {
		
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
public class Test14 {
	public static void main(String[] args) {
		MyFrame14 mf=new MyFrame14("frmae예제");

	}

}
