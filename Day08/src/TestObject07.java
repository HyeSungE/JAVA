import java.util.Scanner;
public class TestObject07 {

	public static void main(String[] args){
		/*
		 * ���ȣ�� �޼ҵ� : �޼ҵ尡 �ڽ��� ȣ���ϴ� �޼ҵ带 ���ϳ�
		 * �������� ������ ������ ���������� ������ �������� �ڽ��� ȣ���ϸ� ���� ������ �ʴ´�.
		 */
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("�Ǻ���ġ ���� �Է��Ͻÿ� : ");
		a=in.nextInt();
		for(int i=1;i<=a;i++) {
		System.out.print(fibo(i)+" ");
		}
	}
	public static int fibo(int n) {
		//if(n==0) return 0;
		//else if(n==1) return 1;
		if(n<=2) return 1;
		else return fibo(n-2)+fibo(n-1);
	}
	
}
