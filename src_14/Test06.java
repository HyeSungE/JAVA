import java.awt.*;

public class Test06 {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		f1.setVisible(true);
		f1.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - f1.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - f1.getHeight()/2;
		f1.setLocation(xpos, ypos);
		f1.setResizable(false);
		//System.out.println("가로길이 : " + screen.getWidth());
		//System.out.println("세로길이 : " + screen.getHeight());
		//f1.setLocation(300, 300);
		/*
		Frame f2 = new Frame("title");
		f2.setVisible(true);
		f2.setSize(400,300);
		f2.setLocation(500,500);
		*/
	}
}
