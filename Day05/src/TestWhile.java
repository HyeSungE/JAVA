import java.util.*;
public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int kor;
		do {
			System.out.print("국어점수 입력 : ");
			kor=in.nextInt();
		}
		while(kor<0||kor>100);
		System.out.println("국어점수 : "+kor);
	}

}
