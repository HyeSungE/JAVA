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
		
		//��ü�� �����ڴ� ���Կ��길 �����ϴ�.
		//1. ���� Ŭ������ ��  2.��Ӱ����� ��
		/*���ÿ��� Ŭ���� ��ü�� �ּҰ��� ���� ������ �� Ŭ�������� ����ϴ� 
		�������� ������ ����. ���� bp���� ap�� ���� ��ü�� �ּҰ��� ����.
		���� ap��bp�� ���� ��ü�� ����Ű�� �ǹǷ� ap.a�� ���� �����ϸ� bp.a�� ����
		����ȴ�. ��, ���Կ����� ���� ��ü�� ����Ű�� �ȴ�. ��ü�� ���� �������� �ʴ´�*/
		ap.a=12;
		System.out.println("ap.a = "+ap.a);
		System.out.println("bp.a = "+bp.a);
		
		B04 cp=new B04();
		A04 dp=cp;//�ڽ��� ��ü�� �θ��� ��ü�� �����ϴ� �� : *��ĳ����*
		
		//��ĳ���� : ��ĳ���õ� ��ü�� �ڽ��� ������ �ִ� ����ʵ常 ���� ����
		//super ����ʵ常 ���� �����ϴ�.
		
		//��ĳ���õ� ���¿��� �������̵� �� �޼ҵ带 �����Ű�� �ڽ��� �޼ҵ尡 ������ �ȴ�.
		
		dp.disp();
		
		System.out.println("dp.a = "+dp.a);
		System.out.println("dp.b = "+dp.b);
		//System.out.println("dp.c = "+dp.c);
		//-> ���� super�� ����ʵ尡 �ƴ� c�� �������� ���Ѵ�.
	
		A04 ep=new B04();
		//A04 ep=new A04();
		B04 fp=(B04)ep; // �θ��� ��ü�� �ڽ��� ��ü�� �����ϴ� �� : *�ٿ�ĳ����*
		//���� �ٿ�ĳ������ ���� ��������ȯ�� ���־���Ѵ�.
		
		//�ٿ�ĳ������ ���� ���� 
		/*
		 * 1.�ݵ�� �θ�ü�� ��ĳ���õ� ���¿��� �Ѵ�. A04 ep= new B04();
		 * 2.�ڽ��� Ŭ������ ĳ���� ������ ���־�� �Ѵ�.
		 */
		System.out.println("fp.a = "+fp.a);
		System.out.println("fp.b = "+fp.b);
		System.out.println("fp.c = "+fp.c);
		
	}

}
