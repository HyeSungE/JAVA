import java.util.Scanner;
public class TestIf02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score=in.nextInt();
		if(score>=60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
	}

}
