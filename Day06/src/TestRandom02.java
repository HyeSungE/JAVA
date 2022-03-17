import java.util.*;
public class TestRandom02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int Answer=(int)(Math.random()*100)+1;//1부터 100까지 중 난수 생성
	    int count=0;
		int player=0;
		System.out.println("1부터 100까지 중에서 생성된 난수를 맞추시오");
		while(player!=Answer) {
			System.out.print("정답을 입력하시오 : ");
			player=in.nextInt();
			count++;
			if(player<Answer) {
				System.out.println("더 높은 수 입니다.");
			}else if(player>Answer) {
				System.out.println("더 낮은 수 입니다.");
			}
		}
		System.out.println("정답입니다.\n"+count+"번 만에 정답을 맞추셨습니다.");
	}

}
