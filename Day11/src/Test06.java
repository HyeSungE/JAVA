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
		System.out.println(name+"님의 전화번호는 " + tel +"번 입니다.");
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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("전화번호를 입력 : ");
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
		System.out.print("이름을 입력 : ");
		String name = in.next();
		Iterator it = hs.iterator();
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
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			Member delete = (Member)obj;
			if (delete.getName().equals(name)) {
				hs.remove(delete);
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
public class Test06 {
	public static void main(String[] args) throws IOException {
		MemberPro pro = new MemberProImpl();
		
		while(true) {
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			switch(select) {
			case 1 :	pro.input(); break;
			case 2 :	pro.output(); break;
			case 3 :	pro.edit(); break;
			case 4 :	pro.delete(); break;
			case 5 :	pro.exit(); break;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}











