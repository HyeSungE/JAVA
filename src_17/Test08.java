class A08 extends Thread{
	public void disp() {
	
	}
	public void run() {
		System.out.println("A08 Ŭ���� �Դϴ�!!");
		System.out.println("A08 Ŭ���� ���� : " + Thread.currentThread());
		System.out.println("A08 Thread ���� : " + Thread.activeCount());
	}
}
public class Test08 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ� ����!!");
		System.out.println("main Ŭ���� ���� : " + Thread.currentThread());
		System.out.println("main Thread ���� : " + Thread.activeCount());
		A08 ap = new A08();
		ap.setName("A08Ŭ����");
		ap.setPriority(10);//10�� ���� ����, 5�� default, 1�� ���� ����
		ap.start();
		try {
			Thread.sleep(3000);
			ap.join(2000);
		}catch(InterruptedException e) {}
		System.out.println("main �޼ҵ� ��!!");
		
	}
}




