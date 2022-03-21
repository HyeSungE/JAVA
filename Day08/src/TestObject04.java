import java.util.*;
import java.io.*;
public class TestObject04 {

	public static void main(String[] args) throws IOException {
		int a,b;
		while(true) {
		System.out.println("!!종료를 원하면 0을 두 번 입력!!");
		a=num_input();
		b=num_input();
		if(a==0&&b==0) {
			System.out.println("종료합니다.");
			break;
		}
	
		int res=result(a,b);
		System.out.println("결과 : "+res);
		}
	}
	public static int num_input() {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		n=in.nextInt();
		return n;
	}

	public static int abs(int a) {
		if(a<0) return a*-1;
		else return a;
	}
	public static int result(int a,int b) {
		if(abs(a)>abs(b)) return a;
		else return b;
	}
}
