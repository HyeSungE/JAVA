import java.util.*;

class UpDownGame extends Thread{
	private int comsu;
	private int time = 0;
	private boolean isGame = true;
	
	public UpDownGame() {
		comsu = (int)(Math.random()*100) + 1;
	}
	
	public void run() {
		while(isGame) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			time++;
		}
	}
	
	public void gameStart() {
		this.start();
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.print("���� �Է� : ");
			int su = in.nextInt();
			if (comsu == su) {
				gameEnd();
			}else if (comsu > su) {
				System.out.println("�Է��Ͻ� ������ ū �� �Դϴ�.");
			}else {
				System.out.println("�Է��Ͻ� ������ ���� �� �Դϴ�.");
			}
		}
		
	}
	
	public void gameEnd() {
		System.out.println(time + "�ʸ��� �������ϴ�.");
		//isGame = false;
		System.exit(0);
	}
	
}
public class Test10 {
	public static void main(String[] args) {
		UpDownGame game = new UpDownGame();
		//game.start();
		game.gameStart();
	}
}
