package Student_Grade;

import java.util.*;

public class Student_Grade_Main {

	public static void main(String[] args) {
		Score sc=new Score();

		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			Scanner in=new Scanner(System.in);
			int select=in.nextInt();
		
			switch(select) {
			case 1 :	sc.input(); break;
			case 2 :	sc.print(); break;
			case 3 :	sc.modifi(); break;
			case 4 :	sc.delete(); break;
			case 5 :	sc.quit(); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
				}
			}
		}
	}