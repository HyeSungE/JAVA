import java.util.*;
class Member{
	String name;
	String tel;
	Member(String name,String tel){
		this.name=name;
		this.tel=tel;
	}
	void disp() {
		System.out.println(this.name + "���� ��ȭ��ȣ�� "+this.tel+"�Դϴ�.");
	}
}
public class TestObject10{
	public static void main(String[] args){
		Member m[]=new Member[5];
		//Ŭ���� �迭�� ��ü�� ���� �� ���̴�. ������ �����ڿ� ���� ���������.
		//�迭�� ���� �Ѱ����δ� Ŭ���� �迭�� ����� �� ���� ���� new�� �����ڸ� ���� �������� ��밡���ϴ�.
		Scanner in = new Scanner(System.in);
		for(int i=0;i<m.length;i++) {
			System.out.print("�̸��� �Է� : ");
			String name=in.next();
			System.out.print("��ȭ��ȣ�� �Է�  : ");
			String tel=in.next();
			m[i]=new Member(name,tel);
			//���� ���� Ŭ���� �迭�� ���� ��������� ��밡���ϴ�.
		}
		for(int i=0;i<m.length;i++)
			m[i].disp();
	}
}
