import java.util.*;
import java.io.*;
class RoomMg{
	int room_n;
	boolean room[];
	Scanner in;
	RoomMg(){
		in=new Scanner(System.in);
		System.out.print("���� ������ �Է� : ");
		room_n=in.nextInt();
		room=new boolean[room_n];
	}
	//�Խ�
	void input() {
		while(true) {
			System.out.print("�Խ��Ͻ� ���� ��ȣ�� �Է� : ");
			int roomNum=in.nextInt();
			if(roomNum<1||roomNum>room_n) {
				System.out.println("�� ��ȣ�� 1 ~"+room_n+" ���� �ֽ��ϴ�.");
				continue;
			}
			if(!room[roomNum-1]) {
				room[roomNum-1]=true;
				System.out.println(roomNum+"�� ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
			}
			else {
				System.out.println(roomNum+"�� ȣ���� ������� ���Դϴ�.");
				
			}
			return ;
		}
	}
	//���
	void output() {
		while(true) {
			System.out.print("����Ͻ� ���� ��ȣ�� �Է� : ");
			int roomNum=in.nextInt();
			if(roomNum<1||roomNum>room_n) {
				System.out.println("�� ��ȣ�� 1 ~"+room_n+" ���� �ֽ��ϴ�.");
				continue;
			}
			if(room[roomNum-1]) {
				room[roomNum-1]=false;
				System.out.println(roomNum+"�� ȣ�ǿ��� ����ϼ̽��ϴ�.");
			}
			else {
				System.out.println(roomNum+"�� ȣ���� �� ���Դϴ�.");
				
			}
			return ;
		}
	}
	//����
	void view() {
		for(int i=0;i<room_n;i++) {
			if(room[i]) {
				System.out.println(i+1+"ȣ���� ������� ��");
			}
			else {
				System.out.println(i+1+"ȣ���� �� ��");
			}
		}
	}
	//����
	void exit() {
		System.out.println("���α׷��� ����");
		System.exit(0);
	}
}
public class TestObject02 {
	public static void main(String[] args)  throws IOException{
		RoomMg rm=new RoomMg();
		
		while(true){
			System.out.print("1.�Խ� 2.��� 3.���� 4.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	rm.input(); break;
			case 2 :	rm.output(); break;
			case 3 :	rm.view(); break;
			case 4 :	rm.exit(); break;
			default :	System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
			}
	}
	
}