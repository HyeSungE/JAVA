package baseBall;
import java.util.*;

public class BaseBallProImpl implements BaseBallPro{
	private Hashtable ht;//key - ���ܸ�, value - ���ܿ� ���� �������
	private Scanner in;
	private String club;

	public BaseBallProImpl() {
		ht = new Hashtable();
		String[] name = new String[] {"�Ｚ", "KT", "LG", "��ȭ", "���", 
				"�Ե�", "NC", "�λ�", "�ؼ�", "SSG"};
		for(int i=0; i<name.length; ++i) {
			ht.put(name[i], new Hashtable());
		}
	}
	
	public Hashtable getHt() {
		return this.ht;
	}
	@Override
	public boolean isClub(String club) {
		if (ht.containsKey(club)) {
			this.club = club;
			return true;
		}else {
			return false;
		}
	}
	public boolean isName(String club,String p_name,int salary) {
		Hashtable ht2 = (Hashtable)ht.get(club);
		if (ht.containsKey(club)) {
			if (ht2.containsKey(p_name)) {
				ht2.put(p_name,salary);
				return true;
				}
			else return false;
		}
		else return false;
		
		
		
	}
	
	
	

	@Override
	public void output() {
		Hashtable ht2 = (Hashtable)ht.get(club);
		if (ht2.size()==0) {
			System.out.println("��ϵ� ������ �����ϴ�.");
			return;
		}
		Enumeration enu = ht2.keys();
		while(enu.hasMoreElements()) {
			String name = (String)enu.nextElement();
			Player output = (Player)ht2.get(name);
			System.out.println(output.getName() + "\t\t" + output.getSalary());
		}
	}

	@Override
	public void edit() {
		Hashtable ht2 = (Hashtable)ht.get(club);
		String name = null;
		System.out.print("������ ���� �̸��� �Է� : ");
		name = in.next();
		if (ht2.containsKey(name)) {
			String club2 = null;
			while(true) {
				System.out.print("�ű� ���ܸ��� �Է� : ");
				club2 = in.next();
				if (ht.containsKey(club2)) {
					break;
				}else {
					System.out.print("���� �����Դϴ�. �ٽ� �Է��� �ּ���!!");
				}
			}
			Hashtable ht3 = (Hashtable)ht.get(club2);
			Player p = (Player)ht2.get(name);
			ht3.put(name, p);
			ht2.remove(name);
			System.out.println(name+"������ " + club+"���ܿ��� " + club2+"�������� �Ű���ϴ�.");
		}else {
			System.out.println(club+"������ ���� " + name +"�� �����ϴ�.");
		}
		
	}

	@Override
	public void delete() {
		Hashtable ht2 = (Hashtable)ht.get(club);
		String name = null;
		System.out.print("������ ���� �̸��� �Է� : ");
		name = in.next();
		if (ht2.containsKey(name)) {
			ht2.remove(name);
			System.out.println(club+"������ ���� " + name +"�� �����Ͽ����ϴ�.");
		}else {
			System.out.println(club+"������ ���� " + name +"�� �����ϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}
	

}
