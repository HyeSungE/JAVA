import java.util.*;
public class TestObjec01 {
	public static void main(String args[]) {
		intro();
		int a=input();
		int b=input();
		int sum=plus(a,b);
		output(a,b,sum);
	}
	public static int input() {//�Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
		Scanner in=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n=in.nextInt();
		return n;
	}
	public static int plus(int a,int b) {//�Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
		return a+b;
	}
	public static void output(int a,int b,int c) {//�Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
		System.out.printf("%d+%d=%d\n",a,b,c);
	}
	public static void intro() {//�Ű������� ���� ��ȯ���� ���� �޼ҵ�
		System.out.println("�� ���� �Է¹޾� ���� ���ϴ� ���α׷�");
	}
}
