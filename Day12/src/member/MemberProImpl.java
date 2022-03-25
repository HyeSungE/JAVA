package member;
import java.util.*;

public class MemberProImpl implements MemberPro{

	private ArrayList al;
	private Scanner in;
	
	public MemberProImpl() {
		al = new ArrayList();
		in = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		Member input = new Member(name, tel);
		al.add(input);
	}
	public void output() {
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member output = (Member)obj;
			output.disp();
		}
	}
	public void edit() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		Iterator it = al.iterator();
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
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (delete.getName().equals(name)) {
				al.remove(delete);
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
