import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			int tot = 3/0;
			System.out.println("�������� : "  +kor +"��");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		//catch(InputMismatchException e) {
		//	System.out.println("���ڸ� �Է��ϼž� �մϴ�.");
		//catch(ArithmeticException e) {
		//	System.out.println("0���� �������� �����ϴ�.");
		}finally {
			//���Ǵ� ���� : try���� ������ ��Ƽ������� ���ȴ�
			System.out.println("finally ���� ����Ǿ����ϴ�.");
		}
	}
}










