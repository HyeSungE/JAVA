import java.util.*;

public class TestArray05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int su = 0;
		while(true) {
			System.out.print("행의 수를 입력 : ");
			su = in.nextInt();
			if (su%2 == 0) {
				System.out.println("행의 수는 홀수만 입력해 주세요!!");
			}else {
				break;
			}
		}
		
		int arr[][] = new int[su][5];
		int line = 0;//행의값
		int start = 0, end = 4, step = 1;//시작과 끝값 , 증감치를 변수로 선언한다.
		int co = 0;
		//step값이 1이면 오른쪽 -1이면 거꾸로 움직인다 
		while(true) {
			if (step == 1) {
				for(int i = start; i<=end; i+=step) {
					arr[line][i] = ++co;
				}
			}else {
				for(int i = end; i>=start; i+=step) {
					arr[line][i] = ++co;
				}
			}
			line++;//이동을 마치면 행을 증가한다.
			if (line == su) break;
			
			step *= -1;//다음이동은 기존 이동의 반대
			
			if (step == 1) {
				arr[line][start] = ++co;//왼쪽으로 이동하다가 오른쪽으로 이동하기 전
			}else {
				arr[line][end] = ++co;//오른쪽으로 이동하다가 왼쪽으로 이동하기 전
			}
			line++;
		}
		
		for(int i=0; i<su; ++i) {
			for(int j=0; j<5; ++j) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j] + "\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}











