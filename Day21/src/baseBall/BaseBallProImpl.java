package baseBall;
import java.util.*;

public class BaseBallProImpl implements BaseBallPro{
	private Hashtable ht;//key - 구단명, value - 구단에 속한 선수목록
	private Scanner in;
	private String club;

	public BaseBallProImpl() {
		ht = new Hashtable();
		String[] name = new String[] {"삼성", "KT", "LG", "한화", "기아", 
				"롯데", "NC", "두산", "넥센", "SSG"};
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
			System.out.println("등록된 선수가 없습니다.");
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
		System.out.print("수정할 선수 이름을 입력 : ");
		name = in.next();
		if (ht2.containsKey(name)) {
			String club2 = null;
			while(true) {
				System.out.print("옮길 구단명을 입력 : ");
				club2 = in.next();
				if (ht.containsKey(club2)) {
					break;
				}else {
					System.out.print("없는 구단입니다. 다시 입력해 주세요!!");
				}
			}
			Hashtable ht3 = (Hashtable)ht.get(club2);
			Player p = (Player)ht2.get(name);
			ht3.put(name, p);
			ht2.remove(name);
			System.out.println(name+"선수를 " + club+"구단에서 " + club2+"구단으로 옮겼습니다.");
		}else {
			System.out.println(club+"구단의 선수 " + name +"은 없습니다.");
		}
		
	}

	@Override
	public void delete() {
		Hashtable ht2 = (Hashtable)ht.get(club);
		String name = null;
		System.out.print("삭제할 선수 이름을 입력 : ");
		name = in.next();
		if (ht2.containsKey(name)) {
			ht2.remove(name);
			System.out.println(club+"구단의 선수 " + name +"를 삭제하였습니다.");
		}else {
			System.out.println(club+"구단의 선수 " + name +"은 없습니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}
	

}
