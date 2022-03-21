import java.util.Scanner;
public class TestObject07 {

	public static void main(String[] args){
		/*
		 * 재귀호출 메소드 : 메소드가 자신을 호출하는 메소드를 말하낟
		 * 문제점은 끝나는 조건을 설정해주지 않으면 무한으로 자신을 호출하며 끝이 나지를 않는다.
		 */
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("피보나치 수를 입력하시오 : ");
		a=in.nextInt();
		for(int i=1;i<=a;i++) {
		System.out.print(fibo(i)+" ");
		}
	}
	public static int fibo(int n) {
		//if(n==0) return 0;
		//else if(n==1) return 1;
		if(n<=2) return 1;
		else return fibo(n-2)+fibo(n-1);
	}
	
}
