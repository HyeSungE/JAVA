import java.util.*;

public class TestArray01 {
	/*
	 * SELECT SORT
	 */
	public static void main(String[] args) {
		int size=10;
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print(i+1+"번째 수 입력 : ");
			arr[i]=in.nextInt();
		}
	
		System.out.print("정렬 전  : ");
			
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("\n정렬 후  : ");
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
	}

}
