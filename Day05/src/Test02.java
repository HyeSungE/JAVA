import java.util.*;
public class Test02 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n[]=new int[10];
	int oddArr[]=new int[10];
	int evenArr[]=new int[10];
	int oP=0,eP=0;
	
	for(int i=0;i<10;i++) {
		System.out.print(i+1+"��° ���� �Է��Ͻÿ� : ");
		n[i]=in.nextInt();
	}
	
	for(int i=0;i<n.length;i++) {
		if(n[i]%2==0) {
			evenArr[eP]=n[i];
			eP++;
		}
		else {
			oddArr[oP]=n[i];
			oP++;
		}
	}

	System.out.print("Ȧ�� : ");
	for(int i=0;i<oP;i++) {
			System.out.print(oddArr[i]+ " ");
		}
	
	System.out.print("¦�� : ");
	for(int i=0;i<eP;i++) {
			System.out.print(evenArr[i]+ " ");
		}
	
	
	
	
	
	
	
	
	/*System.out.print("¦�� : ");
	for(int i=0;i<10;i++) {
		if(n[i]%2==0) {//¦��
			System.out.print(n[i]+ " ");
		}
	}
	System.out.println();
	System.out.print("¦�� : ");
	for(int i=0;i<10;i++) {//Ȧ��
		if(n[i]%2!=0) {//¦��
			System.out.print(n[i]+ " ");
		}		
	}*/
	
	}
}

