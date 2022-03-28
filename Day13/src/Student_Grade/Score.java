package Student_Grade;

import java.util.*;

class Score implements work{
	private ArrayList<Students> list;
	private Scanner in;
	Score(){
		list=new ArrayList<Students>();
		in=new Scanner(System.in);
	}
	protected Students inName(String name) {
			for(Students std : list) {
			if (std.getName().equals(name)) {
				return std;
				}
			}
			return null;
	}
	public void input() {
		String name;
		while(true) {
			System.out.print("이름을 입력하시오 : ");
			name=in.next();
			if(inName(name)==null) break;
			else System.out.println("동일한 이름이 존재합니다. 다시입력해 주세요!!");
			}
		System.out.print("국어 점수를 입력하시오 : ");
		int kor=in.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		int eng=in.nextInt();
		
		Students std=new Students(name,kor,eng);
		list.add(std);
		
	}
	///////////////////////////////////////////////
	public void print() {
		rank();
		Collections.sort(list);
		for(Students std : list) {
			std.display();
		}
	}
	/*
	 * 먼저 정렬을 하고 list를 출력한다
	 */
	////////////////////////////////////////////////
	public void modifi() {
		System.out.print("수정하실 학생의 이름을 입력하시오 : ");
		String name=in.next();
		for(Students std : list) {
			if(std.getName().equals(name)){
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
		
	}
	public void delete() {
		System.out.print("삭제하실 학생의 이름을 입력하시오 : ");
		String name=in.next();
	
		for(Students std : list) {
			if(std.getName().equals(name)) {
				list.remove(std);
			}
		}
		System.out.println(name+"의 성적을 삭제했습니다.");
	}
	public void quit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	public void rank() {
		for(Students std : list) {
		 std.rankReset();
		 int total=std.getTotal();
		 for(Students std_s : list) {
			 if(total<std_s.getTotal()) {
				 std.setRank();
			 }
	 		}
	 	}
	}
}
