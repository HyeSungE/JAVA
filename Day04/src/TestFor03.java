import java.util.*;
//import java.io.*;
public class TestFor03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("단수를 입력하시오 : ");
		//int n=System.in.read()='0'; + throws IOException
		int n=in.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
		}
	}

}
