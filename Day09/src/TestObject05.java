class A05{
	//int a;
	//static int b;
	final int a=10;//final�� �� �� ���� �ʱ⿡�ְ� �ٲ��� ���Ѵ�.����� �ʱ�ȭ�ϰų�
	static int b;//A05.b�� ����
	static {
		System.out.println("static������ ����Ǿ����ϴ�.");
	}
	{
		System.out.println("�Ϲݱ���{}�� ����Ǿ����ϴ�.");
		//�Ϲݱ������� �ʱ�ȭ�ؾ��Ѵ�
	}
	public A05(){
		//fianl����ʵ�� ������ ���� �ʱ�ȭ�ؾ��Ѵ�.
		System.out.println("������ A05()�� ����Ǿ����ϴ�.");
	}
	public A05(int a,int b){
		System.out.println("������ A05(int a,int b)�� ����Ǿ����ϴ�.");
	}
}
public class TestObject05 {

	public static void main(String[] args) {
		A05 ap=new A05();
		A05 bp=new A05(10,20);
		System.out.println(ap.a);
		System.out.println(A05.b);
	}

}
