import java.util.Scanner;
public class Testinput02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = in.nextInt();
		System.out.print("영어 점수 : ");
		int eng = in.nextInt();
		
		int tot=kor+eng;
		float avg=tot/2.0f;
		
		System.out.printf("총점 : %d 평균 : %.2f",tot,avg);
	}
}
