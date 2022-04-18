package sungjuk;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class StudentProImpl implements StudentPro{

	private Scanner in;
	private StudentDAO dao;
	
	public StudentProImpl() {
		in = new Scanner(System.in);
		dao = new StudentDAO();
	}
	
	protected int inSub(String title) {
		while(true) {
			System.out.print(title+"������ �Է� : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			JOptionPane.showMessageDialog(null, 
					title+"������ 0������ 100�� ���̰��� �־��ּ���!!");
		}
	}
	
	public void input() {
		String name = null;
		while(true) {
			System.out.print("�̸��� �Է� : ");
			name = in.next();
			if (dao.inName(name) == null) break;
			else JOptionPane.showMessageDialog(null, "������ �̸��� �����մϴ�. �ٽ��Է��� �ּ���!!");
		}
		
		int kor = inSub("����");
		int eng = inSub("����");
		int res = dao.insertStudent(name, kor, eng);
		if (res>0) {
			System.out.println("�ԷµǾ���");
			JOptionPane.showMessageDialog(null, name+"���� �Է��Ͽ����ϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, name+"���� �Է½���!!");
		}
	}
	
	protected void rank(ArrayList<Student> list) {
		for(Student rank1 : list) {
			rank1.clearRank();
			for(Student rank2 : list) {
				if (rank1.getTot() < rank2.getTot()) {
					rank1.plusRank();
				}
			}
		}
	}
	
	public void output(JTextArea jta) {
		ArrayList<Student> list = dao.listStudent();
		rank(list);
		Collections.sort(list);
		for(Student output : list) {
			jta.append(output.getName()+"\t"+output.getKor()+"\t"+output.getEng()+"\t"+output.getTot()+
				"\t" + output.getRank() +"��\n");
		}
	}
	
	public void edit() {
		System.out.print("������ �л��� �̸� �Է� : ");
		String name = in.next();
		int kor = inSub("������ ����");
		int eng = inSub("������ ����");
		int res = dao.updateStudent(name, kor, eng);
		if (res>0) {
				JOptionPane.showMessageDialog(null, name+"���� ������ �����Ͽ����ϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, name+"�л��� ���� �л��� �ƴմϴ�.");
		}
	}
	
	public void delete() {
		System.out.print("������ �л��� �̸� �Է� : ");
		String name = in.next();
		int res = dao.deleteStudent(name);
		if (res>0) {
			JOptionPane.showMessageDialog(null, name+"���� �����Ͽ����ϴ�.");
		}else {
			JOptionPane.showMessageDialog(null, name+"�л��� ���� �л��� �ƴմϴ�.");
		}
	}
	
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}









