import java.util.*;
public class TestArray05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int SIZE=in.nextInt();
		/*
		String name[]=new String[5];
		int kor[]=new int[5];
		int eng[]=new int[5];
		int sum[]=new int[5];
		int rank[]=new int[5];*/
		
		String name[]=new String[SIZE]; // �迭�� ũ�⸦ ����� �ƴ� �����ε� ���������ϴ�.
		int kor[]=new int[SIZE];
		int eng[]=new int[SIZE];
		int sum[]=new int[SIZE];
		int rank[]=new int[SIZE];
		
		for(int i=0;i<name.length;i++) {
			System.out.print(i+1+"��° �̸��� �Է��Ͻÿ� : ");
			name[i]=in.next();
			System.out.print(i+1+"��° ���� ������ �Է��Ͻÿ� : ");
			kor[i]=in.nextInt();
			System.out.print(i+1+"��° ���� ������ �Է��Ͻÿ� : ");
			eng[i]=in.nextInt();
			sum[i]=kor[i]+eng[i];
			rank[i]=1;
		}
		
		for(int i=0;i<sum.length;i++) {//������
			for(int j=0;j<sum.length;j++) {//��μ���
				if(sum[i]<sum[j]){//���� ������ ����� ������ ���Ͽ� �۴ٸ�
					rank[i]+=1;//���� rank�� ���� 1������Ų��.
				}
			}
			
		}
		for(int i=0;i<name.length;i++) {
		System.out.println("�̸� : "+name[i]+" a���� : "+sum[i]+" ���� : "+rank[i]);
		}
	}

}
