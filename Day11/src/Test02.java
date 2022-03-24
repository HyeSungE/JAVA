import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=new String();
		System.out.print("문자열을 입력 : ");
		str=in.nextLine();
		
		System.out.print("문자열을 거꾸로 출력 : ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
