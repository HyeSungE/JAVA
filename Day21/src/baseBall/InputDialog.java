package baseBall;

import java.awt.*;

public class InputDialog extends Dialog{
	private Label title_lb = new Label("�� �� �� ��", Label.CENTER);
	private Label name_lb = new Label("�� �� : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label team_lb = new Label("�� �� �� �� : ", Label.RIGHT);
	private TextField team_tf = new TextField();
	private Label moveTeam_lb = new Label("�� �� �� �� �� �� : ", Label.RIGHT);
	private TextField moveTeam_tf = new TextField();
	private Label salary_lb = new Label("�� ��  : ", Label.RIGHT);
	private TextField salary_tf = new TextField();
	Button ok_bt = new Button("����");
	Button cen_bt = new Button("���");
	
	private Panel cen_p = new Panel();
	private Panel lb_p = new Panel();
	private Panel ta_p = new Panel();
	private Panel button_p = new Panel();
	
	public String getName() {
		return name_tf.getText();
	}
	public String getTeam() {
		return team_tf.getText();
	}
	public int getSalary() {
		return Integer.parseInt(salary_tf.getText());
	}
	public void clearData() {
		name_tf.setText("");
		team_tf.setText("");
		salary_tf.setText("");
	}

	public void init(int i) {
		if (i==0) {
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
			team_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(team_lb);
			salary_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(salary_lb);
			ta_p.setLayout(new GridLayout(3,1));
			name_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(name_tf);
			team_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(team_tf);
			salary_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(salary_tf);
			this.add("South", button_p);
			button_p.setLayout(new GridLayout(1,2, 10, 5));
			ok_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(ok_bt);
			cen_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(cen_bt);	
		}else if(i==1) {
			this.setLayout(new BorderLayout());
			title_lb.setFont(new Font("", Font.BOLD, 20));
			title_lb.setText("�� �� Ʈ �� �� ��");
			this.add("North", title_lb);
			this.add(cen_p);
			cen_p.setLayout(new BorderLayout());
			cen_p.add("West", lb_p);
			cen_p.add("Center", ta_p);
			lb_p.setLayout(new GridLayout(3,1));
			team_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(team_lb);
			name_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(name_lb);
			moveTeam_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(moveTeam_lb);
			ta_p.setLayout(new GridLayout(3,1));
			name_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(name_tf);
			team_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(team_tf);
			salary_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(moveTeam_tf);
			this.add("South", button_p);
			button_p.setLayout(new GridLayout(1,2, 10, 5));
			ok_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(ok_bt);
			cen_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(cen_bt);	
		}else if(i==2) {
			this.setLayout(new BorderLayout());
			title_lb.setFont(new Font("", Font.BOLD, 20));
			title_lb.setText("�� �� �� ��");
			this.add("North", title_lb);
			this.add(cen_p);
			cen_p.setLayout(new BorderLayout());
			cen_p.add("West", lb_p);
			cen_p.add("Center", ta_p);
			lb_p.setLayout(new GridLayout(2,1));
			team_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(team_lb);
			name_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(name_lb);
			ta_p.setLayout(new GridLayout(2,1));
			name_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(name_tf);
			team_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(team_tf);
			this.add("South", button_p);
			button_p.setLayout(new GridLayout(1,2, 10, 5));
			ok_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(ok_bt);
			cen_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(cen_bt);	
		}else if(i==3) {
			this.setLayout(new BorderLayout());
			title_lb.setFont(new Font("", Font.BOLD, 20));
			title_lb.setText("�� �� �� ��");
			this.add("North", title_lb);
			this.add(cen_p);
			cen_p.setLayout(new BorderLayout());
			cen_p.add("West", lb_p);
			cen_p.add("Center", ta_p);
			lb_p.setLayout(new GridLayout(3,1));
			name_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(name_lb);
			team_lb.setFont(new Font("", Font.PLAIN, 15));
			lb_p.add(team_lb);
			salary_lb.setFont(new Font("", Font.PLAIN, 15));
			salary_lb.setText("�� �� �� �� ��");
			lb_p.add(salary_lb);
			ta_p.setLayout(new GridLayout(3,1));
			name_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(name_tf);
			team_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(team_tf);
			salary_tf.setFont(new Font("", Font.PLAIN, 15));
			ta_p.add(salary_tf);
			this.add("South", button_p);
			button_p.setLayout(new GridLayout(1,2, 10, 5));
			ok_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(ok_bt);
			cen_bt.setFont(new Font("", Font.PLAIN, 15));
			button_p.add(cen_bt);	
		}
		
		
	}
	
	public InputDialog(Frame owner, String title, boolean modal,int i) {
		super(owner, title, modal);
		this.init(i);
		this.setSize(250, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(false);
	}
}
