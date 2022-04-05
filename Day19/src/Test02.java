import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame02 extends Frame implements ActionListener{
	private Button bt[][]=new Button[9][9];
	private Panel Cp=new Panel();
	private Panel Np=new Panel();
	private Button start_bt=new Button("√");
	private Button exit_bt=new Button("Exit");
	private int arr[][]=new int[9][9];
	private int co=0;
	private boolean check[][]=new boolean[9][9];
	
	public void init() {
	this.setLayout(new BorderLayout());
	this.add("Center",Cp);
	Np.setLayout(new FlowLayout());
	this.add("North",Np);
	
	Np.add(new Label("게임시작"));
	start_bt.addActionListener(this);
	Np.add(start_bt);
	start_bt.setPreferredSize(new Dimension(50,50));
	start_bt.setFont(new Font("",Font.BOLD,20));
	
	Np.add(new Label("게임종료"));
	exit_bt.addActionListener(this);
	Np.add(exit_bt);
	exit_bt.setPreferredSize(new Dimension(50,50));
	exit_bt.setFont(new Font("",Font.BOLD,20));
	
	Cp.setLayout(new GridLayout(9,9));
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
		bt[i][j]=new Button();	
		bt[i][j].addActionListener(this);
		bt[i][j].setEnabled(false);
		Cp.add(bt[i][j]);	
			}
		}
	}	
	
	public MyFrame02(String title) {
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
		if(e.getSource()==exit_bt) {
			System.exit(0);
		}
		else if(e.getSource()==start_bt){
			arrSetting();
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					bt[i][j].setEnabled(true);
				}
			}
		}
		else {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					if(e.getSource()==bt[i][j]) {
						if(arr[i][j]==10) {
							bt[i][j].setLabel(String.valueOf("폭탄"));
							check[i][j]=true;
						}
						
						else if(arr[i][j]==0) {
							ZeroSetting(i,j);
							check[i][j]=true;
							
						}else if(arr[i][j]!=0) {
							bt[i][j].setLabel(String.valueOf(arr[i][j]));
						}
					}
				}
			}
		}
	}
	
	public void boomSetting(int i, int j) {
		int minI=i-1; if(minI<0) minI=0;
		int maxI=i+1; if(maxI>8) minI=8;
		int minJ=j-1; if(minJ<0) minJ=0;
		int maxJ=j+1; if(minJ>8) minJ=8; 
		
		for(int a=minI; a<=maxI; a++) {
			for(int b=minJ; b<=maxJ;b++) {
				if(arr[a][b]!=10) arr[a][b]++;
			}
		}
	}
	public void arrSetting() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=0;
			}
		}
		
		while(true) {
			int row=(int)(Math.random()*8);
			int col=(int)(Math.random()*8);
			
			if(arr[row][col]==10) {
				continue;
			}
			
			arr[row][col]=10;
			boomSetting(row,col);
			co++;
			if(co==10) break;
			}
	}
	public void ZeroSetting(int i, int j) {
		int minI=i-1; if(minI<0) minI=0;
		int maxI=i+1; if(maxI>8) minI=8;
		int minJ=j-1; if(minJ<0) minJ=0;
		int maxJ=j+1; if(minJ>8) minJ=8; 
		
		for(int a=minI; a<=maxI; a++) {
			for(int b=minJ; b<=maxJ;b++) {
				if(check[a][b]) continue;
				if(arr[a][b]==0) ZeroSetting(a,b);
				else {
					bt[a][b].setLabel(String.valueOf(arr[a][b]));
					check[a][b] = true;
				}
				
			}
		}
		
	}
	
	
}
public class Test02 {

	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame예제");
	}

}
