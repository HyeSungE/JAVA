import java.util.*;
class Score{
	String name;
	int kor;
	int eng;
	int rank;
	int total;
	Score(String name,int kor,int eng){//��ü�� ���鶧 �ʱ�ȭ�Ǵ� ���� -- ������
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.rank=1;
		this.total=kor+eng;
	}
	
	void disp() {
		System.out.println(name+"���� ������ "+total+"�Դϴ� ������ "+rank);
	}
}
public class TestObject01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�ο� ���� �Է� : ");
		int n=in.nextInt();
		Score s[]=new Score[n];
		
		for(int i=0;i<s.length;i++) {
			System.out.print(i+1+"��° �̸��� �Է� : ");
			String name=in.next();
			/*System.out.print(i+1+"��° �л��� ������ ������ �Է�  : ");
			int kor=in.nextInt();
			System.out.print(i+1+"��° �л��� ������ ������ �Է�  : ");
			int eng=in.nextInt();*/
			int kor=input("����");
			int eng=input("����");
			s[i]=new Score(name,kor,eng);
		}
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s.length;j++) {
				if(s[i].total<s[j].total) {
					s[i].rank++;
				}
			}
		}
		for(int i=0;i<s.length;i++)
			s[i].disp();
	}
	public static int input(String str) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(str+"������ �Է� : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			System.out.println(str+"������ 0������ 100�� ���̸� �Է��� �ּ���!!");
		}
	}
}


