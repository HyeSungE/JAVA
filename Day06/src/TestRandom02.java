import java.util.*;
public class TestRandom02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int Answer=(int)(Math.random()*100)+1;//1���� 100���� �� ���� ����
	    int count=0;
		int player=0;
		System.out.println("1���� 100���� �߿��� ������ ������ ���߽ÿ�");
		while(player!=Answer) {
			System.out.print("������ �Է��Ͻÿ� : ");
			player=in.nextInt();
			count++;
			if(player<Answer) {
				System.out.println("�� ���� �� �Դϴ�.");
			}else if(player>Answer) {
				System.out.println("�� ���� �� �Դϴ�.");
			}
		}
		System.out.println("�����Դϴ�.\n"+count+"�� ���� ������ ���߼̽��ϴ�.");
	}

}
