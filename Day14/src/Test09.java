import java.awt.*;
class MyFrame09 extends Frame{
	//private Label lb=new Label("화면에 텍스트값을 출력시킬 때 사용하는 컴포넌트 클래스입니다.");
	//private Label lb=new Label("화면에 텍스트값을 출력시킬 때 .....",Label.RIGHT);
	private Label lb=new Label("화면에 텍스트값을 출력시킬 때 .....",Label.CENTER);
	public MyFrame09(String title) {
		super(title);
		
		this.add(lb);//Label lb
		this.setSize(400,300);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
public class Test09 {
	public static void main(String[] args) {
		MyFrame09 mf=new MyFrame09("frmae예제");

	}

}
