import java.util.*;
public class TestIf03 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("수를 입력하시오 : ");
		int n=in.nextInt();
		
		if(n%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
}
