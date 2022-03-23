class A07{}
interface B07{}
//클래스는 클래스를 상속 받을 수 있다.
class C07 extends A07{}
//클래스는 인터페이스를 상속 받을 수 있다.
class D07 implements B07{}
//클래스는 클래스를 상속받고 인터페이스를 상속 받을 수 있다.
class E07 extends A07 implements B07{}
//인터페이스는 인터페이스를 상속 받을 수 있다.
interface F07 extends B07{}
/*인터페이스는 클래스를 상속 받을 수 없다.*/
//인터페이스는 인터페이스를 다중 상속 받을 수 있다.
interface G07 extends B07,F07{}
//클래스는 인터페이스를 다중 상속 받을 수 있다.
class H07 implements B07,F07,G07{}
//클래스는 클래스를 상속 받고, 인터페이스를 다중 상속 받을 수 있다.
class I07 extends A07 implements B07,F07{}
/* 인터페이스를 통해서 여러 클래스를 묶는 방법 
 * 여러 클래스에게 인터페이스를 상속받게한다
 * interface AA{}
 * class A implements AA{}
 * class B implements AA{}
 * class C implements AA{}
 * 
 * AA ap=new A();
 * AA bp=new B();
 * AA cp=new C();
 * 
 * AA aa[]=new AA[3];
 * aa[0]=new A();
 * aa[0]=new B();
 * aa[0]=new C();
 */
public class TestObject07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
