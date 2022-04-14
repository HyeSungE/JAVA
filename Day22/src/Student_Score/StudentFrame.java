package Student_Score;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.List;

import javax.swing.*;

public class StudentFrame extends JFrame implements ActionListener{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("�Է�");
	private JButton jbt2 = new JButton("����");
	private JButton jbt3 = new JButton("����");
	private JButton jbt4 = new JButton("����");
	private JButton jbt5 = new JButton("�ҷ�����");
	private JButton jbt6 = new JButton("����");
	private JTabbedPane jtp = new JTabbedPane();
	private JPanel jp[] = new JPanel[4];
	private JTextArea jta[] = new JTextArea[4];
	//jta[0] => �̸�, jta[1] => ����, jta[2] => ����, jta[3] => ����
		
	private String[] str = new String[] {"�̸�", "����", "����", "����"};
	private MyInputDialog md = new MyInputDialog(this, "�л��Է�", true);
	
	private String title_str = new String(
			"�� �� �� ��\n"
		   +"-------------------------------------------------------------------------\n"
		   +"�̸�\t����\t����\t����\n"
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
					(this,"�̸��� �Է��ϼ���", "�Է�", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.getStudent(name);
			if (st == null) {
				JOptionPane.showMessageDialog
				(this, name+"�л��� �����ϴ�.", "�˸�", JOptionPane.WARNING_MESSAGE);
			}else {
				String kor = JOptionPane.showInputDialog
						(this, "���� ���������� " + st.getKor() + "�� �Դϴ�. �����Ͻ� ����������?", 
								"�Է�", JOptionPane.QUESTION_MESSAGE);
				String eng = JOptionPane.showInputDialog
						(this, "���� ���������� " + st.getEng() + "�� �Դϴ�. �����Ͻ� ����������?", 
								"�Է�", JOptionPane.QUESTION_MESSAGE);
				st.setKor(Integer.parseInt(kor));
				st.setEng(Integer.parseInt(eng));
				st.setTot();
				pro.edit(st);
				view_ta();
			}
		}else if (e.getSource()==jbt3) {
			String name = JOptionPane.showInputDialog
					(this,"�̸��� �Է��ϼ���", "�Է�", JOptionPane.QUESTION_MESSAGE);
			Student st = pro.getStudent(name);
			if (st == null) {
				JOptionPane.showMessageDialog
				(this, name+"�л��� �����ϴ�.", "�˸�", JOptionPane.WARNING_MESSAGE);
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
				JOptionPane.showMessageDialog (this, "������ �Ϸ�ƽ��ϴ�", "�˸�", JOptionPane.WARNING_MESSAGE);
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
				JOptionPane.showMessageDialog (this, "�ҷ����Ⱑ �Ϸ�ƽ��ϴ�", "�˸�", JOptionPane.WARNING_MESSAGE);
			}catch(IOException err){
				
			}catch(ClassNotFoundException err) {
				
			}
		}else if(e.getSource()==jbt6) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		new StudentFrame("��������");
	}
}