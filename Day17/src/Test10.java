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
		System.out.printf("���� �Է� : ");
		int n=in.nextInt();
		if(n==ans) {
			System.out.println("�����Դϴ�. "+tt.time+"�ʸ��� ���߼̽��ϴ�.");
			break;
		}
		else if(ans<n) {
			System.out.println("�� ���� ���Դϴ�.");
		}
		else if(ans>n) {
			System.out.println("�� ���� ���Դϴ�.");
		}
	}
	
	}

}
