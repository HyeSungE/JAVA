import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		try {
		Scanner in=new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int kor=in.nextInt();
		if(kor>100 || kor<1) {
			throw new AreaException();
		}
			System.out.println("국어 점수 : "+kor);
		}catch(AreaException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
