class A02{
	int x,y;
	/*public A02(){
		x=10;
		y=20;
	}*/
	public A02(int x,int y) {
		this.x =x;
		this.y =y;
	}
	
	void disp() {
		System.out.println("A02의 y: "+y);
	}
}
class B02 extends A02{
	int z;
	int y;
	/*public B02(int z) {
		this();
		z=30;
		//this()부른 곳에 super()가 있다.
	}*/
	public B02() {
		//super();가생략 -> 부모클래스 default생성자호출
		super(10,20);
		//상속을 받으면 부모클래스의 멤버필드는 부모클래스의 생성자로 초기값을 준다.
		//super메소드는 생성자의 첫줄에서만 사용 가능하다.
		z=30;
		y=100;
	}
	@Override  //부모의 메소드 이름을 가져와서 내용만 바꾸어 만드는 것
	/*annotation - 길잡이
	 * 이 메소는 오버라이드할거야~ 라고 알려줌 만약, 오버라이드 규칙에 어긋난다며 오류가 난다
	 * 자식메소드가 부모의메소드하고 다르다면 @Override는 오류가 난다.
	 */
	void disp() {
		System.out.println(x);//자식클래스가 부모클래스의 똑같은 이름의 멤버필드를 가지고 있지 않으면 
							  //그 멤버필드는 this나 super 둘 다 접근가능하다
		System.out.println("B02의 y: "+y);
		System.out.println("B02의 y: "+this.y);
		System.out.println("B02의 부모클래스 A02의 y: "+super.y);
		System.out.println(z);
	}
}
//생성자가없으면 JVM이 알아서 만들어줌
public class TestObject02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B02 bp=new B02();
		bp.disp();
	}

}
