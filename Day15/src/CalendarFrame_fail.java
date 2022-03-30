import java.awt.*;
import java.util.*;

class CalendarFrame_fail extends Frame {
	private Label lb;
	private Label week_print=new Label("일\t월\t화\t수\t목\t금\t토");
	private Button bt[]=new Button[35];
	
	private BorderLayout bl=new BorderLayout();
	private Panel pl_North=new Panel();
	private GridLayout pl_gl_North=new GridLayout(2,1);
	
	private Panel pl_Center=new Panel();
	private GridLayout pl_gl_Center=new GridLayout(5,7);
	
	private int year;
	private int month;
	
	public void setYear(int year) {
		this.year=year;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	
	public void init() {
		Calendar cal=Calendar.getInstance();
		cal.set(year,month-1,1);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		lb=new Label("1");
		this.setLayout(bl);
		
		this.add("North",pl_North);
		this.add("Center",pl_Center);
		pl_North.setLayout(pl_gl_North);
		pl_North.add(lb);
		pl_North.add(week_print);
		pl_Center.setLayout(pl_gl_Center);
		
		for(int i=1;i<week;i++) {
			System.out.print(" ");
		}
		
		for(int i=0;i<lastday;i++) {
			bt[i]=new Button(String.valueOf(i+1));
			pl_Center.add(bt[i]);
		}
		
	}
	public CalendarFrame_fail(String title) {
		super(title);
		this.setSize(400,300);
		
		init();		
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getWidth()/2)-this.getWidth()/2;
		int ypos=(int)(screen.getHeight()/2)-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
}
