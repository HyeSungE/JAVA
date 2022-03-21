import java.util.*;
import java.io.*;
public class TestObject06 {

	public static void main(String[] args) throws IOException {
		/*
		 * 재귀호출 메소드 : 메소드가 자신을 호출하는 메소드를 말하낟
		 * 문제점은 끝나는 조건을 설정해주지 않으면 무한으로 자신을 호출하며 끝이 나지를 않는다.
		 */
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("2의 제곱수를 입력하시오 : ");
		a=in.nextInt();
		System.out.println("2의 "+a+"제곱은 "+sqare(a)+"입니다");
	}
	public static int sqare(int n) {
		if(n==0) return 1;
		else return 2*sqare(n-1);
	}
	
}
