class A07 extends Thread{
	public void run() {
		System.out.println("A07Ŭ���� �Դϴ�!!");
	}
}
class B07 implements Runnable{
	public void run() {
		System.out.println("B07Ŭ���� �Դϴ�!!");
	}
}
public class Test07 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ� ������......");
		B07 ap = new B07();
		Thread th = new Thread(ap);
		th.start();//ap�� run�޼ҵ带 ��Ƽ������� ��������ش�
		/*
		A07 ap = new A07();
		ap.start();		//�����带 ��ӹ��� Ŭ������ ��Ƽ������� �����ų���� start�޼ҵ带 ����Ѵ� 
		for(int i=1; i<=100; ++i) {
			System.out.print(i+"\t");
			if (i%10==0) System.out.println();
		}
		*/
		System.out.println("main �޼ҵ� ��......");
	}
}
