import java.util.Scanner;
public class TestIf05 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("수를 입력하시오 : ");
		int n=in.nextInt();
		
		/*if(n%15==0) {
				System.out.println("3과 5의 배수입니다.");
			}
		else if(n%3==0) {
			System.out.println("3의 배수입니다.");
		}
		else if(n%5==0) {
			System.out.println("5의 배수입니다.");
		}
		else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}*/
		if(n%3==0 && n%5==0) {
			if(n%3==0 && n%5!=0) {
				System.out.println("3의 배수입니다.");
			}
			else if(n%3!=0 && n%5==0) {
				System.out.println("5의 배수입니다.");
			}
			else {
				System.out.println("3과 5의 배수입니다.");
			}
		}
		else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
	}
}
