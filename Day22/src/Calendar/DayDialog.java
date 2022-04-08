package Calendar;

import java.awt.*;

import javax.swing.JFrame;

public class DayDialog extends Dialog{
	private Label title = new Label("",Label.CENTER);
	private TextArea ta = new TextArea();
	Button save_bt = new Button("저장");
	Button can_bt = new Button("취소");
	private Panel p = new Panel();
	public void set_titleL(String str) {
		this.title.setFont(new Font("",Font.BOLD,20));
		this.title.setText(str);
	}
	public void set_ta(String str) {
		this.ta.setText(str);
	}
	public String get_ta() {
		return this.ta.getText();
	}
	public String get_ti() {
		return this.title.getText();
	}
	public void init() {
		this.add("North",title);
		this.add("Center",ta);
		p.setLayout(new FlowLayout());
		p.add(save_bt); 
		p.add(can_bt);
		this.add("South",p);
		
	}
	
	public  DayDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init();
		this.setSize(250, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(false);
	}
}
