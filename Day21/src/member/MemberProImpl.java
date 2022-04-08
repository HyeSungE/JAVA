package member;
import java.util.*;
import java.io.*;
public class MemberProImpl implements MemberPro {

	private ArrayList<Member> list;
	private Scanner in;
	
	public MemberProImpl(){
		list = new ArrayList<>();
		in = new Scanner(System.in);
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
	public void save() throws IOException {
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21\\src");
		File file = new File(dir,"Member.txt"); 
		FileOutputStream fos = new FileOutputStream(file,true);

		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		
		
		for(Member save : list) {
			dos.writeUTF(save.getName());
			dos.writeUTF(save.getTel());
			dos.flush();
		}
		dos.close();
		System.out.println("����ƽ��ϴ�.");
		
	}

	@Override
	public void load() throws IOException {
		list.clear();
		try {	
		File dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day21\\src");
		File file = new File(dir,"Member.txt"); 

		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		while(true) {
			
			String name = dis.readUTF();	
			String tel = dis.readUTF();
			Member o = new Member(name, tel);
			list.add(o);
			
		}
		}catch(EOFException e) { //EOF < IOE
			System.out.println("������ �ε� ��");
		}
	
	
		}		
}

