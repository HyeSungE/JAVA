import java.util.*;
public class TestIf09 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("�޴��� �Է��Ͻÿ� : ");
		String menu=in.next();
		int price=0;
		
		switch(menu) {
		case "¥���" :
			price=4000;
			break;
		case "«��" :
			price=6000;
			break;
		case "�쵿" :
			price=6000;
			break;
		case "������" :
			price=7000;
			break;	
		default :
			System.out.print("�𸣰ڽ��ϴ�.");
		}
		if(price!=0)
			System.out.printf("�޴��� ������ %d�Դϴ�.",price);
	}

}
