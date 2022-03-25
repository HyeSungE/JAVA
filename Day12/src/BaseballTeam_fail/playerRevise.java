package BaseballTeam_fail;
import java.util.*;
public class playerRevise implements Func{
	private Scanner in;
	private Hashtable ht,ht2;
	//
	boolean start=true;
	
	playerRevise(){
		in=new Scanner(System.in);
		ht=new Hashtable();
		ht2=new Hashtable();
	}
	
	
	public void input(String TeamName) {
		System.out.print("선수 이름을 입력  : ");
		String Name=in.next();
		System.out.print("선수 연봉을 입력 : ");
		int Salary=in.nextInt();
		Player p=new Player(Name,TeamName,Salary);
		ht2.put(Name,p);
		ht.put(TeamName,ht2);
	}
	public void print(String TeamName) {
		System.out.println("선수명\t 연봉(만원)");
		System.out.println("---------------");
		Object obj=ht.get(TeamName);
		ht2=(Hashtable)obj;
		Enumeration en=ht2.keys();
		while(en.hasMoreElements()) {
			Object obj2=en.nextElement();
			String name=(String)obj2;
			Player p=(Player)ht2.get(name);
			System.out.println(p.getName()+"\t "+p.getSalary());
		}
	}
	public void modifi(String TeamName) {
		Object obj=ht.get(TeamName);
		ht2=(Hashtable)obj;
		System.out.print("선수 이름을 입력  : ");
		String Name=in.next();
		
		if(ht2.containsKey(Name)) {
			Object o=ht2.get(Name);
			Player p=(Player)o;
			System.out.print("선수 팀을 입력  : ");
			String TName=in.next();
			System.out.print("선수 연봉을 입력 : ");
			int Salary=in.nextInt();
			p.setSalary(Salary);
			p.setTeam(TName);
			ht.put(TName,ht2);
		}
	}
	public void delete(String TeamName) {
		Object obj=ht.get(TeamName);
		ht2=(Hashtable)obj;
		System.out.print("선수 이름을 입력  : ");
		String Name=in.next();
		if(ht2.containsKey(Name)) {
			ht2.remove(Name);
		}
		
	}
	public void quit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}


}
/*while(start) {
	System.out.print("구단 이름을 입력하세요 : ");
	String TeamName=in.next();
	for(int i=0;i<arr.length;i++) {
		if(TeamName.equals(arr[i])) start=false;
	}
}*/
