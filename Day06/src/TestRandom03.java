import java.util.*;
public class TestRandom03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=-1;
		int com_Start=1,com_End=100;
		int com_Area;
		int menu=-1;
		Scanner in=new Scanner(System.in);
		
		System.out.println("1���� 100���� �� �ϳ��� ���ڸ� �����ϰ� ENTERŰ�� �����ּ��� ");
		in.nextLine();
		
		while(menu!=3) {
			com_Area=com_End - com_Start +1;
			com=(int)(Math.random()*com_Area)+com_Start;
			
			System.out.println("����� ������ ���� "+com+"�Դϴ�.");
			System.out.print("1.up 2.down 3.���� : ");
			menu=in.nextInt();
			
			switch(menu) {
				case 1:{
					com_Start=com+1;
					break;
				}
				case 2: {
					com_End=com-1;
					break;
				}
				case 3 :{
					System.out.println("�����Դϴ�.");
				}
			}
			
		}
	}

}
