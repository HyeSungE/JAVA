class A0{
	int a;
	static int b;
	public static void disp() {
		//static메소드에서는 static 멤버만 사용이 가능함
		//System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
public class TestObject04 {

	public static void main(String[] args) {
		// private가 붙으면 main에서 시작하는 코드들에 메모리가 접근을 못하기떄문에 public
		// static으로 main메소드를 미리 메모리에 올려놓음으로써 프로그램의 시작점을 정한것이다.
		
	}

}
