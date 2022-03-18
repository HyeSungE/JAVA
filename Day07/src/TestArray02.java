
public class TestArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		
		
		int n=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=n;
				System.out.printf("%d\t",arr[i][j]);
				n+=1;
			}
			
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			for(int j=4;j>=0;j--) {	
				System.out.printf("%d\t",arr[j][i]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=4;i>=0;i--) {
			for(int j=4;j>=0;j--) {	
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
		
System.out.println();
		
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=4;j++) {	
				System.out.printf("%d\t",arr[j][i]);
			}
			System.out.println();
		}
	}

}
