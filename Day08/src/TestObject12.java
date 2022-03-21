import java.util.*;
class Score{
	String name;
	int kor;
	int eng;
	int rank=1;
	Score(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	int sum() {
		return kor+eng;
	}
}
public class TestObject12{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("인원 수를 입력 : ");
		int n=in.nextInt();
		Score s[]=new Score[n];
		
		for(int i=0;i<s.length;i++) {
			System.out.print("이름을 입력 : ");
			String name=in.next();
			System.out.print("국어의 점수를 입력  : ");
			int kor=in.nextInt();
			System.out.print("영어의 점수를 입력  : ");
			int eng=in.nextInt();
			s[i]=new Score(name,kor,eng);
		}
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				if(s[i].sum()<s[j].sum()) {
					s[i].rank++;
				}
			}
		}
		for(int i=0;i<s.length;i++)
			System.out.println(s[i].name+"님의 총점은 "+s[i].sum()+"입니다 순위는 "+s[i].rank);
	}
}
