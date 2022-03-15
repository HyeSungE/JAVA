
public class TestFor08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.printf(" ");
			}
			for(int k=1;k<=(i*2-1);k++) {//i*2-1 -> i+ 0 1 2 3 ..=>i+(i-1) 
				System.out.printf("%d",k);
			}
			System.out.println();
		}
	}
}

