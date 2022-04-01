import java.util.*;
import java.text.*;

class TimeThread extends Thread{
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	int time = 5;
	
	public void run() {
		while(time>0) {
			date = new Date();
			System.out.println("현재시간 : " + sdf.format(date));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			time--;
			//if (time==0) stop();
		}
	}
}
public class Test09 {
	public static void main(String[] args) {
		System.out.println("main 시작!!!");
		TimeThread tt = new TimeThread();
		//tt.setDaemon(true);
		tt.start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		
		System.out.println("main 끝!!");
	}
}










