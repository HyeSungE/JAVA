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
			System.out.print(title+"점수를 입력 : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			JOptionPane.showMessageDialog(null, 
					title+"점수는 0점에서 100점 사이값만 넣어주세요!!");
		}
	}
	
	public void input() {
		String name = null;
		while(true) {
			System.out.print("이름을 입력 : ");
			name = in.next();
			if (dao.inName(name) == null) break;
			else JOptionPane.showMessageDialog(null, "동일한 이름이 존재합니다. 다시입력해 주세요!!");
		}
		
		int kor = inSub("국어");
		int eng = inSub("영어");
		int res = dao.insertStudent(name, kor, eng);
		if (res>0) {
			System.out.println("입력되었다");
			JOptionPane.showMessageDialog(null, name+"님을 입력하였습니다.");
		}else {
			JOptionPane.showMessageDialog(null, name+"님을 입력실패!!");
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
				"\t" + output.getRank() +"등\n");
		}
	}
	
	public void edit() {
		System.out.print("수정할 학생의 이름 입력 : ");
		String name = in.next();
		int kor = inSub("수정할 국어");
		int eng = inSub("수정할 영어");
		int res = dao.updateStudent(name, kor, eng);
		if (res>0) {
				JOptionPane.showMessageDialog(null, name+"님의 성적을 수정하였습니다.");
		}else {
			JOptionPane.showMessageDialog(null, name+"학생은 저희 학생이 아닙니다.");
		}
	}
	
	public void delete() {
		System.out.print("삭제할 학생의 이름 입력 : ");
		String name = in.next();
		int res = dao.deleteStudent(name);
		if (res>0) {
			JOptionPane.showMessageDialog(null, name+"님을 삭제하였습니다.");
		}else {
			JOptionPane.showMessageDialog(null, name+"학생은 저희 학생이 아닙니다.");
		}
	}
	
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}









