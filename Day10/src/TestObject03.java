import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;
	protected int tot;
	private int rank;
	Student(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		this.rank = 1;
	}
	public String getName() {//get + 멤버필드 이름 => getter메소드 : private멤버 꺼낼때
		return name;
	}
	
	public boolean setKor(int kor) {//set + 멤버필드 이름 => setter메소드 : private멤버 수정
		if (kor<0 || kor>100) return false;
		this.kor = kor;
		return true;
	}
	public int getKor() {
		return kor;
	}
	public boolean setEng(int eng) {//set + 멤버필드 이름 => setter메소드 : private멤버 수정
		if (eng<0 || eng>100) return false;
		this.eng = eng;
		return true;
	}
	public int getEng() {
		return eng;
	}
	public void setTot() {
		tot = kor + eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		rank++;
	}
	
	void disp() {
		System.out.println(name+"님의 총점은 " + tot +"점이고, 순위는 " + rank +"등 입니다.");
	}
}
class Student2 extends Student{
	private int math;
	/* Student2(){
	  	super()
	  }가 전체 생략되어있기 때문에 부모클래스에서 default생성자가 없으면 오류*/
	 
	public Student2(String name,int kor,int eng,int math) {
		super(name,kor,eng);
		this.math=math;
		setTot();
	}
	public void setTot() {
		tot=getKor()+getEng()+math;
	}
	public boolean setMath(int math) {//set + 멤버필드 이름 => setter메소드 : private멤버 수정
		if (math<0 || math>100) return false;
		this.math = math;
		return true;
	}
	public int getMath() {
		return math;
	}
	
}
public class TestObject03 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		System.out.print("인원수를 입력 : ");
		int inwon = in.nextInt();
		Student2[] st = new Student2[inwon];
		
		//객체 생성하기
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"번째 학생 이름 : ");
			String name = in.next();
			int kor = input("국어");
			int eng = input("영어");
			int math = input("수학");
			st[i] = new Student2(name, kor, eng,math);
		}
		
		//순위계산하기
		for(int i=0; i<inwon; ++i) {
			st[i].clearRank();
			for(int j=0; j<inwon; ++j) {
				if (st[i].getTot() < st[j].getTot()) {
					st[i].plusRank();
				}
			}
		}
		
		//출력하기
		for(int i=0; i<inwon; ++i) {
			st[i].disp();
		}
		
		//총점90점 넘은 사람 명단 작성
		for(int i=0; i<inwon; ++i) {
			if (st[i].getTot() >= 90) {
				System.out.println(st[i].getName());
			}
		}
	}
	
	public static int input(String str) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(str+"점수를 입력 : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			System.out.println(str+"점수는 0점에서 100점 사이만 입력해 주세요!!");
		}
	}
}