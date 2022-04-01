class A08 extends Thread{
	public void disp() {
	
	}
	public void run() {
		System.out.println("A08 클래스 입니다!!");
		System.out.println("A08 클래스 정보 : " + Thread.currentThread());
		System.out.println("A08 Thread 갯수 : " + Thread.activeCount());
	}
}
public class Test08 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작!!");
		System.out.println("main 클래스 정보 : " + Thread.currentThread());
		System.out.println("main Thread 갯수 : " + Thread.activeCount());
		A08 ap = new A08();
		ap.setName("A08클래스");
		ap.setPriority(10);//10이 제일 빠름, 5는 default, 1은 제일 늦음
		ap.start();
		try {
			Thread.sleep(3000);
			ap.join(2000);
		}catch(InterruptedException e) {}
		System.out.println("main 메소드 끝!!");
		
	}
}




