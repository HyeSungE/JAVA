import java.awt.*;
import java.util.*;
import java.awt.event.*;
class MyFrame04_1 extends Frame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == m_bt) {
			if(month<2) {
				year--;
				month=12;
			}
			else{
				month--;
			}
			lb.setText(year+"년 " + month + "월");
			cal.set(year, month-1, 1);
			
			
		}else if (e.getSource() == p_bt) {
			if(month>13) {
				year++;
				month=1;
			}
			else{
				month++;
			}
			lb.setText(year+"년 " + month + "월");
			cal.set(year, month-1, 1);
			
		}
		
	}
	
	private Calendar cal;
	private Label lb = new Label("", Label.CENTER);
	private Label[] week_lb = new Label[7];
	private String[] str = new String[] {"일","월","화","수","목","금","토"};
	private Button[] day_bt = new Button[42];
	private Button m_bt=new Button("◀");
	private Button p_bt=new Button("▶");
	
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private Panel p2 = new Panel();
	private GridLayout p_gl = new GridLayout(7, 7);
	
	int year,month;
	public void init(int year, int month) {
		this.year=year;
		this.month=month;
		
		this.setLayout(bl);
		lb.setText(year+"년 " + month + "월");
		lb.setFont(new Font("", Font.BOLD, 30));
		this.add("North", p2);
		p2.setLayout(new BorderLayout());
		p2.add("West",m_bt); m_bt.addActionListener(this);
		p2.add("Center",lb);
		p2.add("East",p_bt); p_bt.addActionListener(this);
		this.add("Center", p);
		
		p.setLayout(p_gl);
		for(int i=0; i<week_lb.length; ++i) {
			week_lb[i] = new Label(str[i], Label.CENTER);
			p.add(week_lb[i]);
		}
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int co = 0;
		
		for(int i=1; i<week; ++i) {
			day_bt[co] = new Button("");
			p.add(day_bt[co]);
			co++;
		}
		for(int i=1; i<=lastDay; ++i) {
			day_bt[co] = new Button(String.valueOf(i));
			p.add(day_bt[co]);
			co++;
		}
		for(int i=co; i<day_bt.length; ++i) {
			day_bt[co] = new Button("");
			p.add(day_bt[co]);
			co++;
		}
		
	}
	
	public MyFrame04_1(String title, int year, int month) {
		super(title);
		
		cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		init(year, month);
		
		this.setSize(400,300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	
}

public class Test04_Calendar_need_revise {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = in.nextInt();
		System.out.print("월 : ");
		int month = in.nextInt();
		MyFrame04_1 mf = new MyFrame04_1("달력예제", year, month);
	}
}











