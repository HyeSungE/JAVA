import java.util.*;
abstract class Protoss{
	/*public void attack() {
		System.out.println("������ ������ �մϴ�.");
	}
	public void move() {
		System.out.println("������ �̵��� �մϴ�.");
	}*/
	//�θ�Ŭ���������� ���� �ʿ䰡 ����. �ڽ�Ŭ������ ������ �ؼ� �̿��� ����~
	//�ٵ� attack�޼ҵ�� �������� �ȵ�
	// *�߻�Ŭ����* : �޼ҵ� �� �����ϰ� ������ ���� �ʴ� �޼ҵ� , �� �޼ҵ�� �ڽ�Ŭ�������� �ݵ�� ������ �ؾ��ϰ�,
	//��ĳ���õ� ���¿��� �ڽ��� �޼ҵ带 �����ϰ��� �� �� ���
	//�߻�Ŭ������ ��ü�� �������� ���Ѵ�. -> ���赵�� �ִ� Ŭ����
	/*
	 * �߻�Ŭ������ ��ü�� �������� ���ϹǷ� �����ڶ��� ���� ����, �ڽ�Ŭ������ ��ӹ޾Ƽ� ����ų� �͸���øŬ������ ���ؼ�����ų� �ؾ��Ѵ�
	 */
	public abstract void attack();
	public abstract void move();
	
}
class Zealot extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�.");
	}public void move() {
		System.out.println("������ �̵��� �մϴ�.");
	}
}

class Dragon extends Protoss{
	public void attack() {
		System.out.println("������ ������ �մϴ�.");
	}public void move() {
		System.out.println("������ �̵��� �մϴ�.");
	}
}

public class TestObject05 {

	public static void main(String[] args) {
		Protoss pro[]=new Protoss[5];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("1.���� 2.���� : ");
			int select1=in.nextInt();
			if(select1==1) {
				pro[i]= new Zealot();
			}
			else {
				pro[i]= new Dragon();
			}
		}
		System.out.print("1.���� 2.�̵� : ");
		int select2=in.nextInt();
		for(int i=0;i<5;i++) {	
			if(select2==1) {
				pro[i].attack();
			}
			else {
				pro[i].move();
			}
		}
	}

}
