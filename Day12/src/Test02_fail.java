import java.util.*;
//Member class
class Member{
	//�ʵ弱��
	private String name;
	private String tel;
	//�����ڼ���
	public Member(String name,String tel) {
		name=this.name;
		tel=this.tel;
	}
	//getter & setter method
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
}
//��� interface ����
interface Func{
	public void input();
	public void print();
	public void change();
	public void delete();
	public void quit();
}

//Member class�� ����� ������ interface�� �̿��Ͽ� Ŭ���� ����
class TelBook implements Func{
	
	Scanner in=new Scanner(System.in);//�Է� Ŭ����
	Hashtable ht=new Hashtable();//Map Ŭ����
	
	public void input() {
		String name,tel;
		while(true) {
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name=in.next();
		if(ht.containsKey(name)) {
			System.out.println("�ߺ��� �̸��Դϴ�. �ٽ� �Է��Ͻÿ�");
			}
		else break;
		}
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
		tel=in.next();
		ht.put(name,tel);
	}
	public void print() {
		Enumeration en=ht.keys();
		while(en.hasMoreElements()) {
			Object o=en.nextElement();
			String Key=(String)o;
			Member member=new Member(Key,(String)ht.get(Key));
			System.out.println(member.getName()+"���� ��ȭ��ȣ�� "+member.getTel()+"�Դϴ�.");
		}
		
	}
	public void change() {
		String name;
		System.out.print("��ȭ��ȣ�� ������ �̸��� �Է��Ͻÿ� : ");
		name=in.next();
		Enumeration en=ht.keys();
		while(en.hasMoreElements()) {
			Object o=en.nextElement();
			String key=(String)o;
			if(key.equals(name)) {
				String tel;
				System.out.print("��ȭ��ȣ�� �Է��Ͻÿ� : ");
				tel=in.next();
				
			}
		}
	}
	public void delete() {
		
	}
	public void quit() {
		
	}
}
public class Test02_fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
