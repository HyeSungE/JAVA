import java.util.*;
import java.io.*;
public class TestObject03 {

	public static void main(String[] args) throws IOException {
		int a,b;
		char op;
		while(true) {
		System.out.println("!!���Ḧ ���ϸ� 0�� �� �� �Է�!!");
		a=num_input();
		b=num_input();
		if(a==0&&b==0) {
			System.out.println("�����մϴ�.");
			break;
		}
		op=op_input();
		int res=result(a,b,op);
		System.out.println("��� : "+res);
		}
	}
	public static int num_input() {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		n=in.nextInt();
		return n;
	}
	public static char op_input() throws IOException{
		System.out.print("�����ڸ� �Է����ּ��� : ");
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
		System.out.print("�����ڸ� �Է����ּ��� : ");
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
		System.out.println("��� : "+res);
		
	}
}
