
public class TestArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[];//arr1은 배열이다 라고 알려줌
		arr1=new int[3];//배열에 들어갈 자료형의 타입을 알려준다 == 배열의 타입과 동일해햐함
		
		int arr2[]=new int[3];
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		int arr3[]=new int[] {1,2,3}; // 초기값을 지정할 때는 배열의 size를 지정하지 않는다.
		
		int arr4[]=new int[] {123,1,2,12,512,3,1,312,12,1,1,1,1,1,1,1};
		System.out.println("arr4의 크기는 "+arr4.length);
		
		int arr5[]= {1,2,3,4}; //비권장
		for(int i=0;i<arr5.length;i++) {
			System.out.println(arr5[i]);
		}
	}	

}
