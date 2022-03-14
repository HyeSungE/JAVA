import java.io.*;

public class Testinput03 {

	public static void main(String[] args) throws IOException {
		System.out.println("다음 과목 중 좋아하는 과목은 ?");
		System.out.println("1.국어 2.영어 3.수학 4.없다 : ");
		int res=System.in.read() - '0';
		//char res=(char)System.in.read();

		System.out.println("입력하신 값은 " + res + "입니다.");
		
	
		System.out.println();

	}

}
