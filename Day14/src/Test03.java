class MyException extends Exception{
	/*
	 * ����Ŭ������ ���� �� ����
	 * 1.extends Exception�� ���ش�.
	 * 2.public String getMessage()�� �������̵� ���ش�.
	 */
	private String message;
	public MyException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message=super.getMessage()+" : ���� ���� ���� Ŭ���� ";
		return message;
	}
	
}

public class Test03 {

	public static void main(String[] args) {
		try {
			throw new MyException("�����ڵ�");
			
		}catch(MyException e){
			System.out.println(e.getMessage());
		}

	}

}
