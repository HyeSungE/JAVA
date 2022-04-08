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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member edit = it.next();
			if (edit.getName().equals(name)) {
				System.out.print("새로운 전화번호를 입력 : ");
				String tel = in.next();
				System.out.println("기존 번호 " + edit.getTel()
					+"번에서 새 번호 " + tel +"번으로 수정하였습니다.");
				edit.setTel(tel);
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}
	public void delete() {
		System.out.print("이름을 입력 : ");
		String name = in.next();
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member delete = it.next();
			if (delete.getName().equals(name)) {
				list.remove(delete);
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
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
		System.out.println("저장됐습니다.");
		
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
			System.out.println("데이터 로드 끝");
		}
	
	
		}		
}

