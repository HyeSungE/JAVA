import java.util.*;
class A11{
	int a; int b; int c; int d; int e; int f; int g;
	A11(){
		a=10;b=20;c=30;d=40;e=50;f=60;g=70;
	}
	A11(int a){
		this();//�Ű������� ���� �����ڸ� ȣ���Ѵ�.
		//�ٸ� ������ ȣ��
		//������ ���ο����� ��� ����
		//�������� ù�ٿ����� ��� ����
		//���ο��� �ѹ��� �ΰ��� ȣ������ ���Ѵ�.
		this.a=a;
	}
	A11(int a,int b){
		this(a);//�Ű������� �ϳ� �ִ� �����ڸ� ȣ��
		this.b=b;
	}
}
public class TestObject11{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�̸��� �Է� : ");
		String name=in.next();
		System.out.print("��ȭ��ȣ�� �Է�  : ");
		String tel=in.next();
		Member m=new Member(name,tel);
		m.disp();
	}
}
