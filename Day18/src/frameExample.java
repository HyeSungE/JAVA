import java.awt.*;
import java.util.*;
import javax.swing.*;


class MyFrame extends Frame{

	public void init() {
	

	}
	
	public MyFrame(String title) {
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
public class {

	public static void main(String[] args) {
		MyFrame mf = new MyFrame("frame¿¹Á¦");
	}

}
