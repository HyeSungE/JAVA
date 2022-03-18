
public class TestArray03 {
	public static void main(String args[]) {
	/*
	 * 마방진
	 */
		int arr[][]=new int[5][5];
		int n=1;
		int row=0,col=2;//행과 열 지정 - 1번조건 첫째줄 가운데 시작
		
		while(n<=25) {
			arr[row][col]=n;
			int oldRow=row,oldCol=col;
			row--; col++; //오른쪽 대각선 위로 이동
			
			if(row<0) row=4;//2번조건 - 이동한 곳의 행 음수가 되면 그 행의 가장 오른쪽행으로 이동
			if(col>4) col=0;//3번조건 - 이동한 곳의 열의 값을 벗어나면 0번째로 이동한다.
			if(arr[row][col]!=0) { //이동한 곳에 데이터가 있으면 원래 위치로 이동한 후 행의 값을 -1시킨다
				row=oldRow;//기존열
				col=oldCol;//기존행
				row++;
				
			}
			n++;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
	}
}
