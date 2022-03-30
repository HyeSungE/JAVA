import java.awt.*;
import java.util.*;


class MyFrame07 extends Frame{
	private FileDialog fdig=new FileDialog(this,"저 장",FileDialog.SAVE);
										//열기는 LOAD
	
	public void init() {
		
		
	}
	
	public MyFrame07(String title) {
		super(title);
		init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		fdig.setVisible(true);
	}
}
public class Test07 {

	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("frame예제");
	}

}
