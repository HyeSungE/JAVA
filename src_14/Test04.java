import java.util.*;
class MySubException extends Exception{
	private String message;
	public MySubException(String msg) {
		super(msg);
	}
	public String getMessage() {
		message = super.getMessage() + "점수는 0점에서 100점 사이값만 입력해 주세요!!";
		return message;
	}
}
public class Test04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			System.out.print("국어점수를 입력 : ");
			int kor = in.nextInt();
			if (kor<0 || kor>100) {
				throw new MySubException("국어");
			}
			System.out.println("입력하신 국어점수는 " + kor +"점 입니다.");
		}catch(MySubException e) {
			System.err.println(e.getMessage());
		}
	}
}












