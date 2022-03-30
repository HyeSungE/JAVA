import java.awt.*;
import java.util.*;

class MyFrame01 extends Frame{
	private Calendar cal;
	private Label lb = new Label("", Label.CENTER);
	private Label[] week_lb = new Label[7];
	private String[] str = new String[] {"일","월","화","수","목","금","토"};
	private Button[] day_bt = new Button[42];
	
	private BorderLayout bl = new BorderLayout();
	private Panel p = new Panel();
	private GridLayout p_gl = new GridLayout(7, 7);
	
	public void init(int year, int month) {
		this.setLayout(bl);
		lb.setText(year+"년 " + month + "월");
		lb.setFont(new Font("", Font.BOLD, 30));
		this.add("North", lb);
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
	
	public MyFrame01(String title, int year, int month) {
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

public class Test01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = in.nextInt();
		System.out.print("월 : ");
		int month = in.nextInt();
		MyFrame01 mf = new MyFrame01("달력예제", year, month);
	}
}











