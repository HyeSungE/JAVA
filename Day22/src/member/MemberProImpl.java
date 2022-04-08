package member;
import java.io.*;
import java.util.*;

public class MemberProImpl implements MemberPro{

	private ArrayList<Member> list;
	private Scanner in;
	private File dir, data;
		
	public MemberProImpl(){
		list = new ArrayList<>();
		in = new Scanner(System.in);
		dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22\\src\\member");
		data = new File(dir, "data.txt");
	}
	
	public void input() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("��ȭ��ȣ�� �Է� : ");
		String tel = in.next();
		Member input = new Member(name, tel);
		list.add(input);
	}
	
	public void output() {
		Collections.sort(list);
		for(Member output : list) {
			output.disp();
		}
	}
	
	public void edit() {
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member edit = it.next();
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
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member delete = it.next();
			if (delete.getName().equals(name)) {
				list.remove(delete);
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

	@Override
	public void save() {
		try {
			FileWriter fw = new FileWriter(data);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for(Member save : list) {
				pw.println(save.getName());
				pw.println(save.getTel());
				pw.flush();
			}
			pw.close();
		}catch(IOException e) {
			System.err.println("���� ����� ���� �߻�!!" + e.getMessage());
		}
		
	}

	@Override
	public void load() {
		list.clear();
		try {
			FileReader fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String name = br.readLine();
				if(name==null) break;
				String tel = br.readLine();
				Member load = new Member(name, tel);
				list.add(load);
			}
		}catch(EOFException e) {
			System.out.println("������ �ε� ��!!");
		}catch(IOException e) {
			System.err.println("���� �ε�� ���� �߻�!!" + e.getMessage());
		}
		
	}

}
