import java.awt.*;
import java.awt.event.*;
class MyImageButton06 extends Button{
	private Image img;
	public MyImageButton06(Image img) {
		this.img = img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
}

class MyFrame06 extends Frame implements ActionListener{
	private MyImageButton06 mib[] = new MyImageButton06[9];
	
	private Label lb = new Label("점수 : 00점", Label.CENTER);
	private Button start_bt = new Button("시작");
	private Button exit_bt = new Button("종료");
	
	private Image img1 = Toolkit.getDefaultToolkit().getImage("img/dudu.png");
	private Image img2 = Toolkit.getDefaultToolkit().getImage("img/du.png");
	
	private Panel p = new Panel();
	private Panel east_p = new Panel();
	
	private boolean isEnable = false;
	private int co = 0;
	private int ransu;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", p);
		p.setLayout(new GridLayout(3, 3));
		for(int i=0; i<mib.length; ++i) {
			mib[i] = new MyImageButton06(img1);
			mib[i].addActionListener(this);
			p.add(mib[i]);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3, 1));
		east_p.add(lb);
		east_p.add(start_bt);	start_bt.addActionListener(this);
		east_p.add(exit_bt);	exit_bt.addActionListener(this);
		buttonSetting();
	}
	
	public void buttonSetting() {
		start_bt.setEnabled(!isEnable);
		exit_bt.setEnabled(!isEnable);
		for(int i=0; i<mib.length; ++i) {
			mib[i].setEnabled(isEnable);
		}
	}
	
	public MyFrame06(String title) {
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
	
	public void dudu() {
		ransu = (int)(Math.random()*9);
		mib[ransu].setImg(img2);
		mib[ransu].repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			co = 0;
			isEnable = true;
			buttonSetting();
			dudu();
		}else if (e.getSource()==exit_bt) {
			System.exit(0);
		}else {
			for(int i=0; i<mib.length; ++i) {
				if (e.getSource()==mib[i]) {
					if (ransu == i) {
						mib[i].setImg(img1);
						mib[i].repaint();
						co++;
						if (co<10) {
							lb.setText("점수 : 0"+co+"점");
						}else {
							lb.setText("점수 : "+co+"점");
						}
						if (co>10) {
							isEnable = false;
							buttonSetting();
							return;
						}						
						dudu();
					}
				}
			}
		}
		
	}
}

public class Test06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("frame예제");
	}
}
