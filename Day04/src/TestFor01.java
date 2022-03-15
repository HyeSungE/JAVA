import java.util.*;
public class TestFor01 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0,n;
		float avg;
		
		for(int i=0;i<=4;i++) {
			System.out.print((i+1)+"번째 숫자를 입력하시오 : ");
			n=in.nextInt();
			sum+=n;
		}
		avg=sum/5;
		
		System.out.println("합 : "+sum);
		System.out.printf("평균 : %.2f\n",avg);
	}

}
