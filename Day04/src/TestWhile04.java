import java.util.*;
public class TestWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int h,m;
		
		while(true) {
			System.out.print("���� �Է� : ");
			m=in.nextInt();
			if(m==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(m==-1) {
				System.out.println("������ ���� �� �����ϴ�.");
			} 
			else {
			h=m/60;
			m=m%60;
	
			System.out.printf("�Է��Ͻ� �ð��� %d�ð� %d���Դϴ�.\n",h,m);
			}
		}
	}

}
