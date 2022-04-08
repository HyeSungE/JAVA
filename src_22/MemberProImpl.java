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
		dir = new File("F:\\bigdata\\study\\day21\\src\\member");
		data = new File(dir, "data.txt");
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
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream(data);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(list);
			oos.close();
		}catch(IOException e) {
			System.err.println("파일 저장시 오류 발생!!" + e.getMessage());
		}
		/* text출력
		try {
			FileWriter fw = new FileWriter(data);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for(Member save : list) {
				pw.println(save.getName()+"@"+save.getTel());
				pw.flush();
			}
			pw.close();
		}catch(IOException e) {
			System.err.println("파일 저장시 오류 발생!!" + e.getMessage());
		}
		/* 1byte 출력
		try {
			FileOutputStream fis = new FileOutputStream(data);
			BufferedOutputStream bos = new BufferedOutputStream(fis);
			DataOutputStream dos = new DataOutputStream(bos);
			for(Member save : list) {
				dos.writeUTF(save.getName());
				dos.writeUTF(save.getTel());
				dos.flush();
			}
			dos.close();
		}catch(IOException e) {
			System.err.println("파일 저장시 오류 발생!!" + e.getMessage());
		}
		*/
	}

	@Override
	public void load() {
		try {
			FileInputStream fis = new FileInputStream(data);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			list = (ArrayList)ois.readObject();
		}catch(IOException e) {
			System.err.println("파일 로드시 오류 발생!!" + e.getMessage());
		}catch(ClassNotFoundException e) {
			System.err.println("파일이 존재하지 않습니다.");
		}
		/* text 입력
		list.clear();
		try {
			FileReader fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String str = br.readLine();
				if (str == null) break;
				String[] mem = str.split("@");
				Member load = new Member(mem[0], mem[1]);
				list.add(load);
			}
		}catch(IOException e) {
			System.err.println("파일 로드시 오류 발생!!" + e.getMessage());
		}
		/* 1byte 입력
		try {
			FileInputStream fis = new FileInputStream(data);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			while(true) {
				String name = dis.readUTF();
				String tel = dis.readUTF();
				Member load = new Member(name, tel);
				list.add(load);
			}
		}catch(EOFException e) {
			System.out.println("데이터 로드 끝!!");
		}catch(IOException e) {
			System.err.println("파일 로드시 오류 발생!!" + e.getMessage());
		}
		*/
	}

}
