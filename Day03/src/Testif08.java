import java.util.*;
import java.io.*;
public class Testif08 {

	public static void main(String[] args) throws IOException{
		Scanner in=new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int a=in.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		int b=in.nextInt();
		System.out.print("��������ڸ� �Է��Ͻÿ� : ");
		char ch=(char)System.in.read();
		
		float res=0;
		
		if(ch=='+') {
			res=a+b;
		}
		else if(ch=='-') {
			res=a-b;
		}
		else if(ch=='*') {
			res=a*b;
		}
		else if(ch=='/') {
			res=a/b;
		}
		else if(ch=='%') {
			res=a%b;
		}
		else {
			System.out.println("��������ڸ� �Է� ");
			
		}
		System.out.printf("%d %c %d = %.1f",a,ch,b,res);
	}

}
