import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			int tot = 3/0;
			System.out.println("국어점수 : "  +kor +"점");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		//catch(InputMismatchException e) {
		//	System.out.println("숫자만 입력하셔야 합니다.");
		//catch(ArithmeticException e) {
		//	System.out.println("0으로 나눌수는 없습니다.");
		}finally {
			//사용되는 시점 : try절이 끝날때 멀티스레드로 사용된다
			System.out.println("finally 절이 실행되었습니다.");
		}
	}
}










