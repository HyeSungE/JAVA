import java.util.*;
public class TestIf07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int kor=in.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int eng=in.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int math=in.nextInt();
		
		double avg=(kor+eng+math)/3.0;
		char grade='��';
		if(avg>=90) {
			grade='��';
		}
		else if(avg>=80) {
			grade='��';
		}
		else if(avg>=70) {
			grade='��';
		}
		else if(avg>=60) {
			grade='��';
		}
		else {
			grade='��';
		}
		
		System.out.printf("������ %.2f %c �Դϴ�",avg,grade);
	}
	
}
