import java.util.*;
public class TestRandom05 {

	public static void main(String[] args) {
		int lotto[]=new int[6];
		int player[]=new int[6];
		int count=0;
		for(int i=0;i<6;i++) {
			int temp=(int)(Math.random()*45)+1;
			for(int j=0;j<6;j++) {
				if(lotto[j]!=temp) {
					lotto[i]=temp;
				}
			}
		}
		/*
		 * for(int i=0;i<6;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		 */
		Scanner in= new Scanner(System.in);
		System.out.println("6개번호를 입력하시오 ");
		
		/*for(int i=0;i<6;i++) {
			System.out.print(i+1+"번째 수를 입력하시오 : ");
			player[i]=in.nextInt();
			if(player[i]==lotto[i]) {
				count++;
			}
		}*/
		int i=0;
		do {	
			System.out.print(i+1+"번째 수를 입력하시오 : ");
			player[i]=in.nextInt();
			i++;
		}while(player[i]<0||player[i]>45);
		
		for(i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==player[j])
					count++;
			}
		}
		System.out.println(count+"개의 숫자를 맞추셨습니다.");
	}

}
