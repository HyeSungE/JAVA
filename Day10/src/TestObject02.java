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
		System.out.println("A02�� y: "+y);
	}
}
class B02 extends A02{
	int z;
	int y;
	/*public B02(int z) {
		this();
		z=30;
		//this()�θ� ���� super()�� �ִ�.
	}*/
	public B02() {
		//super();������ -> �θ�Ŭ���� default������ȣ��
		super(10,20);
		//����� ������ �θ�Ŭ������ ����ʵ�� �θ�Ŭ������ �����ڷ� �ʱⰪ�� �ش�.
		//super�޼ҵ�� �������� ù�ٿ����� ��� �����ϴ�.
		z=30;
		y=100;
	}
	@Override  //�θ��� �޼ҵ� �̸��� �����ͼ� ���븸 �ٲپ� ����� ��
	/*annotation - ������
	 * �� �޼Ҵ� �������̵��Ұž�~ ��� �˷��� ����, �������̵� ��Ģ�� ��߳��ٸ� ������ ����
	 * �ڽĸ޼ҵ尡 �θ��Ǹ޼ҵ��ϰ� �ٸ��ٸ� @Override�� ������ ����.
	 */
	void disp() {
		System.out.println(x);//�ڽ�Ŭ������ �θ�Ŭ������ �Ȱ��� �̸��� ����ʵ带 ������ ���� ������ 
							  //�� ����ʵ�� this�� super �� �� ���ٰ����ϴ�
		System.out.println("B02�� y: "+y);
		System.out.println("B02�� y: "+this.y);
		System.out.println("B02�� �θ�Ŭ���� A02�� y: "+super.y);
		System.out.println(z);
	}
}
//�����ڰ������� JVM�� �˾Ƽ� �������
public class TestObject02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B02 bp=new B02();
		bp.disp();
	}

}
