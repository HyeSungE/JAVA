import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

class Student implements Comparable<Student>{
	private String name;
	private int kor,eng,math;
	private int sum;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.sum=0;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public void setSum(int kor,int eng,int math) {
		sum=kor+eng+math;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public int compareTo(Student o) {
		if(sum>o.getSum())  return 1;
		else if(sum<o.getSum()) return -1;
		else return 0;
	}
}
interface StudentPro{
	public void input(Student std);
	public List<Student> view();
	public void update(Student std);
	public void delete(Student std);
}
class StudentProImpl implements StudentPro{
	List<Student> list = new ArrayList<>();
	
	@Override
	public void input(Student std) {
		list.add(std);		
	}

	@Override
	public List<Student> view() {
		return list;
	}

	@Override
	public void update(Student std) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Student std) {
		// TODO Auto-generated method stub
		
	}
	
}
class MyFrame04 extends Frame implements ActionListener{
	private TextArea ta = new TextArea();
	private Button bt1 = new Button("입력");
	private Button bt2 = new Button("수정");
	private Button bt3 = new Button("삭제");
	private Button bt4 = new Button("종료");
	
	private MyInputDialog md = new MyInputDialog(this, "학생 점수 입력", true);
	
	private String ta_str = new String("학 생 명 단\n-----------------\n");
	private Panel p = new Panel();
	
	private StudentPro pro = new StudentProImpl();
	
	public void view_ta() {
		ta.setText(ta_str);
		List<Student> list = pro.view();
		Collections.sort(list);
		for(Student std : list) {
			ta.append(std.getName() + "\t" + std.getKor()+"\n"+ std.getEng()+"\n"
					+ std.getMath()+"\n");
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
	
	public MyFrame04(String title) {
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
			int kor = md.getName_tf();
			int eng = md.getEng_tf();
			int math = md.getMath_tf();
			Student std = new Student(name, kor, eng, math);
			pro.input(std);
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
	private Label kor_lb = new Label("국어 점수 : ", Label.RIGHT);
	private TextField kor_tf = new TextField();
	private Label eng_lb = new Label("영어 점수 : ", Label.RIGHT);
	private TextField eng_tf = new TextField();
	private Label math_lb = new Label("수학 점수 : ", Label.RIGHT);
	private TextField math_tf = new TextField();
	Button ok_bt = new Button("저장");
	Button cen_bt = new Button("취소");
	
	private Panel name_p = new Panel();
	private Panel kor_p = new Panel();
	private Panel eng_p = new Panel();
	private Panel math_p = new Panel();
	private Panel button_p = new Panel();
	
	public String getName() {
		return name_tf.getText();
	}
	public int getKor_tf() {
		return Integer.parseInt((kor_tf.getText());
	}
	public int getEng_tf() {
		return Integer.parseInt((eng_tf.getText());
	}
	public int getMath_tf() {
		return Integer.parseInt((math_tf.getText());
	}
	public void clearData() {
		name_tf.setText("");
		kor_tf.setText("");
		eng_tf.setText("");
		math_tf.setText("");
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

public class Test04 {
	public static void main(String[] args) {
		MyFrame04 mf = new MyFrame04("frame예제");
	}
}
