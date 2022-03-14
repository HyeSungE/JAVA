import java.util.Scanner;
public class TestIf02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score=in.nextInt();
		if(score>=60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}

}
