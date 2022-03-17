import java.util.*;
public class TestRandom03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=-1;
		int com_Start=1,com_End=100;
		int com_Area;
		int menu=-1;
		Scanner in=new Scanner(System.in);
		
		System.out.println("1부터 100까지 중 하나의 숫자를 생각하고 ENTER키를 눌러주세요 ");
		in.nextLine();
		
		while(menu!=3) {
			com_Area=com_End - com_Start +1;
			com=(int)(Math.random()*com_Area)+com_Start;
			
			System.out.println("당신이 선택한 수는 "+com+"입니다.");
			System.out.print("1.up 2.down 3.정답 : ");
			menu=in.nextInt();
			
			switch(menu) {
				case 1:{
					com_Start=com+1;
					break;
				}
				case 2: {
					com_End=com-1;
					break;
				}
				case 3 :{
					System.out.println("정답입니다.");
				}
			}
			
		}
	}

}
