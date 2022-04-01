import java.util.*;
class Time extends Thread{
	int time=0;
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
			time++;
		}
	}
}
public class Test10 {

	public static void main(String[] args) {
	int ans=(int)(Math.random()*100)+1;
	Scanner in= new Scanner(System.in);
	System.out.println(ans);
	Time tt=new Time();
	tt.setDaemon(true);
	tt.start();
	while(true) {
		System.out.printf("수를 입력 : ");
		int n=in.nextInt();
		if(n==ans) {
			System.out.println("정답입니다. "+tt.time+"초만에 맞추셨습니다.");
			break;
		}
		else if(ans<n) {
			System.out.println("더 낮은 수입니다.");
		}
		else if(ans>n) {
			System.out.println("더 높은 수입니다.");
		}
	}
	
	}

}
