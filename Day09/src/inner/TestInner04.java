package inner;

class Outer04{
	public void aaa() {
		System.out.println("aaa�޼ҵ��Դϴ�.");
	}
	public void bbb() {
		System.out.println("ddd�޼ҵ��Դϴ�.");
	}
	public void ccc() {
		System.out.println("ccc�޼ҵ��Դϴ�.");
	}
	
}
public class TestInner04 {
	public static void main(String[] args) {
		Outer04 ot=new Outer04() {
			//��ü ������ ���� �޼ҵ带 �����ؼ�(�������̵�)�ؼ� ����Ѵ�
			//�� �� ���Ӱ� ������ Ŭ������ ��ü�� ����µ� �� Ŭ������ �̸��� ���� ����� ���� �ʴ´�.
			public void bbb() {
				System.out.println("bbb�޼ҵ��Դϴ�.");
			}
		};
		ot.aaa(); ot.bbb(); ot.ccc();
	}
}
