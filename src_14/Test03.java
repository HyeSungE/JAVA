class MyException extends Exception{
	//예외클래스 만들기
	//1. extends Exception을 해준다
	//2. public String getMessage()를 오버라이드 해준다
	private String message;
	public MyException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		message = super.getMessage() + " : 내가 만든 예외 클래스!!";
		return message;
	}
}
public class Test03 {
	public static void main(String[] args) {
		try {
			throw new MyException("예외코드");
		}catch(MyException e) {
			System.err.println(e.getMessage());
		}
	}
}











