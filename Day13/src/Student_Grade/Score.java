package Student_Grade;

import java.util.*;

class Score implements work{
	private ArrayList<Students> list;
	private Scanner in;
	Score(){
		list=new ArrayList<Students>();
		in=new Scanner(System.in);
	}
	protected Students inName(String name) {
			for(Students std : list) {
			if (std.getName().equals(name)) {
				return std;
				}
			}
			return null;
	}
	public void input() {
		String name;
		while(true) {
			System.out.print("�̸��� �Է��Ͻÿ� : ");
			name=in.next();
			if(inName(name)==null) break;
			else System.out.println("������ �̸��� �����մϴ�. �ٽ��Է��� �ּ���!!");
			}
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int kor=in.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		int eng=in.nextInt();
		
		Students std=new Students(name,kor,eng);
		list.add(std);
		
	}
	///////////////////////////////////////////////
	public void print() {
		rank();
		Collections.sort(list);
		for(Students std : list) {
			std.display();
		}
	}
	/*
	 * ���� ������ �ϰ� list�� ����Ѵ�
	 */
	////////////////////////////////////////////////
	public void modifi() {
		System.out.print("�����Ͻ� �л��� �̸��� �Է��Ͻÿ� : ");
		String name=in.next();
		for(Students std : list) {
			if(std.getName().equals(name)){
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
		
	}
	public void delete() {
		System.out.print("�����Ͻ� �л��� �̸��� �Է��Ͻÿ� : ");
		String name=in.next();
	
		for(Students std : list) {
			if(std.getName().equals(name)) {
				list.remove(std);
			}
		}
		System.out.println(name+"�� ������ �����߽��ϴ�.");
	}
	public void quit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	public void rank() {
		for(Students std : list) {
		 std.rankReset();
		 int total=std.getTotal();
		 for(Students std_s : list) {
			 if(total<std_s.getTotal()) {
				 std.setRank();
			 }
	 		}
	 	}
	}
}
