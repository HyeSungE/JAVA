import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int Room_size=in.nextInt();
		System.out.println("���� ���� : "+Room_size);

		int select=0;
		int Room_Num;
		boolean Room[]=new boolean[Room_size];//0�� �� �� 1�� ��� �� int->boolean���� �ϱ�
		String Room_State[]=new String[Room_size];
		
		for(int i=0;i<Room_size;i++) {
			Room[i]=true;
			Room_State[i]="�� ��";
		}
		while(select!=4) {
			System.out.print("1.�Խ�\t 2.���\t 3.����\t 4.���� : ");
			select=in.nextInt();
			
			/*
			 teacher -
			 int select = System.in.read()-48;
			 �ѱ��ڸ� �Է¹����� enterŰ�� ó���� ���ؼ� 
			 System.in.skip(5); �� ���ؼ� �Է½� ���ڴ� select�� ���� enter���� �������� �Ѵ�.*/
			
			switch(select){ // switch���ȿ����� ���ο� ���� ����� �ൿ�� �����ϱ�
			case 1:{
				System.out.print("�Խ��Ͻ� ���� ��ȣ : ");
				Room_Num=in.nextInt();
				if(!Room[Room_Num-1]) { //if(Room[Room_Num-1]==false)->if(!Room[Room_Num-1])
					System.out.println(Room_Num+"ȣ���� ���� ��� ���� ���Դϴ�.");
					break;
				}
				Room[Room_Num-1]=false;
				Room_State[Room_Num-1]="��� ��";
				System.out.println(Room_Num+"ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
				break;
			}
			case 2:{
				do {
				System.out.print("����Ͻ� ���� ��ȣ : ");
				Room_Num=in.nextInt();
				}while(Room_Num>Room_size||Room_Num<0);
				//while(Room_Num>Room_size);->while(Room_Num>Room_size||Room_Num<0);	
				if(Room[Room_Num-1]) { //if(Room[Room_Num-1]==true)->if(Room[Room_Num-1])
					System.out.println(Room_Num+"ȣ���� ���� �� ���Դϴ�.");
					break;
				}
				
				Room[Room_Num-1]=true;
				Room_State[Room_Num-1]="�� ��";
				System.out.println(Room_Num+"ȣ�ǿ��� ����ϼ̽��ϴ�.");
				break;
			}
			case 3:{
				for(int i=0;i<Room_size;i++) {
					System.out.println((i+1)+"ȣ�� - "+Room_State[i]);
				}
				break;
			}
			case 4:{
				System.out.println("���α׷��� �����մϴ�.");
				break;
				//switch���ȿ��� while���� ������ ���� ���� System.exit(0);�� ���ؼ� ������ �����Ű��
				}
			default : {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ��� "); // deafault�� ���ؼ� �߸��Է������� 
			}
			}
		}
	}

}
