import java.util.*;
public class TestIf07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.print("국어 점수를 입력하시오 : ");
		int kor=in.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		int eng=in.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		int math=in.nextInt();
		
		double avg=(kor+eng+math)/3.0;
		char grade='수';
		if(avg>=90) {
			grade='수';
		}
		else if(avg>=80) {
			grade='우';
		}
		else if(avg>=70) {
			grade='미';
		}
		else if(avg>=60) {
			grade='양';
		}
		else {
			grade='가';
		}
		
		System.out.printf("성적은 %.2f %c 입니다",avg,grade);
	}
	
}
