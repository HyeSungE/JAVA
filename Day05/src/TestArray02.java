
public class TestArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[];//arr1�� �迭�̴� ��� �˷���
		arr1=new int[3];//�迭�� �� �ڷ����� Ÿ���� �˷��ش� == �迭�� Ÿ�԰� ����������
		
		int arr2[]=new int[3];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		int arr3[]=new int[] {1,2,3}; // �ʱⰪ�� ������ ���� �迭�� size�� �������� �ʴ´�.
		
		int arr4[]=new int[] {123,1,2,12,512,3,1,312,12,1,1,1,1,1,1,1};
		System.out.println("arr4�� ũ��� "+arr4.length);
		
		int arr5[]= {1,2,3,4}; //�����
		for(int i=0;i<arr5.length;i++) {
			System.out.println(arr5[i]);
		}
	}	

}
