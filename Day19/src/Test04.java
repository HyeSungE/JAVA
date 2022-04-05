import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class MyFrame04 extends Frame implements ActionListener, Runnable, MouseListener{
	private Button start_bt = new Button("Ω√¿€");
	private Button exit_bt = new Button("¡æ∑·");
	private Label time_lb = new Label("Ω√∞£ : 000√ ", Label.CENTER);
	
	private Button[][] bt = new Button[9][9];
	
	private Panel nor_p = new Panel();
	
	private Panel p = new Panel();
	
	private int arr[][] = new int[9][9];
	private boolean check[][] = new boolean[9][9];
	private boolean isEnable = false;
	private boolean isGame = true;
	private int time = 0;
	private int count = 0;
	
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
	
	public MyFrame04(String title) {
		super(title);
		this.init();
		this.buttonSetting();
		this.setSize(600,600);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	public void zero(int a, int b) {
		
		check[a][b] = true;
		bt[a][b].setEnabled(false);
		bt[a][b].setLabel("0");
		count++;
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
					if(!check[i][j]) {
						check[i][j] = true;
						count++;
					}
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			time = 0;
			count = 0;
			this.boomSetting();
			isEnable = true;
			buttonSetting();
			isGame = true;
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
	
	public void clearBoom() {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				bt[i][j].setLabel("");
				arr[i][j] = 0;
				check[i][j] = false;
			}
		}
	}

	@Override
	public void run() {
		while(isGame) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			time++;
			time_lb.setText("Ω√∞£ : "+time+"√ ");
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (e.getSource() == bt[i][j]) {
					if (arr[i][j] == 10 && e.getButton()==MouseEvent.BUTTON1) {
						isGame = false;
						JOptionPane.showMessageDialog(null, "∆¯≈∫¿ª ¥©∏£ºÃΩ¿¥œ¥Ÿ.");
						clearBoom();
						isEnable = false;
						buttonSetting();
					}else if (arr[i][j] == 10 && e.getButton()==MouseEvent.BUTTON3) {
						if (check[i][j]) {
							check[i][j] = false;
							bt[i][j].setLabel("");
						}else {
							bt[i][j].setLabel("∆¯≈∫");
							check[i][j] = true;
						}
					}else if (arr[i][j] != 0) {
						bt[i][j].setLabel(String.valueOf(arr[i][j]));
						if(!check[i][j]) {
							check[i][j] = true;
							count++;
						}
					}else {
						zero(i, j);
					}
					if (count==71) {
						isGame = false;
						JOptionPane.showMessageDialog(null, time+"√ ∏∏ø° ≥°≥ªºÃΩ¿¥œ¥Ÿ.");
						clearBoom();
						isEnable = false;
						buttonSetting();
					}
				}
			}
		}
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

public class Test04{
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frameøπ¡¶");
	}
}
