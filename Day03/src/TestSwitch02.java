import java.util.Scanner;
public class TestSwitch02 {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int kor=in.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int eng=in.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int math=in.nextInt();
		
		int avg=(kor+eng+math)/3;
		char grade='��';
		
		switch(avg) {
			case 100:
			case 90:
				grade='��';
				break;
			case 80 :
				grade='��';
				break;
			case 70 :
				grade='��';
				break;
			case 60 :
				grade='��';
				break;
			default : 
				grade='��';
				break;
		}
		
		System.out.printf("������ %c �Դϴ�",grade);
	}
	
}
