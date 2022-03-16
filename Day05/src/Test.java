import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("방의 개수를 입력하시오 : ");
		int Room_size=in.nextInt();
		System.out.println("방의 개수 : "+Room_size);

		int select=0;
		int Room_Num;
		boolean Room[]=new boolean[Room_size];//0은 빈 방 1은 사용 중 int->boolean으로 하기
		String Room_State[]=new String[Room_size];
		
		for(int i=0;i<Room_size;i++) {
			Room[i]=true;
			Room_State[i]="빈 방";
		}
		while(select!=4) {
			System.out.print("1.입실\t 2.퇴실\t 3.보기\t 4.종료 : ");
			select=in.nextInt();
			
			/*
			 teacher -
			 int select = System.in.read()-48;
			 한글자만 입력받을시 enter키의 처리를 위해서 
			 System.in.skip(5); 를 통해서 입력시 숫자는 select로 가고 enter값을 버려져야 한다.*/
			
			switch(select){ // switch문안에서는 새로운 변수 만드는 행동을 지양하기
			case 1:{
				System.out.print("입실하실 방의 번호 : ");
				Room_Num=in.nextInt();
				if(!Room[Room_Num-1]) { //if(Room[Room_Num-1]==false)->if(!Room[Room_Num-1])
					System.out.println(Room_Num+"호실은 현재 사용 중인 방입니다.");
					break;
				}
				Room[Room_Num-1]=false;
				Room_State[Room_Num-1]="사용 중";
				System.out.println(Room_Num+"호실에 입실하셨습니다.");
				break;
			}
			case 2:{
				do {
				System.out.print("퇴실하실 방의 번호 : ");
				Room_Num=in.nextInt();
				}while(Room_Num>Room_size||Room_Num<0);
				//while(Room_Num>Room_size);->while(Room_Num>Room_size||Room_Num<0);	
				if(Room[Room_Num-1]) { //if(Room[Room_Num-1]==true)->if(Room[Room_Num-1])
					System.out.println(Room_Num+"호실은 현재 빈 방입니다.");
					break;
				}
				
				Room[Room_Num-1]=true;
				Room_State[Room_Num-1]="빈 방";
				System.out.println(Room_Num+"호실에서 퇴실하셨습니다.");
				break;
			}
			case 3:{
				for(int i=0;i<Room_size;i++) {
					System.out.println((i+1)+"호실 - "+Room_State[i]);
				}
				break;
			}
			case 4:{
				System.out.println("프로그램을 종료합니다.");
				break;
				//switch문안에서 while문을 끝내고 싶을 떄는 System.exit(0);을 통해서 강제로 종료시키기
				}
			default : {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요 "); // deafault를 통해서 잘못입력했을때 
			}
			}
		}
	}

}
