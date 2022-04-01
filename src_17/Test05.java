import java.awt.*;
import java.awt.event.*;

class MyImageButton05 extends Button{
	private Image img;
	public MyImageButton05(Image img) {
		this.img = img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
}
class MyFrame05 extends Frame implements ActionListener{
	Image img = Toolkit.getDefaultToolkit().getImage("img/fastrcp.gif");
	MyImageButton05 mib = new MyImageButton05(img);
	private Button bt1 = new Button("����");
	private Button bt2 = new Button("����");
	private Button bt3 = new Button("��");
	private Button bt4 = new Button("����");
	private Button bt5 = new Button("����");
	private Label msg_lb = new Label("���������� ��ư�� �����ּ���");
	
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", mib);
		this.add("South", msg_lb);
		this.add("East", p);
		p.setPreferredSize(new Dimension(100,300));
		p.setLayout(new GridLayout(5,1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2);	bt2.addActionListener(this);
		p.add(bt3);	bt3.addActionListener(this);
		p.add(bt4);	bt4.addActionListener(this);
		p.add(bt5);	bt5.addActionListener(this);
	}
	
	public MyFrame05(String title) {
		super(title);
		this.init();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int ransu = (int)(Math.random()*3) + 1;
		Image img2 = null;
		switch(ransu) {
		case 1 : img2 = Toolkit.getDefaultToolkit().getImage("img/c.jpg"); break;
		case 2 : img2 = Toolkit.getDefaultToolkit().getImage("img/r.jpg"); break;
		case 3 : img2 = Toolkit.getDefaultToolkit().getImage("img/p.jpg"); break;
		}
		mib.setImg(img2);
		if (e.getSource()==bt1) {
			if (ransu==1) {
				msg_lb.setText("�����ϴ�.");
			}else if (ransu==2) {
				msg_lb.setText("��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				msg_lb.setText("����� �̰���ϴ�.");
			}
		}else if (e.getSource()==bt2) {
			if (ransu==2) {
				msg_lb.setText("�����ϴ�.");
			}else if (ransu==3) {
				msg_lb.setText("��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				msg_lb.setText("����� �̰���ϴ�.");
			}
		}else if (e.getSource()==bt3) {
			if (ransu==3) {
				msg_lb.setText("�����ϴ�.");
			}else if (ransu==1) {
				msg_lb.setText("��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				msg_lb.setText("����� �̰���ϴ�.");
			}
		}else if (e.getSource()==bt4) {
			mib.setImg(img);
		}else if (e.getSource()==bt5) {
			System.exit(0);
		}
		mib.repaint();
	}
}

public class Test05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("frame����");
	}
}
