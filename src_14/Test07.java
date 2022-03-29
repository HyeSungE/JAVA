import java.awt.*;

class MyFrame07 extends Frame{
	
	public MyFrame07(String title) {
		super(title);
		
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}

public class Test07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("frame¿¹Á¦");
	}
}
