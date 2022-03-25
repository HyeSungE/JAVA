import java.util.*;
//Member class
class Member{
	//필드선언
	private String name;
	private String tel;
	//생성자선언
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
//기능 interface 구현
interface Func{
	public void input();
	public void print();
	public void change();
	public void delete();
	public void quit();
}

//Member class와 기능을 구현한 interface를 이용하여 클래스 생성
class TelBook implements Func{
	
	Scanner in=new Scanner(System.in);//입력 클래스
	Hashtable ht=new Hashtable();//Map 클래스
	
	public void input() {
		String name,tel;
		while(true) {
		System.out.print("이름을 입력하시오 : ");
		name=in.next();
		if(ht.containsKey(name)) {
			System.out.println("중복된 이름입니다. 다시 입력하시오");
			}
		else break;
		}
		System.out.print("전화번호를 입력하시오 : ");
		tel=in.next();
		ht.put(name,tel);
	}
	public void print() {
		Enumeration en=ht.keys();
		while(en.hasMoreElements()) {
			Object o=en.nextElement();
			String Key=(String)o;
			Member member=new Member(Key,(String)ht.get(Key));
			System.out.println(member.getName()+"님의 전화번호는 "+member.getTel()+"입니다.");
		}
		
	}
	public void change() {
		String name;
		System.out.print("전화번호를 수정할 이름을 입력하시오 : ");
		name=in.next();
		Enumeration en=ht.keys();
		while(en.hasMoreElements()) {
			Object o=en.nextElement();
			String key=(String)o;
			if(key.equals(name)) {
				String tel;
				System.out.print("전화번호를 입력하시오 : ");
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
