import java.util.*;
public class TestFor02 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int n=in.nextInt();
		System.out.print(n+"�� ��� : ");
		for(int i=1;i<=n/2;i++) {
		//for(int i=1;i<=n;i++) 
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print(n);
	}
}
