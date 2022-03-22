package inner;

class Outer04{
	public void aaa() {
		System.out.println("aaa메소드입니다.");
	}
	public void bbb() {
		System.out.println("ddd메소드입니다.");
	}
	public void ccc() {
		System.out.println("ccc메소드입니다.");
	}
	
}
public class TestInner04 {
	public static void main(String[] args) {
		Outer04 ot=new Outer04() {
			//객체 생성시 기존 메소드를 수정해서(오버라이드)해서 사용한다
			//이 때 새롭게 수렁된 클래스로 객체를 만드는데 이 클래스의 이름은 따로 만들어 지지 않는다.
			public void bbb() {
				System.out.println("bbb메소드입니다.");
			}
		};
		ot.aaa(); ot.bbb(); ot.ccc();
	}
}
