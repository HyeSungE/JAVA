import java.util.*;
public class TestFor01 {

	/*
	 정수 nextInt()
	 실수 nextFloat() nextDouble()
	 문자열 next() - 공백 탭 줄개행이 될때까지 입력
	 	 nextLine() - 줄개행이 될떄까지 입력
	 */
		
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.print("첫번째 수 입력 : ");
		a=in.nextInt();
		System.out.print("두번째 수 입력 : ");
		b=in.nextInt();
		
		int res=1;//res=0보다 어차피 공통된 약수는 1이기때문
		
		if(a>b) {
			int tmp=a;
			a=b;
			b=a;
		}
		if(b%a==0) {//작은 수가 큰 수의 약수라면 작은수는 최대공약수이다.
			res=a;
		} 
		else {
			for(int i=2;i<=a/2;i++) {
				if(a%i==0&&b%i==0) {
					res=i;
				}
			}
		}
		
		System.out.println("최대공약수는 "+ res+"입니다.");
	}

}
