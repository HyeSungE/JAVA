import java.util.*;
public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int kor;
		do {
			System.out.print("�������� �Է� : ");
			kor=in.nextInt();
		}
		while(kor<0||kor>100);
		System.out.println("�������� : "+kor);
	}

}
