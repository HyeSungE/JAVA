import java.util.Scanner;

class MySubException extends Exception{
	/*
	 * 예외클래스를 만들 때 조건
	 * 1.extends Exception을 해준다.
	 * 2.public String getMessage()를 오버라이드 해준다.
	 */
	private String message;
	public MySubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message=super.getMessage()+"0~100 사이의 값만 입력해주세요 ! ";
		return message;
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		try {
			System.out.print("국어 점수 입력 : ");
			int kor=in.nextInt();
			if(kor>100 || kor<1) {
				throw new MySubException("국어 : ");
			}
			System.out.println("국어 점수 : "+kor);
		}
		catch(MySubException e){
			System.err.println(e.getMessage());
		}
	}
}
