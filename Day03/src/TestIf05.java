import java.util.Scanner;
public class TestIf05 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ� : ");
		int n=in.nextInt();
		
		/*if(n%15==0) {
				System.out.println("3�� 5�� ����Դϴ�.");
			}
		else if(n%3==0) {
			System.out.println("3�� ����Դϴ�.");
		}
		else if(n%5==0) {
			System.out.println("5�� ����Դϴ�.");
		}
		else {
			System.out.println("3�� 5�� ����� �ƴմϴ�.");
		}*/
		if(n%3==0 && n%5==0) {
			if(n%3==0 && n%5!=0) {
				System.out.println("3�� ����Դϴ�.");
			}
			else if(n%3!=0 && n%5==0) {
				System.out.println("5�� ����Դϴ�.");
			}
			else {
				System.out.println("3�� 5�� ����Դϴ�.");
			}
		}
		else {
			System.out.println("3�� 5�� ����� �ƴմϴ�.");
		}
	}
}
