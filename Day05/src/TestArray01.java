import java.util.*;
public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int arr[]=new int[5];//�迭 ����
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"��° �л� �������� �Է� : ");
			arr[i]=in.nextInt();
		}
		
	}
}
