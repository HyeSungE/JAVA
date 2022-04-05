import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class MyFrame03 extends Frame implements ActionListener, Runnable, MouseListener{
	private Button start_bt = new Button("Ω√¿€");
	private Button exit_bt = new Button("¡æ∑·");
	private Label time_lb = new Label("Ω√∞£ : 000√ ", Label.CENTER);
	
	private Button[][] bt = new Button[9][9];
	
	private Panel nor_p = new Panel();
	
	private Panel p = new Panel();
	
	private int arr[][] = new int[9][9];
	private boolean check[][] = new boolean[9][9];
	private boolean isEnable = false;
	private int time = 0;
	private boolean isStart=true;
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", nor_p);
		nor_p.setLayout(new GridLayout(1,3));
		nor_p.add(start_bt);	start_bt.addActionListener(this);
		nor_p.add(exit_bt);		exit_bt.addActionListener(this);
		nor_p.add(time_lb);
		this.add("Center", p);
		p.setLayout(new GridLayout(9, 9));
		for(int i=0; i<9; ++i) {
			for (int j=0; j<9; ++j) {
				bt[i][j] = new Button("");
				p.add(bt[i][j]);
				bt[i][j].addMouseListener(this);
			}
		}
	}
	
	public void buttonSetting() {
		start_bt.setEnabled(!isEnable);
		exit_bt.setEnabled(!isEnable);
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				bt[i][j].setEnabled(isEnable);
			}
		}
	}
	
	public MyFrame03(String title) {
		super(title);
		this.init();
		this.boomSetting();
		this.buttonSetting();
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	public void zero(int a, int b) {
		check[a][b] = true;
		int minI = a-1; if (minI<0) minI = 0;
		int maxI = a+1; if (maxI>8) maxI = 8;
		int minJ = b-1; if (minJ<0) minJ = 0;
		int maxJ = b+1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (check[i][j]) continue;
				if (arr[i][j] == 0) zero(i, j);
				else {
					bt[i][j].setLabel(String.valueOf(arr[i][j]));
					check[i][j] = true;
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			isEnable = true;
			isStart=true;
			buttonSetting();
			Thread th = new Thread(this);
			th.start();
			
		}else if (e.getSource()==exit_bt) {
			System.exit(0);
		}
	}
	
	public void numSetting(int a, int b) {
		int minI = a-1; if (minI<0) minI = 0;
		int maxI = a+1; if (maxI>8) maxI = 8;
		int minJ = b-1; if (minJ<0) minJ = 0;
		int maxJ = b+1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (arr[i][j] != 10) arr[i][j]++;
			}
		}
	}
	
	public void boomSetting() {
		for(int i=0; i<10; ++i) {
			int x, y;
			do {
				x = (int)(Math.random()*9);
				y = (int)(Math.random()*9);
			}while(arr[x][y] != 0);
			
			arr[x][y] = 10;
			numSetting(x, y);
		}
	}

	@Override
	public void run() {
		while(isStart) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			time++;
			time_lb.setText("Ω√∞£ : "+time+"√ ");
		}
		
	}
	
	public void Clear() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=0;
				check[i][j]=false;
				System.out.print(arr[i][j]);
				bt[i][j].setLabel("");
			}
		System.out.println("");	
		}
		boomSetting();
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(arr[i][j]+"   ");
			}
		System.out.println("");	
		}
		time=-1;
		isEnable=false;
		buttonSetting();
		time_lb.setText("Ω√∞£ : 0√ ");
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (e.getSource() == bt[i][j]) {
					if (arr[i][j] == 10 && e.getButton()==MouseEvent.BUTTON1) {
						JOptionPane.showMessageDialog(null, "∆¯≈∫¿ª ¥≠∑∂Ω¿¥œ¥Ÿ.");
						isStart=false;
						Clear();
						
					}else if (arr[i][j] == 10 && e.getButton()==MouseEvent.BUTTON3) {
						bt[i][j].setLabel("∆¯≈∫");
						check[i][j] = true;
					}else if (arr[i][j] != 0) {
						bt[i][j].setLabel(String.valueOf(arr[i][j]));
						check[i][j] = true;
					}
					
					else {
						zero(i, j);
					}
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class Test03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("frameøπ¡¶");
	}
}
