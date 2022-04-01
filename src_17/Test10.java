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
			System.out.print("수를 입력 : ");
			int su = in.nextInt();
			if (comsu == su) {
				gameEnd();
			}else if (comsu > su) {
				System.out.println("입력하신 수보다 큰 수 입니다.");
			}else {
				System.out.println("입력하신 수보다 작은 수 입니다.");
			}
		}
		
	}
	
	public void gameEnd() {
		System.out.println(time + "초만에 끝났습니다.");
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
