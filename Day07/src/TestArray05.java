import java.util.*;

public class TestArray05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int su = 0;
		while(true) {
			System.out.print("���� ���� �Է� : ");
			su = in.nextInt();
			if (su%2 == 0) {
				System.out.println("���� ���� Ȧ���� �Է��� �ּ���!!");
			}else {
				break;
			}
		}
		
		int arr[][] = new int[su][5];
		int line = 0;//���ǰ�
		int start = 0, end = 4, step = 1;//���۰� ���� , ����ġ�� ������ �����Ѵ�.
		int co = 0;
		//step���� 1�̸� ������ -1�̸� �Ųٷ� �����δ� 
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
			line++;//�̵��� ��ġ�� ���� �����Ѵ�.
			if (line == su) break;
			
			step *= -1;//�����̵��� ���� �̵��� �ݴ�
			
			if (step == 1) {
				arr[line][start] = ++co;//�������� �̵��ϴٰ� ���������� �̵��ϱ� ��
			}else {
				arr[line][end] = ++co;//���������� �̵��ϴٰ� �������� �̵��ϱ� ��
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











