package Grade;
import java.io.*;
public class ScoreMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Function pro = new Score();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.print(); break;
			case 3 :	pro.modifi(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.quit(); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}

}