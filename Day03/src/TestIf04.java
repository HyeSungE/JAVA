import java.util.Scanner;

public class TestIf04 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int n1=in.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		int n2=in.nextInt();
		
		if(n1 > n2) {
			//System.out.printf("ū ���� %d�Դϴ�.",n1);
			System.out.println("ū ���� " + n1 + "�Դϴ�.");
		}
		else if(n1<n2){
			System.out.printf("ū ���� %d�Դϴ�.",n2);
		}
		else {
			System.out.printf("%d=%d ���� �� �Դϴ�.",n1,n2);
		}
	}
}
