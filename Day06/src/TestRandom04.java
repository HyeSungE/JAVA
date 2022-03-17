import java.util.*;
public class TestRandom04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int com;
		int player=-1;
		
		com=(int)(Math.random()*3)+1;
		
		while(player!=4) {
			System.out.println("1-가위 2-바위 3-보 4-종료");
			System.out.print("가위 바위 보를 선택하시오: ");
			player=in.nextInt();
		switch(com) {
			case 1:
				if(player==com) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("비겼습니다.");
				}
				else if(player==2) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("졌습니다.");
				}
				else if(player==3) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("이겼습니다.");
				}
				break;
			case 2:
				if(player==com) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("비겼습니다.");
				}
				else if(player==3) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("졌습니다.");
				}
				else if(player==1) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("이겼습니다.");
				}
				break;
			case 3:
				if(player==com) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("비겼습니다.");
				}
				else if(player==2) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("졌습니다.");
				}
				else if(player==1) {
					System.out.println("컴퓨터 : "+com+" = "+"플레이어 : "+player);
					System.out.println("이겼습니다.");
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
 *	System.out.println("비겼습니다");
 *
 */
