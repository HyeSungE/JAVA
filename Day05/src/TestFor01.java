import java.util.*;
public class TestFor01 {

	/*
	 ���� nextInt()
	 �Ǽ� nextFloat() nextDouble()
	 ���ڿ� next() - ���� �� �ٰ����� �ɶ����� �Է�
	 	 nextLine() - �ٰ����� �ɋ����� �Է�
	 */
		
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.print("ù��° �� �Է� : ");
		a=in.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		b=in.nextInt();
		
		int res=1;//res=0���� ������ ����� ����� 1�̱⶧��
		
		if(a>b) {
			int tmp=a;
			a=b;
			b=a;
		}
		if(b%a==0) {//���� ���� ū ���� ������ �������� �ִ������̴�.
			res=a;
		} 
		else {
			for(int i=2;i<=a/2;i++) {
				if(a%i==0&&b%i==0) {
					res=i;
				}
			}
		}
		
		System.out.println("�ִ������� "+ res+"�Դϴ�.");
	}

}
