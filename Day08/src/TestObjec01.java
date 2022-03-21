import java.util.*;
public class TestObjec01 {
	public static void main(String args[]) {
		intro();
		int a=input();
		int b=input();
		int sum=plus(a,b);
		output(a,b,sum);
	}
	public static int input() {//매개변수는 없고 반환형이 있는 메소드
		Scanner in=new Scanner(System.in);
		System.out.print("수를 입력 : ");
		int n=in.nextInt();
		return n;
	}
	public static int plus(int a,int b) {//매개변수가 있고 반환형이 있는 메소드
		return a+b;
	}
	public static void output(int a,int b,int c) {//매개변수가 없고 반환형이 있는 메소드
		System.out.printf("%d+%d=%d\n",a,b,c);
	}
	public static void intro() {//매개변수가 없고 반환형이 없는 메소드
		System.out.println("두 수를 입력받아 합을 구하는 프로그램");
	}
}
