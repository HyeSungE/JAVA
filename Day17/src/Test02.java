import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class MyImage02 extends Canvas{
	private Image img;
	private int width,height;
	
	public void plus() {
		width+=50;
		if(width >=400) {
			width=400;
		}
		else {
			height+=50;
		}
	}
	public void minus() {
		width-=50;
		if(width<=50) {
			width=50;
		}
		else {
			height-=50;
		}
	}
	public void re() {
		width=200;
		height=200;
	}
	public MyImage02() {
		img=Toolkit.getDefaultToolkit().getImage("K-050.jpg");
		width=200;
		height=200;
	}
	
	public void paint(Graphics g)  {
		g.drawImage(img, 200, 200, width, height, this);
	}
	
}
class MyFrame02 extends Frame implements ActionListener{

	private Panel p=new Panel();
	private Button[] bt=new Button[4];
	private String[] str=new String[] {"확대","축소","원본","종료"};
	
	private MyImage02 mi=new MyImage02();
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==bt[0]) {
			mi.plus();
		}else if(e.getSource()==bt[1]) {
			mi.minus();
		}else if(e.getSource()==bt[2]) {
			mi.re();
		}else if(e.getSource()==bt[3]) {
			System.exit(0);
		}
		mi.repaint();	//paint()를 다시 호출해서 작업!!!!!!!
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("East",p);
		p.setPreferredSize(new Dimension(300,600));
		p.setLayout(new GridLayout(4,1));
		for(int i=0;i<bt.length;i++) {
			bt[i]=new Button("");
			bt[i].setLabel(str[i]);
			p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		this.add("Center",mi);
	}
	
	
	
	
	public MyFrame02(String title) {
		super(title);
		init();
		this.setSize(800,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	
}
public class Test02 {

	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame예제");
	}

}
