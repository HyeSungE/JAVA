import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyFrame04 extends Frame implements ActionListener{
	private Calendar cal = Calendar.getInstance();
	private Label lb = new Label("", Label.CENTER);
	private Button left_bt = new Button(" ◀ ");
	private Button right_bt = new Button(" ▶ ");
	private Label[] week_lb = new Label[7];
	private String[] str = new String[] {"일","월","화","수","목","금","토"};
	private Button[] day_bt = new Button[42];
		
	private BorderLayout bl = new BorderLayout();
	private Panel nor_p = new Panel();
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(7, 7);
	
	private int year, month;
	
	public void init() {
		this.setLayout(bl);
				
		lb.setText(year+"년 " + month + "월");
		lb.setFont(new Font("", Font.BOLD, 30));
		this.add("North", nor_p);
		nor_p.setLayout(new BorderLayout());
		nor_p.add("West", left_bt);	
		left_bt.addActionListener(this);
		nor_p.add("Center", lb);
		nor_p.add("East", right_bt);
		right_bt.addActionListener(this);
		this.add("Center", p);
		
		p.setLayout(p_gl);
		for(int i=0; i<week_lb.length; ++i) {
			week_lb[i] = new Label(str[i], Label.CENTER);
			p.add(week_lb[i]);
		}
		for(int i=0; i<day_bt.length; ++i) {
			day_bt[i] = new Button("");
			p.add(day_bt[i]);
		}
		buttonSetting();
	}
	
	public MyFrame04(String title) {
		super(title);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		cal.set(Calendar.DAY_OF_MONTH, 1);
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
		if (e.getSource()==left_bt) {
			month--;
			if (month<1) {
				month = 12;
				year--;
			}
		}else if (e.getSource()==right_bt) {
			month++;
			if (month>12) {
				month = 1;
				year++;
			}
		}
		lb.setText(year+"년 " + month + "월");
		cal.set(year, month-1, 1);
		buttonSetting();
	}
	public void buttonSetting() {
		for(int i=0; i<day_bt.length; ++i) {
			day_bt[i].setLabel("");
			day_bt[i].setEnabled(true);
		}
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		int co = 0;	
		for(int i=1; i<week; ++i) {
			day_bt[co].setLabel("");
			day_bt[co].setEnabled(false);
			co++;
		}
		for(int i=1; i<=lastDay; ++i) {
			day_bt[co].setLabel(String.valueOf(i));
			co++;
		}
		for ( ; co<day_bt.length; ++co) {
			day_bt[co].setLabel("");
			day_bt[co].setEnabled(false);
		}
	}
}

public class Test04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("달력예제");
	}
}