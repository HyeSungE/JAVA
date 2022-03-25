package Grade_fail;

import java.util.*;

public class Score implements Func{
	private Hashtable<String, Students> ht;
	private Scanner in;
	
	public Score(){
		ht=new Hashtable<String, Students>();
		in=new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("이름을 입력하시오 : ");
		String name=in.next();
		System.out.print("국어 점수를 입력하시오 : ");
		int kor=in.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		int eng=in.nextInt();
		Students std=new Students(name,kor,eng);
		ht.put(name, std);
		
	}
	
	public void print() {
		Enumeration en=ht.keys();
		System.out.print(en.toString());
		int eng=in.nextInt();
		while(en.hasMoreElements()) {
			Object obj=en.nextElement();
			String key=(String)obj;
			Students std=(Students)(ht.get(key));{
			System.out.println(std.getName()+"님의 총점은 " + std.getTotal()+
					"점이고, 순위는 " + std.rank +"등 입니다.");
			}
		}
	}
	public void modifi() {
		System.out.print("수정하실 학생의 이름을 입력하시오 : ");
		String name=in.next();
		if(ht.containsKey(name)) {
			Students std=(Students)ht.get(name);
			System.out.print("국어 점수를 입력하시오 : ");
			int kor=in.nextInt();
			System.out.print("영어 점수를 입력하시오 : ");
			int eng=in.nextInt();
			System.out.println(name+"의 성적을 변경했습니다.\n국어 : "+std.getKor()+" -> "+kor+
					" 영어 : "+std.getEng()+" -> "+eng);
			std.setKor(kor);
			std.setEng(eng);
		}
	}
	
	public void delete() {
		System.out.print("삭제하실 학생의 이름을 입력하시오 : ");
		String name=in.next();
		if(ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"의 성적을 삭제했습니다.");
		}
		
	}
	
	public void quit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	public void rank() {
	 Enumeration<String> en=ht.keys();
	 while(en.hasMoreElements()) {
		 Object obj=en.nextElement();
		 String key=(String)obj;
		 Students std=(Students)ht.get(key);
		 std.rankReset();
		 int total=std.getTotal();
		 Enumeration<String> en_s=ht.keys();//<=여기서 다시 초기화해서 돌림
		 while(en_s.hasMoreElements()) {
			 Object obj_s=en_s.nextElement();
			 String key_s=(String)obj_s;
			 Students std_s=(Students)ht.get(key);
			 if(total<std_s.getTotal()) {
				 std.setRank();
			 }
	 		}
	 	}
	}
}