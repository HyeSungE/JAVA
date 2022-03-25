package BaseballTeam_fail;
import java.util.*;
public class BaseballMain {
	public static void main(String args[]) {
	Func bb=new playerRevise();
	
	Scanner in = new Scanner(System.in);
	String arr[]={"삼성","KT","LG","한화","기아","롯데","NC","두산","넥센","SSG"};
	
	
	while(true) {
		System.out.print("구단 이름을 입력하세요 : ");
		String TeamName=in.next();
		System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
		int select=in.nextInt();
		switch(select) {
		case 1 :	bb.input(TeamName); break;
		case 2 :	bb.print(TeamName); break;
		case 3 :	bb.modifi(TeamName); break;
		case 4 :	bb.delete(TeamName); break;
		case 5 :	bb.quit(); break;
		default :
			System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
/*while(start) {
System.out.print("구단 이름을 입력하세요 : ");
String TeamName=in.next();
for(int i=0;i<arr.length;i++) {
	if(TeamName.equals(arr[i])) start=false;
}
}TeamName.equals(arr[i])*/
