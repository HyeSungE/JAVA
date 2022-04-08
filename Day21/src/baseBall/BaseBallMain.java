package baseBall;

import java.io.IOException;
import java.util.*;

public class BaseBallMain {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		BaseBallPro pro = new BaseBallProImpl();
		
		while(true) {
			String club = null;
			do {
				System.out.print("구단명을 입력 : ");
				club = in.next();
			}while(!pro.isClub(club)); 
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.output(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.exit(); break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
