import java.awt.*;
class MyFrame10 extends Frame{
	private Button bt1=new Button("��ư�̴�!!");
	private Button bt2=new Button("��ư�̴�!!2");
	
	public MyFrame10(String title) {
		
		super(title);
		this.add(bt1);
		this.add(bt2);//default : ��ư1���� ��ư2�� ��� ��ư2�� ���δ�.
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
		MyFrame10 mf=new MyFrame10("frmae����");

	}

}
