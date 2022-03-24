import java.util.*;
class Students{
	private String name;
	private int kor;
	private int eng;
	int total;
	int rank;
	Students(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	void setKor(int kor) {
		this.kor=kor;
	}
	void setEng(int eng) {
		this.eng=eng;
	}
	void setRank() {
		rank++;
	}
	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getTotal() {
		return kor+eng;
	}
	void rankReset() {
		rank=1;
	}
	public void display() {
		System.out.println(name+"님의 성적의총점은 "+getTotal()+"점입니다 "+rank+"등입니다. ");
	}
}
interface work{
	public void input();
	public void print();
	public void modifi();
	public void delete();
	public void quit();
}

class Score implements work{
	private HashSet hset;
	private Scanner in;
	Score(){
		hset=new HashSet();
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
		hset.add(std);
		
	}
	
	public void print() {
		Iterator it=hset.iterator();
		
		while(it.hasNext()) {
			Object obj=it.next();
			Students std=(Students)obj;
			rank();
			std.display();
		}
	}
	public void modifi() {
		System.out.print("수정하실 학생의 이름을 입력하시오 : ");
		String name=in.next();
		Iterator it=hset.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Students std=(Students)obj;
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
		Iterator it=hset.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Students std=(Students)obj;
			if(std.getName().equals(name)) {
				hset.remove(std);
			}
		}
		System.out.println(name+"의 성적을 삭제했습니다.");
	}
	public void quit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	public void rank() {
	 Iterator it=hset.iterator();
	 while(it.hasNext()) {
		 Object obj=it.next();
		 Students std=(Students)obj;
		 std.rankReset();
		 int total=std.getTotal();
		 Iterator it2=hset.iterator();//<=여기서 다시 초기화해서 돌림
		 while(it2.hasNext()) {
			 Object obj_s=it2.next();
			 Students std_s=(Students)obj_s;
			 if(total<std_s.getTotal()) {
				 std.setRank();
			 }
	 		}
	 	}
	}
}

public class Test07 {

	public static void main(String[] args) {
	Score sc=new Score();

	while(true) {
		System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
		Scanner in=new Scanner(System.in);
		int select=in.nextInt();
	
		switch(select) {
		case 1 :	sc.input(); break;
		case 2 :	sc.print(); break;
		case 3 :	sc.modifi(); break;
		case 4 :	sc.delete(); break;
		case 5 :	sc.quit(); break;
		default :
			System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}


