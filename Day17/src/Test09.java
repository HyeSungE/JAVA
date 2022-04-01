import java.util.*;
import java.text.*;
class TimeThread extends Thread{
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	public void run() {
		while(true) {
			date=new Date();
			System.out.println("now is "+ sdf.format(date));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}
public class Test09 {
	
	public static void main(String[] args) {
		System.out.println("main start");
		TimeThread tt=new TimeThread();
		tt.setDaemon(true);//main종료시 스레드도 같이 종료 일반적으로 독립스레드(false) Daemon관계를 해주면 main에 종속되기떄문에 종속스레드가 된다.
		
		tt.start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
		}
		System.out.println("main end");
	}

}
