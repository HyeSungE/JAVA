package Grade_fail;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		while(true) {
			Func std=new Score();
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			Scanner in=new Scanner(System.in);
			
			int select=in.nextInt();
	
			switch(select) {
				case 1 :	
					std.input(); 
					break;
				case 2 :	
					std.print(); 
					break;
				case 3 :	
					std.modifi(); 
					break;
				case 4 :	
					std.delete(); 
					break;
				case 5 :	
					std.quit();
					break;
				default :
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
					}
				}
	}

}