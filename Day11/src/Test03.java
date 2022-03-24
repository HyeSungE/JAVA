import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=new String();
		System.out.print("문자열을 입력 : ");
		str=in.nextLine();
	
		int alpha[]=new int[27];//a~z는 26 + 기타 : 1
		//a=alpha[0]~z=alpha[25] 기타=alpha[26]
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90) {//대문자 A~Z사이
				alpha[ch-65]++;
			}
			else if(ch>=97&&ch<=122) {//소문자 a~z사이
				alpha[ch-97]++;
			}
			else alpha[26]++;
		}
		for(int i=0;i<alpha.length-1;i++) {
			if(alpha[i]==0) continue;
			else System.out.printf("%c - %d\n",i+97,alpha[i]);
		}
		if(alpha[26]!=0)  System.out.printf("기타 - %d\n",alpha[26]);
	}
}
