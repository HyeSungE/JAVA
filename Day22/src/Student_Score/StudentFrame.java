package Student_Score;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.List;

import javax.swing.*;

public class StudentFrame extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("입력");
	private JButton jbt2 = new JButton("수정");
	private JButton jbt3 = new JButton("삭제");
	private JButton jbt4 = new JButton("저장");
	private JButton jbt5 = new JButton("불러오기");
	private JButton jbt6 = new JButton("종료");
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp[] = new JPanel[4];
	private JTextArea jta[] = new JTextArea[4];
	//jta[0] => 이름, jta[1] => 국어, jta[2] => 영어, jta[3] => 총점
		
	private String[] str = new String[] {"이름", "국어", "영어", "총점"};
	private MyInputDialog md = new MyInputDialog(this, "학생입력", true);
	
	private String title_str = new String(
			"학 생 명 단\n"
		   +"-------------------------------------------------------------------------\n"
		   +"이름\t국어\t영어\t총점\n"
		   +"-------------------------------------------------------------------------\n");
	private Panel p = new Panel();
	
	private StudentPro pro = new StudentProImpl();
	
	File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22\\src\\Student_Score");
	File file = new File(dir,"Studnet.txt");
	
	public void view_ta() {
		for(int i=0; i<jp.length; ++i) {
			List<Student> list = pro.output(str[i]);
			jta[i].setText(title_str);
			for(Student st : list) {
				jta[i].append(st.getName()+"\t");
				jta[i].append(st.getKor()+"\t");
				jta[i].append(st.getEng()+"\t");
				jta[i].append(st.getTot()+"\n");
			}
		}
	}
	
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);	jbt1.addActionListener(this);
		jtb.add(jbt2);	jbt2.addActionListener(this);
		jtb.add(jbt3);	jbt3.addActionListener(this);
		jtb.add(jbt4);	jbt4.addActionListener(this);
		jtb.add(jbt5);	jbt5.addActionListener(this);
		jtb.add(jbt6);	jbt6.addActionListener(this);
		con.add("Center", jtp);
		for(int i=0; i<jp.length; ++i) {
			jp[i] = new JPanel();
			jp[i].setLayout(new BorderLayout());
			jta[i] = new JTextArea(title_str);
			jp[i].add("Center", jta[i]);
			jtp.add(str[i], jp[i]);
		}
		md.ok_bt.addActionListener(this);
		md.cen_bt.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public StudentFrame(String title) {
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
		if (e.getSource()==jbt1) {
			md.setVisible(true);
		}else if (e.getSource()==jbt2) {
			String name = JOptionPane.showInputDialog
					(this,"이름을 입력하세요", "입력", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.getStudent(name);
			if (st == null) {
				JOptionPane.showMessageDialog
				(this, name+"학생은 없습니다.", "알림", JOptionPane.WARNING_MESSAGE);
			}else {
				String kor = JOptionPane.showInputDialog
						(this, "현재 국어점수는 " + st.getKor() + "점 입니다. 수정하실 국어점수는?", 
								"입력", JOptionPane.QUESTION_MESSAGE);
				String eng = JOptionPane.showInputDialog
						(this, "현재 영어점수는 " + st.getEng() + "점 입니다. 수정하실 영어점수는?", 
								"입력", JOptionPane.QUESTION_MESSAGE);
				st.setKor(Integer.parseInt(kor));
				st.setEng(Integer.parseInt(eng));
				st.setTot();
				pro.edit(st);
				view_ta();
			}
		}else if (e.getSource()==jbt3) {
			String name = JOptionPane.showInputDialog
					(this,"이름을 입력하세요", "입력", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.getStudent(name);
			if (st == null) {
				JOptionPane.showMessageDialog
				(this, name+"학생은 없습니다.", "알림", JOptionPane.WARNING_MESSAGE);
			}else {
				pro.delete(st);
				view_ta();
			}
		}else if (e.getSource()==md.ok_bt) {
			String name = md.getName();
			int kor = md.getKor();
			int eng = md.getEng();
			pro.input(name, kor, eng);
			md.clearData();
			md.setVisible(false);
			view_ta();
		}else if (e.getSource()==md.cen_bt) {
			md.clearData();
			md.setVisible(false);
		}else if(e.getSource()==jbt4) {//save
			
			try {
				FileOutputStream fos = new FileOutputStream(file);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(pro);
				oos.close();
				JOptionPane.showMessageDialog (this, "저장이 완료됐습니다", "알림", JOptionPane.WARNING_MESSAGE);
			}
			catch(IOException err) {}
			
			
		}else if(e.getSource()==jbt5) {//load
			try {
				FileInputStream fis = new FileInputStream(file); 
				BufferedInputStream bis =new BufferedInputStream(fis);
				ObjectInputStream ois =new ObjectInputStream(bis);	
				Object obj =ois.readObject(); 
				StudentPro Load_pro =(StudentProImpl)obj;
				pro=Load_pro;
				view_ta();
				JOptionPane.showMessageDialog (this, "불러오기가 완료됐습니다", "알림", JOptionPane.WARNING_MESSAGE);
			}catch(IOException err){
				
			}catch(ClassNotFoundException err) {
				
			}
		}else if(e.getSource()==jbt6) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		new StudentFrame("성적관리");
	}
}
