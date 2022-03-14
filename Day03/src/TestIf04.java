import java.util.Scanner;

public class TestIf04 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하시오 : ");
		int n1=in.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		int n2=in.nextInt();
		
		if(n1 > n2) {
			//System.out.printf("큰 수는 %d입니다.",n1);
			System.out.println("큰 수는 " + n1 + "입니다.");
		}
		else if(n1<n2){
			System.out.printf("큰 수는 %d입니다.",n2);
		}
		else {
			System.out.printf("%d=%d 같은 수 입니다.",n1,n2);
		}
	}
}
