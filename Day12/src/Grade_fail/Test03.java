package Grade_fail;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		while(true) {
			Func std=new Score();
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
			Scanner in=new Scanner(System.in);
			
			int select=in.nextInt();
	
			switch(select) {
				case 1 :	
					std.input(); 
					break;
				case 2 :	
					std.print(); 
					break;
				case 3 :	
					std.modifi(); 
					break;
				case 4 :	
					std.delete(); 
					break;
				case 5 :	
					std.quit();
					break;
				default :
					System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
					}
				}
	}

}