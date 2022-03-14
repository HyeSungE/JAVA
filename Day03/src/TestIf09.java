import java.util.*;
public class TestIf09 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("메뉴를 입력하시오 : ");
		String menu=in.next();
		int price=0;
		
		switch(menu) {
		case "짜장면" :
			price=4000;
			break;
		case "짬뽕" :
			price=6000;
			break;
		case "우동" :
			price=6000;
			break;
		case "볶음밥" :
			price=7000;
			break;	
		default :
			System.out.print("모르겠습니다.");
		}
		if(price!=0)
			System.out.printf("메뉴의 가격은 %d입니다.",price);
	}

}
