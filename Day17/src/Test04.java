import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame04 extends Frame implements ActionListener{
	private Panel ps = new Panel();
	private Panel pc = new Panel();
	private MyImage mi[]=new MyImage[4]; 
	private String[] str=new String[] {"1.jpg","2.jpg","3.jpg","4.jpg"};
	private Image img;
	
	
	class MyImage extends Button{
		
		public MyImage(int i) {
		img=Toolkit.getDefaultToolkit().getImage(str[i]);
		}
		public void paint(Graphics g) {
			g.drawImage(img, 10,10,100,100 ,this);
		}
		
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center",pc);
		this.add("South",new TextArea());
		pc.setPreferredSize(new Dimension(600,50));
		pc.setLayout(new GridLayout(1,4));
		
		
		for(int i=0;i<mi.length;i++) {
			mi[i]=new MyImage(i);
			pc.add(mi[i]);
		}
	}
	
	public MyFrame04(String title) {
		super(title);
		init();
		this.setSize(600,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class Test04 {

	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frame¿¹Á¦");
	}

}
