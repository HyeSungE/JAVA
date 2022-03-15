
public class TestFor06 {
	public static void main(String[] args) {
		int co=0;
		for(int i=1;i<=9;i++) {
			if(i<=5) co++;
			else co--;
			for(int j=1;j<=co;j++) {
				System.out.printf("%d", j);
				}
			System.out.println();
		}
	}

}
