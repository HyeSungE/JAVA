import java.util.*;
public class TestWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int h,m;
		
		while(true) {
			System.out.print("분을 입력 : ");
			m=in.nextInt();
			if(m==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(m==-1) {
				System.out.println("음수는 넣을 수 없습니다.");
			} 
			else {
			h=m/60;
			m=m%60;
	
			System.out.printf("입력하신 시간은 %d시간 %d분입니다.\n",h,m);
			}
		}
	}

}
