import java.awt.*;
import java.util.*;


class MyFrame06 extends Frame{
	private Dialog dig=new Dialog(this, "경고 ! ",true);
	private Label lb=new Label("경고입니다",Label.CENTER);
	public void init() {
		dig.setLayout(new BorderLayout());
		dig.add("Center",lb);
		
	}
	
	public MyFrame06(String title) {
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
		/*
		* dig.setSize(300,150);
		* dig.setLocation(xpos, ypos);
		*/
		dig.setBounds(xpos, ypos, 300, 150);
		dig.setVisible(true);
		
	}
}
public class Test06 {

	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("frame예제");
	}

}
