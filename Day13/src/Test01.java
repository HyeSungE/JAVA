import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		
		/*
		String a="ȫ�浿";
		String b="���缮";
		
		 * String �� X
		if(a>b) {
			System.out.println("���缮");
		}
		else {
			System.out.println("ȫ�浿");
		}
		*/
		
		//ArrayList list=new ArrayList(); 
		ArrayList<String> list=new ArrayList<String>();
		//generic ��� : generic�� set,map,list �� ����
		
		list.add("ȫ�浿");
		list.add("���缮");
		
		Collections.sort(list);//�ڹٿ��� ����ƮŸ���� ������ �� ���
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//Ȯ��for���� listŸ�Կ����� ��밡��
		//for(Object obj : list) : list�� 0��° ��ġ���� obj�� �ְ� ������ ���� 1��° ��ġ���� obj�� �ְ� ����
		for(String name : list){
			//generic���������ȣ ���������� ��ǻ�Ͱ� �˰��ִ� ���� String��� ����
			System.out.println("name = "+name);
		}
		
		
		
		
	}

}
