class A07{}
interface B07{}
//Ŭ������ Ŭ������ ��� ���� �� �ִ�.
class C07 extends A07{}
//Ŭ������ �������̽��� ��� ���� �� �ִ�.
class D07 implements B07{}
//Ŭ������ Ŭ������ ��ӹް� �������̽��� ��� ���� �� �ִ�.
class E07 extends A07 implements B07{}
//�������̽��� �������̽��� ��� ���� �� �ִ�.
interface F07 extends B07{}
/*�������̽��� Ŭ������ ��� ���� �� ����.*/
//�������̽��� �������̽��� ���� ��� ���� �� �ִ�.
interface G07 extends B07,F07{}
//Ŭ������ �������̽��� ���� ��� ���� �� �ִ�.
class H07 implements B07,F07,G07{}
//Ŭ������ Ŭ������ ��� �ް�, �������̽��� ���� ��� ���� �� �ִ�.
class I07 extends A07 implements B07,F07{}
/* �������̽��� ���ؼ� ���� Ŭ������ ���� ��� 
 * ���� Ŭ�������� �������̽��� ��ӹް��Ѵ�
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
