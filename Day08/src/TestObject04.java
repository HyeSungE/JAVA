import java.util.*;
import java.io.*;
public class TestObject04 {

	public static void main(String[] args) throws IOException {
		int a,b;
		while(true) {
		System.out.println("!!���Ḧ ���ϸ� 0�� �� �� �Է�!!");
		a=num_input();
		b=num_input();
		if(a==0&&b==0) {
			System.out.println("�����մϴ�.");
			break;
		}
	
		int res=result(a,b);
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

	public static int abs(int a) {
		if(a<0) return a*-1;
		else return a;
	}
	public static int result(int a,int b) {
		if(abs(a)>abs(b)) return a;
		else return b;
	}
}
