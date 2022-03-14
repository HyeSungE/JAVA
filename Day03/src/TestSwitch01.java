import java.util.*;
import java.io.*;
public class TestSwitch01 {

	public static void main(String[] args) throws IOException{
		Scanner in=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오 : ");
		int a=in.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		int b=in.nextInt();
		System.out.print("산술연산자를 입력하시오 : ");
		
		char ch=(char)System.in.read();
		float res=0;
		
		switch(ch) {
			case '+' :
				res=a+b;
				break;
			case '-' :
				res=a-b;
				break;
			case '*':
				res=a*b;
				break;
			case '/': 
				res=a/b;
				break;
			case '%': 
				res=a%b;
				break;
			default : 
				System.out.println("산술연산자만 입력 ");
				break;
		}
		
		System.out.printf("%d %c %d = %.1f",a,ch,b,res);
	}

}
