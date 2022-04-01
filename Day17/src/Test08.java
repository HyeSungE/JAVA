class A08 extends Thread{
	public void run() {
		System.out.println("A08 CLASS");
		System.out.println("A08 class info : "+Thread.currentThread());
		System.out.println("A08 Thread number : "+Thread.activeCount());
	}
}
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		System.out.println("main class info : "+Thread.currentThread());
		System.out.println("main Thread number : "+Thread.activeCount());
		A08 ap=new A08();
		ap.setName("A08 class");
		ap.setPriority(10);//실행되는 우선순위 설정 10:fast ----- slow:1
		ap.start();
		try {
			Thread.sleep(3000);
			ap.join(2000);
		}catch(InterruptedException e) {
		}
		System.out.println("main end");
	}

}
