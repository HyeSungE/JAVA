class A04{
	int a,b;
	public A04() {
		a=10;
		b=20;//super.b
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
class B04 extends A04{
	int c;
	//int b;
	public B04() {
		c=30;
		//b=100;//this.b
		}
	
	public void disp() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}
public class TestObject04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A04 ap=new A04();
		A04 bp=ap;
		
		//객체의 연산자는 대입연산만 가능하다.
		//1. 같은 클래스일 때  2.상속관계일 떄
		/*스택에는 클래스 객체의 주소값이 들어가고 힙에는 그 클래스에서 사용하는 
		데이터의 내용이 들어간다. 따라서 bp에는 ap가 만든 객체의 주소값이 들어간다.
		따라서 ap와bp는 같은 객체를 가리키게 되므로 ap.a의 값을 변경하면 bp.a의 값도
		변경된다. 즉, 대입연산은 같은 객체를 가리키게 된다. 객체를 새로 생성하지 않는다*/
		ap.a=12;
		System.out.println("ap.a = "+ap.a);
		System.out.println("bp.a = "+bp.a);
		
		B04 cp=new B04();
		A04 dp=cp;//자식의 객체를 부모의 객체에 대입하는 것 : *업캐스팅*
		
		//업캐스팅 : 업캐스팅된 객체는 자신이 가지고 있는 멤버필드만 접근 가능
		//super 멤버필드만 접근 가능하다.
		
		//업캐스팅된 상태에서 오버라이드 된 메소드를 실행시키면 자식의 메소드가 실행이 된다.
		
		dp.disp();
		
		System.out.println("dp.a = "+dp.a);
		System.out.println("dp.b = "+dp.b);
		//System.out.println("dp.c = "+dp.c);
		//-> 따라서 super의 멤버필드가 아닌 c는 접근하지 못한다.
	
		A04 ep=new B04();
		//A04 ep=new A04();
		B04 fp=(B04)ep; // 부모의 객체를 자신의 객체에 대입하는 것 : *다운캐스팅*
		//따라서 다운캐스팅할 때는 강제형변환을 해주어야한다.
		
		//다운캐스팅의 전제 조건 
		/*
		 * 1.반드시 부모객체는 업캐스팅된 상태여야 한다. A04 ep= new B04();
		 * 2.자식의 클래스로 캐스팅 연산을 해주어야 한다.
		 */
		System.out.println("fp.a = "+fp.a);
		System.out.println("fp.b = "+fp.b);
		System.out.println("fp.c = "+fp.c);
		
	}

}
