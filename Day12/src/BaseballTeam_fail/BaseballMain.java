package BaseballTeam_fail;
import java.util.*;
public class BaseballMain {
	public static void main(String args[]) {
	Func bb=new playerRevise();
	
	Scanner in = new Scanner(System.in);
	String arr[]={"�Ｚ","KT","LG","��ȭ","���","�Ե�","NC","�λ�","�ؼ�","SSG"};
	
	
	while(true) {
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		String TeamName=in.next();
		System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
		int select=in.nextInt();
		switch(select) {
		case 1 :	bb.input(TeamName); break;
		case 2 :	bb.print(TeamName); break;
		case 3 :	bb.modifi(TeamName); break;
		case 4 :	bb.delete(TeamName); break;
		case 5 :	bb.quit(); break;
		default :
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}
/*while(start) {
System.out.print("���� �̸��� �Է��ϼ��� : ");
String TeamName=in.next();
for(int i=0;i<arr.length;i++) {
	if(TeamName.equals(arr[i])) start=false;
}
}TeamName.equals(arr[i])*/
