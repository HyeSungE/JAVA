class A06{}
interface B06{
	public static final int a=10;
	public static int b=20;
	public final int c=30;
	public int d=40;
	int e=50;
	//private f=60; interface�� ����ʵ�� ���� public / static / final�� �����ϴ�
	
	public abstract void disp(); // interface������ �߻�޼ҵ常 ���𰡴��ϴ�.
	public void disp2();
	void disp3();
	//public void disp4(){
	//	System.out.println("aaa");
	//}
	static class Inner06{}
}
public class TestObject06 {

	public static void main(String[] args) {
		B06.Inner06 bi = new B06.Inner06();//static ��øŬ���� ����
		System.out.println(B06.a);
		System.out.println(B06.b);
		//B06.a=10; final ������ ���� ������ �� ���� -> ���� �ٲ� ���ɼ��� �����Ƿ� ���߻���� ���ȴ�
		//B06.b=10; interface������ ��� ����ʵ�� ��� public static final�� �ν��Ѵ�.
		System.out.println(B06.c);
		System.out.println(B06.d);
		System.out.println(B06.e);
	}

}
