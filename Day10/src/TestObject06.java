class A06{}
interface B06{
	public static final int a=10;
	public static int b=20;
	public final int c=30;
	public int d=40;
	int e=50;
	//private f=60; interface의 멤버필드는 오직 public / static / final만 가능하다
	
	public abstract void disp(); // interface에서는 추상메소드만 선언가능하다.
	public void disp2();
	void disp3();
	//public void disp4(){
	//	System.out.println("aaa");
	//}
	static class Inner06{}
}
public class TestObject06 {

	public static void main(String[] args) {
		B06.Inner06 bi = new B06.Inner06();//static 중첩클래스 선언
		System.out.println(B06.a);
		System.out.println(B06.b);
		//B06.a=10; final 변수는 값을 변경할 수 없음 -> 값이 바뀔 가능성이 없으므로 다중상속이 허용된다
		//B06.b=10; interface에서의 모든 멤버필드는 모두 public static final로 인식한다.
		System.out.println(B06.c);
		System.out.println(B06.d);
		System.out.println(B06.e);
	}

}
