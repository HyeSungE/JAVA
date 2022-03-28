package Student_Grade;

import java.util.*;

public class Student_Grade_Main {

	public static void main(String[] args) {
		Score sc=new Score();

		while(true) {
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
			Scanner in=new Scanner(System.in);
			int select=in.nextInt();
		
			switch(select) {
			case 1 :	sc.input(); break;
			case 2 :	sc.print(); break;
			case 3 :	sc.modifi(); break;
			case 4 :	sc.delete(); break;
			case 5 :	sc.quit(); break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
				}
			}
		}
	}