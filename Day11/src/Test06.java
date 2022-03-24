import java.util.*;
import java.io.*;

class Member{
	private String name;
	private String tel;
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void disp() {
		System.out.println(name+"���� ��ȭ��ȣ�� " + tel +"�� �Դϴ�.");
	}
}
interface MemberPro{
	public void input();
	public void output();
	public void edit();
	public void delete();
	public void exit();
}
class MemberProImpl implements MemberPro{
	private HashSet hs;
	private Scanner in;
	
	public MemberProImpl(){
		hs = new HashSet();
		in = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		Member input = new Member(name, tel);
		hs.add(input);
	}
	public void output() {
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member output = (Member)obj;
			output.disp();
		}
	}
	public void edit() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member edit = (Member)obj;
			if (edit.getName().equals(name)) {
				System.out.print("���ο� ��ȭ��ȣ�� �Է� : ");
				String tel = in.next();
				System.out.println("���� ��ȣ " + edit.getTel()
					+"������ �� ��ȣ " + tel +"������ �����Ͽ����ϴ�.");
				edit.setTel(tel);
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}
	public void delete() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (delete.getName().equals(name)) {
				hs.remove(delete);
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
public class Test06 {
	public static void main(String[] args) throws IOException {
		MemberPro pro = new MemberProImpl();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.output(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.exit(); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}











