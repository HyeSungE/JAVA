import java.awt.*;
class MyFrame08 extends Frame{
	public MyFrame08(String title) {
		super(title);
		
		this.setSize(400,300);
		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
		
	}
}
public class Test08 {
	public static void main(String[] args) {
		MyFrame08 mf=new MyFrame08("frmae¿¹Á¦");

	}

}
