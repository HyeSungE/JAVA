
public class TestFor07 {
	public static void main(String[] args) {
		int co=6;
		
		for(int i=1;i<=9;i++) {
			if(i<=5) co--;//i가 1이므로 co는 6에서5로 감소한다.
			else co++;
			
			for(int j=1;j<=co;j++) {
				System.out.printf("%d", j);
				}
			System.out.println();
		}
	}

}
