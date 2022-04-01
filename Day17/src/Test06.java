import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame06 extends Frame implements ActionListener{
	class gameButton extends Button{
		private Image img;
		public gameButton() {
		}
		public gameButton(Image img) {
			this.img = img;
		}
		public void setImg(Image img) {
			this.img = img;
		}
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
			
	}
	
	private int score=0;
	private boolean start=false;
	private Button start_bt=new Button("시작");
	private Button exit_bt=new Button("종료");
	private Image img;
	
	private Panel East_p = new Panel();
	private Panel Center_p = new Panel();
	private Label lb = new Label("",Label.CENTER);
	private gameButton[] bt =new gameButton[9];
	
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("East",East_p);
	this.add("Center",Center_p);
	
	East_p.setPreferredSize(new Dimension(150,600));
	East_p.setLayout(new GridLayout(3,1));
	
	East_p.add(lb);
	East_p.add(start_bt); start_bt.addActionListener(this);
	East_p.add(exit_bt); exit_bt.addActionListener(this);
	
	Center_p.setLayout(new GridLayout(3,3));
	
	for(int i=0;i<bt.length;i++) {
		bt[i]=new gameButton();
		
		bt[i].addActionListener(this);
		Center_p.add(bt[i]);
	}
	
	}
	
	public MyFrame06(String title) {
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

	@Override
	public void actionPerformed(ActionEvent e) {
	Image img = Toolkit.getDefaultToolkit().getImage("두더지.jpg");
	
		if(e.getSource()==start_bt) {
			int pos=((int)(Math.random()*9));
			System.out.println(pos);
			bt[pos].setEnabled(true);
			System.out.println(pos);
			bt[pos].setImg(img);
			if(e.getSource()==bt[pos]) {
				img = Toolkit.getDefaultToolkit().getImage("흰색.png");
				bt[pos].setImg(img);
				System.out.println(pos+1);
			}
		}
			
			//bt[i].setImg(img);
			//bt[i].setEnabled(false);
			}
	}
	
	
	
public class Test06 {

	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("frame예제");
	}

}

