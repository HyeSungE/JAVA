import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		//Ŭ����ȭ��Ű��
		//list���� String���� ��ü�� ���� �� �ִ�.
		
		int a=10;
		Integer b= new Integer("10");
		Integer c= new Integer(10);
		System.out.println(a+b+c);//intó�� ��� �����ѵ� Ŭ�����̴�.
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
