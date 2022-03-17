import java.util.*;
public class TestArray03 {
/*
 * INSERT SORT
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int SIZE=3;
		int arr[]=new int[SIZE];
		
		for(int i=0;i<SIZE;i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			arr[i]=in.nextInt();
		}
		

		System.out.print("정렬 전  : ");
		
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=1;i<SIZE;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
					j--;
				}else {
					break;
				}
			}
			arr[j+1]=temp;
		}
		System.out.print("\n정렬 후  : ");
		
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+" ");
	}
}
