import java.util.*;
import java.io.*;
public class TestObject05 {

	public static void main(String[] args) throws IOException {
		/*
		 * ���ȣ�� �޼ҵ� : �޼ҵ尡 �ڽ��� ȣ���ϴ� �޼ҵ带 ���ϳ�
		 * �������� ������ ������ ���������� ������ �������� �ڽ��� ȣ���ϸ� ���� ������ �ʴ´�.
		 */
		System.out.print(fact(5));
	}
	public static int fact(int n) {
		if (n==1) return 1;
		else return fact(n-1)*n;
	}
}
