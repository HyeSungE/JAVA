import java.util.Scanner;

class MySubException extends Exception{
	/*
	 * ����Ŭ������ ���� �� ����
	 * 1.extends Exception�� ���ش�.
	 * 2.public String getMessage()�� �������̵� ���ش�.
	 */
	private String message;
	public MySubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message=super.getMessage()+"0~100 ������ ���� �Է����ּ��� ! ";
		return message;
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			System.out.print("���� ���� �Է� : ");
			int kor=in.nextInt();
			if(kor>100 || kor<1) {
				throw new MySubException("���� : ");
			}
			System.out.println("���� ���� : "+kor);
		}
		catch(MySubException e){
			System.err.println(e.getMessage());
		}
	}
}
