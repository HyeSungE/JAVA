import java.util.*;
public class TestRandom04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int com;
		int player=-1;
		
		com=(int)(Math.random()*3)+1;
		
		while(player!=4) {
			System.out.println("1-���� 2-���� 3-�� 4-����");
			System.out.print("���� ���� ���� �����Ͻÿ�: ");
			player=in.nextInt();
		switch(com) {
			case 1:
				if(player==com) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�����ϴ�.");
				}
				else if(player==2) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�����ϴ�.");
				}
				else if(player==3) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�̰���ϴ�.");
				}
				break;
			case 2:
				if(player==com) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�����ϴ�.");
				}
				else if(player==3) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�����ϴ�.");
				}
				else if(player==1) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�̰���ϴ�.");
				}
				break;
			case 3:
				if(player==com) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�����ϴ�.");
				}
				else if(player==2) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�����ϴ�.");
				}
				else if(player==1) {
					System.out.println("��ǻ�� : "+com+" = "+"�÷��̾� : "+player);
					System.out.println("�̰���ϴ�.");
				}
				break;
		}
		}
	}

}
/*
 *int c_i=(int)(Math.random()*3)+1;
 *int player[]=new int[3];
 *int com[]=new int[3];
 *
 *int p_i=in.nextInt();
 *
 *if(player[p_i]=com[c_i])
 *	System.out.println("�����ϴ�");
 *
 */
