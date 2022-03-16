import java.util.*;
public class TestArray05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int SIZE=in.nextInt();
		/*
		String name[]=new String[5];
		int kor[]=new int[5];
		int eng[]=new int[5];
		int sum[]=new int[5];
		int rank[]=new int[5];*/
		
		String name[]=new String[SIZE]; // 배열의 크기를 상수가 아닌 변수로도 생성가능하다.
		int kor[]=new int[SIZE];
		int eng[]=new int[SIZE];
		int sum[]=new int[SIZE];
		int rank[]=new int[SIZE];
		
		for(int i=0;i<name.length;i++) {
			System.out.print(i+1+"번째 이름을 입력하시오 : ");
			name[i]=in.next();
			System.out.print(i+1+"번째 국어 성적을 입력하시오 : ");
			kor[i]=in.nextInt();
			System.out.print(i+1+"번째 영어 성적을 입력하시오 : ");
			eng[i]=in.nextInt();
			sum[i]=kor[i]+eng[i];
			rank[i]=1;
		}
		
		for(int i=0;i<sum.length;i++) {//내성적
			for(int j=0;j<sum.length;j++) {//모두성적
				if(sum[i]<sum[j]){//나의 성적이 모두의 성적과 비교하여 작다면
					rank[i]+=1;//나의 rank의 값을 1증가시킨다.
				}
			}
			
		}
		for(int i=0;i<name.length;i++) {
		System.out.println("이름 : "+name[i]+" a총점 : "+sum[i]+" 순위 : "+rank[i]);
		}
	}

}
