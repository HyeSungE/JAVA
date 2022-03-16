import java.util.*;
public class Test02 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n[]=new int[10];
	int oddArr[]=new int[10];
	int evenArr[]=new int[10];
	int oP=0,eP=0;
	
	for(int i=0;i<10;i++) {
		System.out.print(i+1+"¹øÂ° ¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
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

	System.out.print("È¦¼ö : ");
	for(int i=0;i<oP;i++) {
			System.out.print(oddArr[i]+ " ");
		}
	
	System.out.print("Â¦¼ö : ");
	for(int i=0;i<eP;i++) {
			System.out.print(evenArr[i]+ " ");
		}
	
	
	
	
	
	
	
	
	/*System.out.print("Â¦¼ö : ");
	for(int i=0;i<10;i++) {
		if(n[i]%2==0) {//Â¦¼ö
			System.out.print(n[i]+ " ");
		}
	}
	System.out.println();
	System.out.print("Â¦¼ö : ");
	for(int i=0;i<10;i++) {//È¦¼ö
		if(n[i]%2!=0) {//Â¦¼ö
			System.out.print(n[i]+ " ");
		}		
	}*/
	
	}
}

