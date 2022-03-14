import java.util.*;
public class Testif06 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("첫번째 수를 입력하시오 : ");
		int a=in.nextInt();
		System.out.print("두번째 수를 입력하시오 : ");
		int b=in.nextInt();
		System.out.print("세번째 수를 입력하시오 : ");
		int c=in.nextInt();
		
		/*if(a>=b) {
			if(b>=c) {
				System.out.printf("%d >= %d >= %d",a,b,c);
			}
			else {
				System.out.printf("%d >= %d >= %d",a,c,b);
			}
		}
		else if(b>=a) {
			if(a>=c) {
				System.out.printf("%d >= %d >= %d",b,a,c);
			}
			else {
				System.out.printf("%d >= %d >= %d",b,c,a);
			}
		}
		else if(c>=a) {
			if(a>=b) {
				System.out.printf("%d >= %d >= %d",c,a,b);
			}
			else {
				System.out.printf("%d >= %d >= %d",c,b,a);
			}
		}*/
		
		if(b>a&&b>c) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		else if(c>a&&c>b) {
			int tmp=a;
			a=c;
			c=tmp;
		}
		
		if(c>b) {
			int tmp=b;
			b=c;
			c=tmp;
		}
		System.out.printf("%d >= %d >= %d",a,b,c);
	}
}
	
