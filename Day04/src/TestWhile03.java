import java.util.*;
public class TestWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int n=1;
		int sum=0,con=0;
		while(n>0) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			n=a.nextInt();
			if(n>0) {
			sum+=n;
			con++;
			}
		}
		/*
		  while(true) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			n=a.nextInt();
			if(n>0) {
				sum+=n;
				con++;
			}
			else {
				break;
			}
		}*/
		System.out.printf("�� : %d\t ��� : %.1f\n", sum,(float)sum/con);
	}

}
