
public class TestArray03 {
	public static void main(String args[]) {
	/*
	 * ������
	 */
		int arr[][]=new int[5][5];
		int n=1;
		int row=0,col=2;//��� �� ���� - 1������ ù°�� ��� ����
		
		while(n<=25) {
			arr[row][col]=n;
			int oldRow=row,oldCol=col;
			row--; col++; //������ �밢�� ���� �̵�
			
			if(row<0) row=4;//2������ - �̵��� ���� �� ������ �Ǹ� �� ���� ���� ������������ �̵�
			if(col>4) col=0;//3������ - �̵��� ���� ���� ���� ����� 0��°�� �̵��Ѵ�.
			if(arr[row][col]!=0) { //�̵��� ���� �����Ͱ� ������ ���� ��ġ�� �̵��� �� ���� ���� -1��Ų��
				row=oldRow;//������
				col=oldCol;//������
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
