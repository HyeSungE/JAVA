package baseBall;

import java.io.IOException;
import java.util.*;

public class BaseBallMain {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BaseBallPro pro = new BaseBallProImpl();
		
		while(true) {
			String club = null;
			do {
				System.out.print("���ܸ��� �Է� : ");
				club = in.next();
			}while(!pro.isClub(club)); 
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.output(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.exit(); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
