import java.util.*;
import java.io.*;
public class TestObject03 {

	public static void main(String[] args) throws IOException {
		int a,b;
		char op;
		while(true) {
		System.out.println("!!종료를 원하면 0을 두 번 입력!!");
		a=num_input();
		b=num_input();
		if(a==0&&b==0) {
			System.out.println("종료합니다.");
			break;
		}
		op=op_input();
		int res=result(a,b,op);
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
	public static char op_input() throws IOException{
		System.out.print("연산자를 입력해주세요 : ");
		char op=(char)System.in.read();
		return op;
	}
	public static int result(int a,int b,char op) {
		int res=0;
		switch(op){
		case '+' :
			 res=a+b;
			break;
		case '-' :
			if(a>=b) res=a-b;
			else res=b-a;
			break;
		case '/' :
			if(b==0) {
				b=1;
				res=a/b;
			}
			else res=a/b;
			break;
		case '*' :
			res = a*b;
			break;
		}
		return res;
		
	}
	public static void result(int a,int b) throws IOException{
		int res=0;
		System.out.print("연산자를 입력해주세요 : ");
		char op=(char)System.in.read();
		switch(op){
		case '+' :
			 res=a+b;
			break;
		case '-' :
			if(a>=b) res=a-b;
			else res=b-a;
			break;
		case '/' :
			if(b==0) {
				b=1;
				res=a/b;
			}
			else res=a/b;
			break;
		case '*' :
			res = a*b;
			break;
		}
		System.out.println("결과 : "+res);
		
	}
}
