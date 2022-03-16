import java.util.*;
public class TestArray04{

	public static void main(String[] args) {
		int num[]=new int[10];
		int sum=0;
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<num.length;i++) {
			System.out.print(i+1+"번쨰 수를 입력하시오 : ");
			num[i]=in.nextInt();
			sum+=num[i];
		}
		System.out.print("입력한 수 : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("합 : "+sum+" 평균 : "+(sum/num.length));
	}	

}
