
public class TestFor07 {
	public static void main(String[] args) {
		int co=6;
		
		for(int i=1;i<=9;i++) {
			if(i<=5) co--;//i�� 1�̹Ƿ� co�� 6����5�� �����Ѵ�.
			else co++;
			
			for(int j=1;j<=co;j++) {
				System.out.printf("%d", j);
				}
			System.out.println();
		}
	}

}
