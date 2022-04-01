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
		tt.setDaemon(true);//main����� �����嵵 ���� ���� �Ϲ������� ����������(false) Daemon���踦 ���ָ� main�� ���ӵǱ⋚���� ���ӽ����尡 �ȴ�.
		
		tt.start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
		}
		System.out.println("main end");
	}

}
