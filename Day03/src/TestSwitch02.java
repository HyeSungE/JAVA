import java.util.Scanner;
public class TestSwitch02 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("국어 점수를 입력하시오 : ");
		int kor=in.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		int eng=in.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		int math=in.nextInt();
		
		int avg=(kor+eng+math)/3;
		char grade='수';
		
		switch(avg) {
			case 100:
			case 90:
				grade='수';
				break;
			case 80 :
				grade='우';
				break;
			case 70 :
				grade='미';
				break;
			case 60 :
				grade='양';
				break;
			default : 
				grade='가';
				break;
		}
		
		System.out.printf("성적은 %c 입니다",grade);
	}
	
}
