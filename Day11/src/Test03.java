import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=new String();
		System.out.print("���ڿ��� �Է� : ");
		str=in.nextLine();
	
		int alpha[]=new int[27];//a~z�� 26 + ��Ÿ : 1
		//a=alpha[0]~z=alpha[25] ��Ÿ=alpha[26]
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65&&ch<=90) {//�빮�� A~Z����
				alpha[ch-65]++;
			}
			else if(ch>=97&&ch<=122) {//�ҹ��� a~z����
				alpha[ch-97]++;
			}
			else alpha[26]++;
		}
		for(int i=0;i<alpha.length-1;i++) {
			if(alpha[i]==0) continue;
			else System.out.printf("%c - %d\n",i+97,alpha[i]);
		}
		if(alpha[26]!=0)  System.out.printf("��Ÿ - %d\n",alpha[26]);
	}
}
