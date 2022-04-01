import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;


class MyFrame05 extends Frame implements ActionListener{
	public MyFrame05(String title) {
		super(title);
		init();
		this.setSize(600,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
	
	private Panel p=new Panel();
	private Image img;
	private String[] str = new String[] {"가위.jpg","바위.jpg","보.jpg"};
	private ImageButton[] mib = new ImageButton[3];
	private Button bt2=new Button("종료");
	private Button bt1=new Button("다시")
	class GIF extends Canvas{
		
		public GIF() {
			img=Toolkit.getDefaultToolkit().getImage("가위바위보.gif");
			
		}
		public void paint(Graphics g)  {
			g.drawImage(img, 0, 0, getWidth()-10, getHeight()-10, this);
		}
		
	}
	class ImageButton extends Button {
		private Image img;
		public ImageButton(Image img) {
			this.img = img;
		}
		public void paint(Graphics g) {
			g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
		}
	}
	
	public void init() {

		this.setLayout(new BorderLayout());
		this.add("East",p);
		p.setPreferredSize(new Dimension(250,500));
		p.setLayout(new GridLayout(4,1));
		for(int i=0; i<mib.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage(str[i]);
			mib[i] = new ImageButton(img);
			mib[i].addActionListener(this);
			mib[i].addActionListener(this);
			p.add(mib[i]);
		}
		bt2.addActionListener(this);
		p.add(bt2);
		GIF img_gif = new GIF();
		this.add("Center",img_gif);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt2) {
			System.exit(0);	
		}
		else if(e.getSource()==bt1) {
			
		}
		else {
			if()
		}
		
	}
	

}
public class Test05 {

	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("frame예제");
	}

}
