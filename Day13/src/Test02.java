import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		//클래스화시키기
		//list에는 String같은 객체만 들어올 수 있다.
		
		int a=10;
		Integer b= new Integer("10");
		Integer c= new Integer(10);
		System.out.println(a+b+c);//int처럼 사용 가능한데 클래스이다.
		ArrayList<Integer> list=new ArrayList<>();
		list.add(b);
		list.add(c);
		
		//Boxing
		Integer d= new Integer(a);
		//Auto-Boxing
		Integer e=a;
		//unBoxing
		int f=d.intValue();
		//Auto-unBoxing
		int g=e;
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(d);
		list2.add(e);
		list2.add(g);
		list2.add(f);
		
		
		
		
	}

}
