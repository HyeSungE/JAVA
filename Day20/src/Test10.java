import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame10 extends JFrame implements ActionListener{
	
	private Container con;
	private JToolBar jtb = new JToolBar();
	
	private JButton input_bt=new JButton("입력");
	private JButton edit_bt=new JButton("수정");
	private JButton delete_bt=new JButton("삭제");
	
	private JPanel name_p=new JPanel();
	private JPanel kor_p=new JPanel();
	private JPanel eng_p=new JPanel();
	private JPanel total_p=new JPanel();
	
	private JTabbedPane jtp = new JTabbedPane();
	
	private TextArea ta[]=new TextArea[4];

	
	private ArrayList<Student> stdL = new ArrayList<Student>();
	public void init() {
		con=this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North",jtb);
		con.add("Center",jtp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtb.add(input_bt); jtb.addSeparator();
		jtb.add(edit_bt); jtb.addSeparator();
		jtb.add(delete_bt); jtb.addSeparator();
		input_bt.addActionListener(this);
		edit_bt.addActionListener(this);
		delete_bt.addActionListener(this);
		
		for(int i=0;i<4;i++) {
			ta[i]=new TextArea();
			ta[i].setPreferredSize(new Dimension(430,450));
			ta[i].setEditable(false);
		}
		
		
		jtp.add("이름",name_p); 
		jtp.add("국어",kor_p);
		jtp.add("영어",eng_p);
		jtp.add("총점",total_p);
	
	
		
		
	}
	
	private void disp(JPanel p, TextArea ta) {
		
		ta.setText("이름\t국어\t영어\t총점\t\n-------------------------------");
		for(Student std : stdL) {
			ta.append("\n"+std.getName()+"\t"+std.getKor()+"\t"+std.getEng()+"\t"+std.getTotal()+"\n");
		}
		p.add(ta);
		
	}

	public MyFrame10(String title) {
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
		if(e.getSource()==input_bt) {
			String name = JOptionPane.showInputDialog(this, "이름을 입력하세요", "입력", 
					JOptionPane.QUESTION_MESSAGE);
			String kor = JOptionPane.showInputDialog(this, "국어 점수 입력하세요", "입력", 
					JOptionPane.QUESTION_MESSAGE);
			String eng = JOptionPane.showInputDialog(this, "영어 점수 입력하세요", "입력", 
					JOptionPane.QUESTION_MESSAGE);
			Student std = new Student(name,Integer.parseInt(kor),Integer.parseInt(eng));
			stdL.add(std);
			
			Collections.sort(stdL);
			disp(name_p,ta[0]);disp(kor_p,ta[1]);
			disp(eng_p,ta[2]);disp(total_p,ta[3]);
			
			
		}
		else if(e.getSource()==edit_bt) {
			String name = JOptionPane.showInputDialog(this, "이름을 입력하세요", "입력", 
					JOptionPane.QUESTION_MESSAGE);
			for(Student std : stdL) {
				if(name.equals(std.getName())) {
					String kor = JOptionPane.showInputDialog(this, "국어 점수 입력하세요", "입력", 
							JOptionPane.QUESTION_MESSAGE);
					String eng = JOptionPane.showInputDialog(this, "영어 점수 입력하세요", "입력", 
							JOptionPane.QUESTION_MESSAGE);
					std.setKor(Integer.parseInt(kor));
					std.setEng(Integer.parseInt(eng));
					std.setTotal();
				}
			}
			Collections.sort(stdL);
			disp(name_p,ta[0]);disp(kor_p,ta[1]);
			disp(eng_p,ta[2]);disp(total_p,ta[3]);
		
		}else if(e.getSource()==delete_bt) {
			String name = JOptionPane.showInputDialog(this, "이름을 입력하세요", "입력", 
					JOptionPane.QUESTION_MESSAGE);
			for(Student std : stdL) {
				if(name.equals(std.getName())) {
				stdL.remove(std);
				}
			}
		
		}
		
		Collections.sort(stdL);
		disp(name_p,ta[0]);disp(kor_p,ta[1]);
		disp(eng_p,ta[2]);disp(total_p,ta[3]);
		
	}

	
}
public class Test10 {

	public static void main(String[] args) {
		MyFrame10 mf = new MyFrame10("frame예제");
	}

}
