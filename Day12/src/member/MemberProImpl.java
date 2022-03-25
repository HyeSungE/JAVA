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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member edit = (Member)obj;
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
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (delete.getName().equals(name)) {
				al.remove(delete);
				return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
}
