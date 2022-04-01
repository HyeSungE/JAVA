class A07 extends Thread{
	public void run() {
		System.out.println("A07클래스 입니다!!");
	}
}
class B07 implements Runnable{
	public void run() {
		System.out.println("B07클래스 입니다!!");
	}
}
public class Test07 {
	public static void main(String[] args) {
		System.out.println("main 메소드 실행중......");
		B07 ap = new B07();
		Thread th = new Thread(ap);
		th.start();//ap의 run메소드를 멀티스레드로 실행시켜준다
		/*
		A07 ap = new A07();
		ap.start();		//스레드를 상속받은 클래스를 멀티스레드로 실행시킬때는 start메소드를 사용한다 
		for(int i=1; i<=100; ++i) {
			System.out.print(i+"\t");
			if (i%10==0) System.out.println();
		}
		*/
		System.out.println("main 메소드 끝......");
	}
}
