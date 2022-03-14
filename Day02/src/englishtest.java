import java.util.Scanner;

public class englishtest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		String name = in.next();
		
		System.out.print("영어 점수 : ");
		int age = in.nextInt();
		
		System.out.println("총합" + name + " 입니다. ");
		System.out.println("평균점수" + age + " 입니다. ");
		
		
	}
}
