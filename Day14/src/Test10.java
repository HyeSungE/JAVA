import java.awt.*;
class MyFrame10 extends Frame{
	private Button bt1=new Button("버튼이다!!");
	private Button bt2=new Button("버튼이다!!2");
	
	public MyFrame10(String title) {
		
		super(title);
		this.add(bt1);
		this.add(bt2);//default : 버튼1위에 버튼2가 덮어서 버튼2만 보인다.
		this.setSize(400,300);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
public class Test10 {
	public static void main(String[] args) {
		MyFrame10 mf=new MyFrame10("frmae예제");

	}

}
