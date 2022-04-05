import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame01 extends Frame implements ActionListener{
	
	private Panel Ep=new Panel();
	private Panel Cp=new Panel();
	private Button n[]=new Button[9];
	private Button start_bt = new Button("시작");
	private Button exit_bt = new Button("종료");
	private Label score_L=new Label("점수 : 0");
	private Label time_L=new Label("시간  : 10");
	private int[] arr=new int[9];
	private boolean isStart=false;
	private int time=10;
	private int score=0;
	private int j=1;
	
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("East",Ep);
	Ep.setLayout(new GridLayout(4,1));
	this.add("Center",Cp);
	Cp.setLayout(new GridLayout(3,3));
	
	Ep.setPreferredSize(new Dimension(100,450));
	Ep.add(score_L); Ep.add(time_L); Ep.add(start_bt); Ep.add(exit_bt);
	start_bt.addActionListener(this); exit_bt.addActionListener(this);
	
	Random();
	
	for(int i=0;i<arr.length;i++) {
		n[i]=new Button();
		n[i].setLabel(Integer.toString(arr[i]));
		n[i].setEnabled(isStart);
		n[i].addActionListener(this);
		Cp.add(n[i]);	
		}
	
	}

	
	
	public MyFrame01(String title) {
		super(title);
		init();
		this.setSize(450,450);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit_bt) {
			System.exit(0);
		}
		if(e.getSource()==start_bt) {
			isStart=true;
			gameSetting();
		}
		else {
			for(int i=0;i<n.length;i++) {
				if(e.getSource()==n[i]) {
					if(j==Integer.valueOf(n[i].getLabel())) {
						score++;
						j++;
						n[i].setEnabled(false);
					}
				}
			}
		}
		
	}
	public void gameSetting() {
		Random();
		for(int i=0;i<n.length;i++) {
			n[i].setEnabled(isStart);
			n[i].setLabel(Integer.toString(arr[i]));
		}
		score=0; time=10; j=1;
		score_L=new Label("점수 : 0"); time_L=new Label("시간  : 10");
	}
	
	public void Random() {
		for(int i=0;i<n.length;i++) {
			int randomN=(int)(Math.random()*9)+1;
			arr[i]=randomN;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;break;
				}
			}
		}
	}
	
	
	
	
	
}
public class Test01 {

	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("frame예제");
		mf.Random();
	}

}
