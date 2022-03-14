import java.util.Scanner;

public class Testinput {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		String name = in.next();
		System.out.print("영어 점수 : ");
		int age = in.nextInt();
		
		System.out.println("총합" + name + " 입니다. ");
		System.out.println("당신의 이름은" + age + " 입니다. ");
		
	
	}
}
