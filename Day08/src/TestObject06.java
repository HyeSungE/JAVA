import java.util.*;
import java.io.*;
public class TestObject06 {

	public static void main(String[] args) throws IOException {
		/*
		 * ���ȣ�� �޼ҵ� : �޼ҵ尡 �ڽ��� ȣ���ϴ� �޼ҵ带 ���ϳ�
		 * �������� ������ ������ ���������� ������ �������� �ڽ��� ȣ���ϸ� ���� ������ �ʴ´�.
		 */
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("2�� �������� �Է��Ͻÿ� : ");
		a=in.nextInt();
		System.out.println("2�� "+a+"������ "+sqare(a)+"�Դϴ�");
	}
	public static int sqare(int n) {
		if(n==0) return 1;
		else return 2*sqare(n-1);
	}
	
}
