import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		
		list.add("유재석");
		list.add("하하");
		list.add("송지효");
		
		for(int i=0;i<list.size();i++) {
			Object obj=list.get(i);
			String name=(String)obj;
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		list.add(1,"김종국");
		
		for(int i=0;i<list.size();i++) {
			Object obj=list.get(i);
			String name=(String)obj;
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			String name=(String)o;
			System.out.println(name);
		}
		
		System.out.println("-----------------");
		list.remove("송지효");
		list.remove(1);
		for(int i=0;i<list.size();i++) {
			Object obj=list.get(i);
			String name=(String)obj;
			System.out.println(name);
		}
		
	}

}
