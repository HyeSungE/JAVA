package Student_Score;

import java.awt.*;

public class MyInputDialog extends Dialog{
	private Label title_lb = new Label("회 원 입 력", Label.CENTER);
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label kor_lb = new Label("국어점수 : ", Label.RIGHT);
	private TextField kor_tf = new TextField();
	private Label eng_lb = new Label("영어점수 : ", Label.RIGHT);
	private TextField eng_tf = new TextField();
	Button ok_bt = new Button("저장");
	Button cen_bt = new Button("취소");
	
	private Panel cen_p = new Panel();
	private Panel lb_p = new Panel();
	private Panel ta_p = new Panel();
	private Panel button_p = new Panel();
	
	public String getName() {
		return name_tf.getText();
	}
	public int getKor() {
		return Integer.parseInt(kor_tf.getText());
	}
	public int getEng() {
		return Integer.parseInt(eng_tf.getText());
	}
	public void clearData() {
		name_tf.setText("");
		kor_tf.setText("");
		eng_tf.setText("");
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		title_lb.setFont(new Font("", Font.BOLD, 20));
		this.add("North", title_lb);
		this.add(cen_p);
		cen_p.setLayout(new BorderLayout());
		cen_p.add("West", lb_p);
		cen_p.add("Center", ta_p);
		lb_p.setLayout(new GridLayout(3,1));
		name_lb.setFont(new Font("", Font.PLAIN, 15));
		lb_p.add(name_lb);
		kor_lb.setFont(new Font("", Font.PLAIN, 15));
		lb_p.add(kor_lb);
		eng_lb.setFont(new Font("", Font.PLAIN, 15));
		lb_p.add(eng_lb);
		ta_p.setLayout(new GridLayout(3,1));
		name_tf.setFont(new Font("", Font.PLAIN, 15));
		ta_p.add(name_tf);
		kor_tf.setFont(new Font("", Font.PLAIN, 15));
		ta_p.add(kor_tf);
		eng_tf.setFont(new Font("", Font.PLAIN, 15));
		ta_p.add(eng_tf);
		
		this.add("South", button_p);
		button_p.setLayout(new GridLayout(1,2, 10, 5));
		ok_bt.setFont(new Font("", Font.PLAIN, 15));
		button_p.add(ok_bt);
		cen_bt.setFont(new Font("", Font.PLAIN, 15));
		button_p.add(cen_bt);	
	}
	
	public MyInputDialog(Frame owner, String title, boolean modal) {
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
