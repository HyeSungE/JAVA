import java.util.*;
public class TestArray04{

	public static void main(String[] args) {
		int num[]=new int[10];
		int sum=0;
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<num.length;i++) {
			System.out.print(i+1+"���� ���� �Է��Ͻÿ� : ");
			num[i]=in.nextInt();
			sum+=num[i];
		}
		System.out.print("�Է��� �� : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("�� : "+sum+" ��� : "+(sum/num.length));
	}	

}
