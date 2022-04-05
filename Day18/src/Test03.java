import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

class Member implements Comparable<Member>{
	private String name;
	private String tel;
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.getName());
	}
}
interface MemberPro{
	public void input(Member mb);
	public List<Member> view();
	public void update(Member mb);
	public void delete(String name);
}
class MemberProImpl implements MemberPro{
	List<Member> list = new ArrayList<>();
	
	@Override
	public void input(Member mb) {
		list.add(mb);		
	}

	@Override
	public List<Member> view() {
		return list;
	}

	@Override
	public void update(Member mb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
class MyFrame03 extends Frame implements ActionListener{
	private TextArea ta = new TextArea();
	private Button bt1 = new Button("입력");
	private Button bt2 = new Button("수정");
	private Button bt3 = new Button("삭제");
	private Button bt4 = new Button("종료");
	
	private MyInputDialog md = new MyInputDialog(this, "회원입력", true);
	
	private String ta_str = new String("회 원 명 단\n-----------------\n");
	private Panel p = new Panel();
	
	private MemberPro pro = new MemberProImpl();
	
	public void view_ta() {
		ta.setText(ta_str);
		List<Member> list = pro.view();
		Collections.sort(list);
		for(Member mb : list) {
			ta.append(mb.getName() + "\t" + mb.getTel()+"\n");
		}
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		ta.setFont(new Font("", Font.PLAIN, 20));
		ta.setEditable(false);
		view_ta();
		this.add("Center", ta);
		this.add("East", p);
		p.setPreferredSize(new Dimension(100, 300));
		p.setLayout(new GridLayout(4, 1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2);	bt2.addActionListener(this);
		p.add(bt3);	bt3.addActionListener(this);
		p.add(bt4);	bt4.addActionListener(this);
		md.ok_bt.addActionListener(this);
		md.cen_bt.addActionListener(this);
	}
	
	public MyFrame03(String title) {
		super(title);
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
		if (e.getSource()==bt1) {
			md.setVisible(true);
		}else if (e.getSource()==bt2) {

		}else if (e.getSource()==bt3) {
			
		}else if (e.getSource()==bt4) {
			System.exit(0);
		}else if (e.getSource()==md.ok_bt) {
			String name = md.getName();
			String tel = md.getTel();
			Member member = new Member(name, tel);
			pro.input(member);
			md.clearData();
			md.setVisible(false);
			view_ta();
		}else if (e.getSource()==md.cen_bt) {
			md.clearData();
			md.setVisible(false);
		}
	}
}

class MyInputDialog extends Dialog implements ActionListener{
	private Label title_lb = new Label("입력", Label.CENTER);
	private Label name_lb = new Label("이름 : ", Label.RIGHT);
	private TextField name_tf = new TextField();
	private Label tel_lb = new Label("전화번호 : ", Label.RIGHT);
	private TextField tel_tf = new TextField();
	Button ok_bt = new Button("저장");
	Button cen_bt = new Button("취소");
	
	private Panel name_p = new Panel();
	private Panel tel_p = new Panel();
	private Panel button_p = new Panel();
	
	public String getName() {
		return name_tf.getText();
	}
	public String getTel() {
		return tel_tf.getText();
	}
	public void clearData() {
		name_tf.setText("");
		tel_tf.setText("");
	}
	
	public void init() {
		this.setLayout(new GridLayout(4, 1));
		this.add(title_lb);
		this.add(name_p);
		name_p.setLayout(new BorderLayout());
		name_p.add("West", name_lb);
		name_p.add("Center", name_tf);
		this.add(tel_p);
		tel_p.setLayout(new BorderLayout());
		tel_p.add("West", tel_lb);
		tel_p.add("Center", tel_tf);
		this.add(button_p);
		button_p.setLayout(new GridLayout(1,2, 10, 5));
		button_p.add(ok_bt);
		button_p.add(cen_bt);	
	}
	
	public MyInputDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		this.init();
		this.setSize(200, 200);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("aaa");
		//setVisible(false);
	}
}

public class Test03 {
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("frame예제");
	}
}
