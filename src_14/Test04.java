import java.util.*;
class MySubException extends Exception{
	private String message;
	public MySubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message = super.getMessage() + "������ 0������ 100�� ���̰��� �Է��� �ּ���!!";
		return message;
	}
}
public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("���������� �Է� : ");
			int kor = in.nextInt();
			if (kor<0 || kor>100) {
				throw new MySubException("����");
			}
			System.out.println("�Է��Ͻ� ���������� " + kor +"�� �Դϴ�.");
		}catch(MySubException e) {
			System.err.println(e.getMessage());
		}
	}
}












