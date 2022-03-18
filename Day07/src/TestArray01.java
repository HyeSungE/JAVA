
public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]=new int[2][2];
		int []arr2[]=new int[2][2];
		int [][]arr3=new int[2][2];
		
		int[][]arr4=new int[2][];
		arr4[0]=new int[3];
		arr4[1]=new int[5];
		
		System.out.println(arr4[1].length);
		
		for(int i=0;i<arr4.length;i++) {
			for(int j=0;j<arr4[i].length;j++) {
				System.out.println(i+" , "+j);
			}
		}
	}

}
