package Grade_fail;

import java.util.*;

public class Score implements Func{
	private Hashtable<String, Students> ht;
	private Scanner in;
	
	public Score(){
		ht=new Hashtable<String, Students>();
		in=new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name=in.next();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int kor=in.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int eng=in.nextInt();
		Students std=new Students(name,kor,eng);
		ht.put(name, std);
		
	}
	
	public void print() {
		Enumeration en=ht.keys();
		System.out.print(en.toString());
		int eng=in.nextInt();
		while(en.hasMoreElements()) {
			Object obj=en.nextElement();
			String key=(String)obj;
			Students std=(Students)(ht.get(key));{
			System.out.println(std.getName()+"���� ������ " + std.getTotal()+
					"���̰�, ������ " + std.rank +"�� �Դϴ�.");
			}
		}
	}
	public void modifi() {
		System.out.print("�����Ͻ� �л��� �̸��� �Է��Ͻÿ� : ");
		String name=in.next();
		if(ht.containsKey(name)) {
			Students std=(Students)ht.get(name);
			System.out.print("���� ������ �Է��Ͻÿ� : ");
			int kor=in.nextInt();
			System.out.print("���� ������ �Է��Ͻÿ� : ");
			int eng=in.nextInt();
			System.out.println(name+"�� ������ �����߽��ϴ�.\n���� : "+std.getKor()+" -> "+kor+
					" ���� : "+std.getEng()+" -> "+eng);
			std.setKor(kor);
			std.setEng(eng);
		}
	}
	
	public void delete() {
		System.out.print("�����Ͻ� �л��� �̸��� �Է��Ͻÿ� : ");
		String name=in.next();
		if(ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"�� ������ �����߽��ϴ�.");
		}
		
	}
	
	public void quit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	public void rank() {
	 Enumeration<String> en=ht.keys();
	 while(en.hasMoreElements()) {
		 Object obj=en.nextElement();
		 String key=(String)obj;
		 Students std=(Students)ht.get(key);
		 std.rankReset();
		 int total=std.getTotal();
		 Enumeration<String> en_s=ht.keys();//<=���⼭ �ٽ� �ʱ�ȭ�ؼ� ����
		 while(en_s.hasMoreElements()) {
			 Object obj_s=en_s.nextElement();
			 String key_s=(String)obj_s;
			 Students std_s=(Students)ht.get(key);
			 if(total<std_s.getTotal()) {
				 std.setRank();
			 }
	 		}
	 	}
	}
}