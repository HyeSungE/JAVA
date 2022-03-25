package Grade;
import java.util.*;
public class Score implements Function {
	private Hashtable ht;
	private Scanner in;
	
	public Score() {
		ht=new Hashtable();
		in=new Scanner(System.in);
	}
	public void input() {
		System.out.print("이름을 입력하세요 : ");
		String name=in.next();
		System.out.print("국어 점수를 입력하세요 : ");
		int kor=in.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng=in.nextInt();
		Student std=new Student(name,kor,eng);
		ht.put(name,std);
		
	}
	public void print() {
		rank();
		Enumeration enu = ht.keys();
		while(enu.hasMoreElements()) {
		Object obj = enu.nextElement();
		String key = (String)obj;
		Student output = (Student)ht.get(key);
		output.display();
		}
		
	}
	public void modifi() {
		System.out.print("수정할 이름을 입력하세요 : ");
		String name=in.next();
		System.out.print("수정할 국어 점수를 입력하세요 : ");
		int kor=in.nextInt();
		System.out.print("수정할 영어 점수를 입력하세요 : ");
		int eng=in.nextInt();
		Enumeration en=ht.keys();
		while(en.hasMoreElements()) {
			Object obj=en.nextElement();
			String name2=(String)obj;
			Student std=(Student)ht.get(name2);
			if(name.equals(std.getName())) {
				std.setKor(kor);
				std.setEng(eng);
			}
		}
	}
	public void delete() {
		System.out.print("삭제할 이름을 입력하세요 : ");
		String name=in.next();
		ht.remove(name);
	}
	public void quit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

public void rank() {
	Enumeration en=ht.keys();
	while(en.hasMoreElements()) {
		Object obj=en.nextElement();
		String key=(String)obj;
		Student std=(Student)ht.get(key);
		std.rankReset();
		Enumeration en2=ht.keys();
		while(en2.hasMoreElements()) {
			Object obj2=en2.nextElement();
			String key2=(String)obj2;
			Student std2=(Student)ht.get(key2);
			if(std.getTotal()<std2.getTotal()) {
				std.setRank();
			}
		}
	}
}
}