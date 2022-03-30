import java.awt.*;
import java.util.*;


class MyFrame04_Teacher extends Frame{
	
	private Label lb = new Label("당신의 생년월일은?");
	private Choice year_ch = new Choice();
	private Label year_lb = new Label("년", Label.LEFT);
	private Choice month_ch = new Choice();
	private Label month_lb = new Label("월", Label.LEFT);
	private Choice day_ch = new Choice();
	private Label day_lb = new Label("일", Label.LEFT);
	
	private Panel p = new Panel();
	private Panel year_p = new Panel();
	private Panel month_p = new Panel();
	private Panel day_p = new Panel();
	
	public void init() {
		for(int i=2022; i>=1950; --i) {
			year_ch.add(String.valueOf(i));
		}
		for(int i=1; i<=12; ++i) {
			month_ch.add(String.valueOf(i));
		}
		for(int i=1; i<=31; ++i) {
			day_ch.add(String.valueOf(i));
		}
		this.setLayout(new GridLayout(2, 1));
		this.add(lb);
		this.add(p);
		p.setLayout(new GridLayout(1, 3));
		p.add(year_p);
		year_p.setLayout(new BorderLayout());
		year_p.add(year_ch);
		year_p.add("East", year_lb);
		p.add(month_p);
		month_p.setLayout(new BorderLayout());
		month_p.add(month_ch);
		month_p.add("East", month_lb);
		p.add(day_p);
		day_p.setLayout(new BorderLayout());
		day_p.add(day_ch);
		day_p.add("East", day_lb);
	}
	
	public MyFrame04_Teacher(String title) {
		super(title);
		init();
		this.setSize(400,150);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
public class Test04_Teacher {

	public static void main(String[] args) {
		MyFrame04_Teacher mf = new MyFrame04_Teacher("frame예제");
	}

}
