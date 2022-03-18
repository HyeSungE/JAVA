
public class TestArray04 {

	public static void main(String[] args) {
		int n=1;

		int arr[][]=new int[5][5];
	
		/*
		for(int i=0;i<=4;i++) {
			arr[0][i]=n;
			n++;
		}

		for(int i=1;i<=4;i++) {
			arr[i][4]=n;
			n++;
		}

		for(int i=3;i>=0;i--) {
			arr[4][i]=n;
			n++;
		}

		for(int i=3;i>=1;i--) {
			arr[i][0]=n;
			n++;
		}

		for(int i=1;i<=3;i++) {
			arr[1][i]=n;
			n++;
		}

		for(int i=2;i<=3;i++) {
			arr[i][3]=n;
			n++;
		}
		
		for(int i=2;i>=1;i--) {
			arr[3][i]=n;
			n++;
		}

		for(int i=2;i>1;i--) {
			arr[i][1]=n;
			n++;
		}

		for(int i=2;i<3;i++) {
			arr[2][i]=n;
			n++;
		}
		
		*/
		int co=0;
		for (int k=0; k<3; ++k){
			for(int i=k; i<=4-k; ++i)	arr[k][i] = ++co;
			for(int i=k+1; i<=4-k; ++i)	arr[i][4-k] = ++co;
			for(int i=3-k; i>=k; --i) arr[4-k][i] = ++co;
			for(int i=3-k; i>=k+1; --i) arr[i][k] = ++co;
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
	}
}
