
public class TestObject02 {

	public static void main(String[] args) {
		//�޼ҵ��� ������:
		/*
		 * ���� �۾��� �ݺ������� �����Ű���� �� ��, �� �ݺ����� ����� �޼ҵ�� �����ϰ�, �� �޼Ҹ� ȣ���Ͽ� ���� ǥ���� �� ������ ����.
		 * ������ �ڵ带 ����ų� ������� �����ؼ� ǥ���ϸ� ���α׷��� ���ص��� �� ��������.
		 */
		System.out.println("aaa");
		disp();
		System.out.println("bbb");
		disp(10);
		System.out.println("ccc");
		disp();
	}
	/*
	 * �޼ҵ��� �̸��� ������ �Ű������� �ٸ� ���� : �޼ҵ� �����ε�
	 * �Ű������� �ٸ������� �Ű������� ������ �ڷ����̳� �ڷ����� �迭�� �ٸ� ����̴�.
	 */
	public static void disp() {
		System.out.println("*****");
	}
	public static void disp(int a) {
		for(int i=1;i<=a;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void disp(int a,double b){
		System.out.println("*****");
	}
	public static void disp(double a,int b){
		System.out.println("*****");
	}
}



