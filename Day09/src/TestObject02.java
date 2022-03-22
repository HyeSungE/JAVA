import java.util.*;
import java.io.*;
class RoomMg{
	int room_n;
	boolean room[];
	Scanner in;
	RoomMg(){
		in=new Scanner(System.in);
		System.out.print("방의 개수를 입력 : ");
		room_n=in.nextInt();
		room=new boolean[room_n];
	}
	//입실
	void input() {
		while(true) {
			System.out.print("입실하실 방의 번호를 입력 : ");
			int roomNum=in.nextInt();
			if(roomNum<1||roomNum>room_n) {
				System.out.println("방 번호는 1 ~"+room_n+" 까지 있습니다.");
				continue;
			}
			if(!room[roomNum-1]) {
				room[roomNum-1]=true;
				System.out.println(roomNum+"번 호실에 입실하셨습니다.");
			}
			else {
				System.out.println(roomNum+"번 호실은 사용중인 방입니다.");
				
			}
			return ;
		}
	}
	//퇴실
	void output() {
		while(true) {
			System.out.print("퇴실하실 방의 번호를 입력 : ");
			int roomNum=in.nextInt();
			if(roomNum<1||roomNum>room_n) {
				System.out.println("방 번호는 1 ~"+room_n+" 까지 있습니다.");
				continue;
			}
			if(room[roomNum-1]) {
				room[roomNum-1]=false;
				System.out.println(roomNum+"번 호실에서 퇴실하셨습니다.");
			}
			else {
				System.out.println(roomNum+"번 호실은 빈 방입니다.");
				
			}
			return ;
		}
	}
	//보기
	void view() {
		for(int i=0;i<room_n;i++) {
			if(room[i]) {
				System.out.println(i+1+"호실은 사용중인 방");
			}
			else {
				System.out.println(i+1+"호실은 빈 방");
			}
		}
	}
	//종료
	void exit() {
		System.out.println("프로그램을 종료");
		System.exit(0);
	}
}
public class TestObject02 {
	public static void main(String[] args)  throws IOException{
		RoomMg rm=new RoomMg();
		
		while(true){
			System.out.print("1.입실 2.퇴실 3.보기 4.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	rm.input(); break;
			case 2 :	rm.output(); break;
			case 3 :	rm.view(); break;
			case 4 :	rm.exit(); break;
			default :	System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
			}
	}
	
}