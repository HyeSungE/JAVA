import java.util.Scanner;
public class Testinput02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int kor = in.nextInt();
		System.out.print("���� ���� : ");
		int eng = in.nextInt();
		
		int tot=kor+eng;
		float avg=tot/2.0f;
		
		System.out.printf("���� : %d ��� : %.2f",tot,avg);
	}
}
