import java.util.*;
class Score{
	String name;
	int kor;
	int eng;
	int rank;
	int total;
	Score(String name,int kor,int eng){//객체를 만들때 초기화되는 값들 -- 생성자
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.rank=1;
		this.total=kor+eng;
	}
	
	void disp() {
		System.out.println(name+"님의 총점은 "+total+"입니다 순위는 "+rank);
	}
}
public class TestObject01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("인원 수를 입력 : ");
		int n=in.nextInt();
		Score s[]=new Score[n];
		
		for(int i=0;i<s.length;i++) {
			System.out.print(i+1+"번째 이름을 입력 : ");
			String name=in.next();
			/*System.out.print(i+1+"번째 학생의 국어의 점수를 입력  : ");
			int kor=in.nextInt();
			System.out.print(i+1+"번째 학생의 영어의 점수를 입력  : ");
			int eng=in.nextInt();*/
			int kor=input("국어");
			int eng=input("영어");
			s[i]=new Score(name,kor,eng);
		}
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				if(s[i].total<s[j].total) {
					s[i].rank++;
				}
			}
		}
		for(int i=0;i<s.length;i++)
			s[i].disp();
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


