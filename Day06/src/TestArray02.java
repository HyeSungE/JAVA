import java.util.*;
public class TestArray02 {
	/*
	 * BUBBLE SORT
	 */
	public static void main(String[] args) {
		int SIZE=10;
		Scanner in=new Scanner(System.in);
		int arr[]=new int[SIZE];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"��° �� �Է� : ");
			arr[i]=in.nextInt();
		}
		
		System.out.print("���� ��  : ");
		
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+" ");
		
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
			}
		System.out.print("\n���� ��  : ");
			
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+" ");
	}

}
