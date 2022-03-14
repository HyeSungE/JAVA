
public class TestFor03 {

	public static void main(String[] args) {
		int sum1=0,sum2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				sum1+=i;
			else 
				sum2+=i;
		}
		System.out.println("짝수의 합은 "+ sum1 + "입니다.");
		System.out.println("홀수의 합은 "+ sum2 + "입니다.");
	}

}
