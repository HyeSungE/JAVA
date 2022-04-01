import java.awt.*;
import java.util.*;
import javax.swing.*;

class MyImageButton extends Button{
	Image img=Toolkit.getDefaultToolkit().getImage("K-050.jpg");
	public void paint(Graphics g) {
		g.drawImage(img,5,5,100,100,this);

	}
}
class MyFrame03 extends Frame{

	//private Button bt = new Button("확인");
	private MyImageButton bt=new MyImageButton();
	public void init() {
		this.setLayout(new BorderLayout());
		this.add(bt);
		
	}
	
	public MyFrame03(String title) {
		super(title);
		init();
		this.setSize(450,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
public class Test03 {

	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("frame예제");
	}

}
