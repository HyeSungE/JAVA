import java.awt.*;
import java.util.*;


class MyFrame04 extends Frame{
	
	private Label lb=new Label("생년월일을 입력하세요 ",Label.CENTER);
	private Choice ch_year=new Choice();
	private Choice ch_month=new Choice();
	private Choice ch_day=new Choice();
	private Panel p=new Panel();
	public void init() {
		this.setLayout(new GridLayout(2,1));
		lb.setFont(new Font("",Font.BOLD,30));
		this.add(lb);
		this.add(p);
		p.setLayout(new GridLayout(1,6));
		p.add(ch_year);
		p.add(new Label("년"));
		p.add(ch_month);
		p.add(new Label("월"));
		p.add(ch_day);
		p.add(new Label("일"));
		for(int i=1950;i<=2022;i++)
			ch_year.add(String.valueOf(i));
		for(int i=1;i<=12;i++)
			ch_month.add(String.valueOf(i));
		for(int i=1;i<=31;i++)
			ch_day.add(String.valueOf(i));
		
	}
	
	public MyFrame04(String title) {
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
public class Test04 {

	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frame예제");
	}

}
