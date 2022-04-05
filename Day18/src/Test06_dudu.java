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

class MyFrame06 extends Frame implements ActionListener, Runnable{
	//Thread를 상속받은 객체를 만드는 것이 아닌 인터페이스를 상속
	private MyImageButton06 mib[] = new MyImageButton06[9];
	
	private Label score_lb = new Label("점수 : 00점", Label.CENTER);
	private Label time_lb = new Label("시간 : 10초", Label.CENTER);
	private Button start_bt = new Button("시작");
	private Button exit_bt = new Button("종료");
	
	private Image img1 = Toolkit.getDefaultToolkit().getImage("img/dudu.png");
	private Image img2 = Toolkit.getDefaultToolkit().getImage("img/du.png");
	
	private Panel p = new Panel();
	private Panel east_p = new Panel();
	
	private boolean isEnable = false;
	private int co = 0;
	private int ransu;
	private int time = 10;
	
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
		east_p.setLayout(new GridLayout(4, 1));
		east_p.add(score_lb);
		east_p.add(time_lb);
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
			time = 10;
			score_lb.setText("점수 : 0"+co+"점");
			time_lb.setText("시간 : "+time+"초");
			isEnable = true;
			buttonSetting();
			Thread th = new Thread(this);
			th.start();
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
							score_lb.setText("점수 : 0"+co+"점");
						}else {
							score_lb.setText("점수 : "+co+"점");
						}
						dudu();
					}
				}
			}
		}
		
	}

	public void buttonClear() {
		for(int i=0; i<mib.length; ++i) {
			mib[i].setImg(img1);
		}
	}
	
	@Override
	public void run() {
		while(time>0) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			time--;
			time_lb.setText("시간 : 0"+time+"초");
		}
		isEnable = false;
		buttonSetting();
		buttonClear();
	}
}

public class Test06_dudu {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("frame예제");
	}
}
