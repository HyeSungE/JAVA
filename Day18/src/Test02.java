import java.awt.*;
import java.util.*;
import java.util.List;

import java.awt.event.*;
class UserInfo implements Comparable<UserInfo> {
	private String name;
	private String pNo;
	UserInfo(String name,String pNo){
		this.name=name;
		this.pNo=pNo;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
	String getpNo() {
		return pNo;
	}
	void setpNo(String pNo) {
		this.pNo=pNo;
	}
	
	@Override
	public int compareTo(UserInfo o) {
		// TODO Auto-generated method stub
		
		return name.compareTo(o.getName()) ;
	}
}

class MyFrame02 extends Frame implements ActionListener{
	private Panel Ep=new Panel();
	private Panel Cp=new Panel();
	private Button input_bt = new Button("입력");
	private Button edit_bt = new Button("수정");
	private Button delete_bt=new Button("삭제");
	private Button exit_bt=new Button("종료");
	private TextArea ta=new TextArea();
	private ArrayList<UserInfo> al=new ArrayList<UserInfo>();
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("East",Ep);
		Ep.setPreferredSize(new Dimension(100,400));
		Ep.setLayout(new GridLayout(4,1));
		Ep.add(input_bt); input_bt.addActionListener(this);
		Ep.add(edit_bt);Ep.add(delete_bt);
		Ep.add(exit_bt);exit_bt.addActionListener(this);
		this.add("West",Cp);
		Cp.add(ta);
		ta.setPreferredSize(new Dimension(330,400));
		ta.setText("회원 명단\n-----------------------\n");
		ta.setEditable(false);

	}
	
	public MyFrame02(String title) {
		super(title);
		init();
		this.setSize(450,450);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit_bt) {
			System.exit(0);
		}
		else if(e.getSource()==input_bt) {
			Input_Frame inputFr=new Input_Frame();
		}
	}
	
	class Input_Frame extends Frame implements ActionListener{
		private Label lb=new Label("입력",Label.CENTER);
		private Panel Cp=new Panel();
		private TextField Name_tf=new TextField();
		private TextField pNo_tf=new TextField();
		private Panel Sp=new Panel();
		private Button Input_bt=new Button("입력");
		private Button Cancle_bt=new Button("취소");
		public void init() {
			this.setLayout(new BorderLayout());
			this.add("North",lb);
			lb.setFont(new Font("",Font.BOLD,20));
			
			this.add("Center",Cp);
			Cp.setLayout(new FlowLayout());
			Cp.add(new Label("이름         ")); Cp.add(Name_tf);
			Name_tf.setPreferredSize(new Dimension(300,30));
			Cp.add(new Label("전화번호 ")); Cp.add(pNo_tf);
			pNo_tf.setPreferredSize(new Dimension(300,30));
			
			this.add("South",Sp);
			Sp.setLayout(new FlowLayout());
			Input_bt.setPreferredSize(new Dimension(100,20));
			Cancle_bt.setPreferredSize(new Dimension(100,20));
			Sp.add(Input_bt); Input_bt.addActionListener(this);
			Sp.add(Cancle_bt); Cancle_bt.addActionListener(this);
		}
		public Input_Frame() {
			init();
			this.setSize(400,200);
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
			int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
			this.setLocation(xpos, ypos);
			this.setResizable(false);
			this.setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Cancle_bt) {
				this.setVisible(false);
			}else if(e.getSource()==Input_bt){
				String name=Name_tf.getText();
				String pNo=pNo_tf.getText();
				UserInfo ui=new UserInfo(name,pNo);
				al.add(ui);
				Collections.sort(al);
				disp();
				this.setVisible(false);
			}	
		}
		public void disp() {
			ta.setText("");
			ta.setText("회원 명단\n-----------------------\n");
			ta.setFont(new Font("",Font.PLAIN,15));
			for(UserInfo u : al) {
				ta.append(u.getName()+ "   " + u.getpNo()+"\n");
			}
		}
		
	}
	
}
public class Test02 {

	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("frame예제");
	}

}
