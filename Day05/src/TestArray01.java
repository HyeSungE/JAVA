import java.util.*;
public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int arr[]=new int[5];//배열 선언
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 학생 국어점수 입력 : ");
			arr[i]=in.nextInt();
		}
		
	}
}
