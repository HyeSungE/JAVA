import java.awt.*;
import java.awt.event.*;

class MyImageButton04 extends Button{
	private Image img;
	public MyImageButton04(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
	}
}

class MyFrame04 extends Frame implements ActionListener{
	private MyImageButton04[] mib = new MyImageButton04[2];
	private Label msg_lb = new Label("��ư�� Ŭ���ϼ���!!");
	
	private String[] str = new String[] {"K-010.jpg", "K-050.jpg"};
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new GridLayout(2,1));
		this.add(p);
		p.setLayout(new GridLayout(1,2));
		for(int i=0; i<mib.length; ++i) {
			Image img = Toolkit.getDefaultToolkit().getImage(str[i]);
			mib[i] = new MyImageButton04(img);
			mib[i].addActionListener(this);
			p.add(mib[i]);
		}
		this.add(msg_lb);
	}
	
	public MyFrame04(String title) {
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
		if (e.getSource()==mib[0]) {
			msg_lb.setText("����, �տ��� ��ȥ ����");
		}else if (e.getSource()==mib[1]) {
			msg_lb.setText("�����ټ�, �����ϳ� ��� ����");
		}
		
	}
}

public class Test04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frame����");
	}
}
