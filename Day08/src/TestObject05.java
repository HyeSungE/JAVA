import java.util.*;
import java.io.*;
public class TestObject05 {

	public static void main(String[] args) throws IOException {
		/*
		 * 재귀호출 메소드 : 메소드가 자신을 호출하는 메소드를 말하낟
		 * 문제점은 끝나는 조건을 설정해주지 않으면 무한으로 자신을 호출하며 끝이 나지를 않는다.
		 */
		System.out.print(fact(5));
	}
	public static int fact(int n) {
		if (n==1) return 1;
		else return fact(n-1)*n;
	}
}
