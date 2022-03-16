import java.util.*;
public class TestArray03 {

	public static void main(String[] args) {
		String Name[]=new String[5];
		String Phone[]=new String[5];
		
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<Name.length;i++) {
			System.out.print(i+1+"번째 " + "이름입력 : "  );
			Name[i]=in.next();
			System.out.print(i+1+"번째 " + "전화번호입력 : "  );
			Phone[i]=in.next();
		}
		
		for(int i=0;i<Name.length;i++) {
			System.out.println(i+1+"번째 " + "이름 : "+Name[i]);
			System.out.println(i+1+"번째 " + "전화 : " +Phone[i]);
		}
	}	

}