package Grade;
import java.util.*;
public class ScoreMain {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		ScoreManageImpl sm = new ScoreManageImpl();
		
		while(true) {
			System.out.println("1.입력 2.삭제 3.수정 4.출력 5.종료");
			System.out.print("메뉴를 입력하시오 : ");
			int ch = in.nextInt();
						
			switch(ch) {
				case 1: sm.input(); break;
				case 2: sm.delete(); break;
				case 3:	sm.edit(); break;
				case 4: sm.print(); break;
				case 5: sm.exit(); break;
			}
		}
	}

}
