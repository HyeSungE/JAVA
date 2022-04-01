import java.awt.*;
import java.awt.event.*;
class MyImage02 extends Canvas{
	private Image img;
	private int x;
	private int y;
	
	public void plus(){
		x += 50;
		if (x>400) {
			x = 400;
		}else {
			y += 50;
		}
	}
	public void minus() {
		x -= 50;
		if (x<50) {
			x = 50;
		}else {
			y -= 50;
		}
	}
	public void ori() {
		x = 200;
		y = 200;
	}
	
	public MyImage02() {
		img = Toolkit.getDefaultToolkit().getImage("K-050.jpg");
		x = 200;
		y = 200;
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 50, 50, x, y, this);
	}
}

class MyFrame02 extends Frame implements ActionListener{
	private Button bt1 = new Button("확대");
	private Button bt2 = new Button("축소");
	private Button bt3 = new Button("원본");
	private Button bt4 = new Button("종료");
	
	private MyImage02 mi = new MyImage02();
	
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", mi);
		this.add("East", p);
		p.setPreferredSize(new Dimension(150,600));
		p.setLayout(new GridLayout(4,1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2);	bt2.addActionListener(this);
		p.add(bt3);	bt3.addActionListener(this);
		p.add(bt4);	bt4.addActionListener(this);
	}
	
	public MyFrame02(String title) {
		super(title);
		this.init();
		this.setSize(800,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bt1) {
			mi.plus();
		}else if (e.getSource()==bt2) {
			mi.minus();
		}else if (e.getSource()==bt3) {
			mi.ori();
		}else if (e.getSource()==bt4) {
			System.exit(0);
		}
		mi.repaint();
	}
}

public class Test02 {
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame예제");
	}
}
