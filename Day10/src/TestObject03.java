import java.util.Scanner;

class Student{
	private String name;
	private int kor;
	private int eng;
	protected int tot;
	private int rank;
	Student(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		this.rank = 1;
	}
	public String getName() {//get + ����ʵ� �̸� => getter�޼ҵ� : private��� ������
		return name;
	}
	
	public boolean setKor(int kor) {//set + ����ʵ� �̸� => setter�޼ҵ� : private��� ����
		if (kor<0 || kor>100) return false;
		this.kor = kor;
		return true;
	}
	public int getKor() {
		return kor;
	}
	public boolean setEng(int eng) {//set + ����ʵ� �̸� => setter�޼ҵ� : private��� ����
		if (eng<0 || eng>100) return false;
		this.eng = eng;
		return true;
	}
	public int getEng() {
		return eng;
	}
	public void setTot() {
		tot = kor + eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		rank++;
	}
	
	void disp() {
		System.out.println(name+"���� ������ " + tot +"���̰�, ������ " + rank +"�� �Դϴ�.");
	}
}
class Student2 extends Student{
	private int math;
	/* Student2(){
	  	super()
	  }�� ��ü �����Ǿ��ֱ� ������ �θ�Ŭ�������� default�����ڰ� ������ ����*/
	 
	public Student2(String name,int kor,int eng,int math) {
		super(name,kor,eng);
		this.math=math;
		setTot();
	}
	public void setTot() {
		tot=getKor()+getEng()+math;
	}
	public boolean setMath(int math) {//set + ����ʵ� �̸� => setter�޼ҵ� : private��� ����
		if (math<0 || math>100) return false;
		this.math = math;
		return true;
	}
	public int getMath() {
		return math;
	}
	
}
public class TestObject03 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
		System.out.print("�ο����� �Է� : ");
		int inwon = in.nextInt();
		Student2[] st = new Student2[inwon];
		
		//��ü �����ϱ�
		for(int i=0; i<inwon; ++i) {
			System.out.print(i+1+"��° �л� �̸� : ");
			String name = in.next();
			int kor = input("����");
			int eng = input("����");
			int math = input("����");
			st[i] = new Student2(name, kor, eng,math);
		}
		
		//��������ϱ�
		for(int i=0; i<inwon; ++i) {
			st[i].clearRank();
			for(int j=0; j<inwon; ++j) {
				if (st[i].getTot() < st[j].getTot()) {
					st[i].plusRank();
				}
			}
		}
		
		//����ϱ�
		for(int i=0; i<inwon; ++i) {
			st[i].disp();
		}
		
		//����90�� ���� ��� ��� �ۼ�
		for(int i=0; i<inwon; ++i) {
			if (st[i].getTot() >= 90) {
				System.out.println(st[i].getName());
			}
		}
	}
	
	public static int input(String str) {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(str+"������ �Է� : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			System.out.println(str+"������ 0������ 100�� ���̸� �Է��� �ּ���!!");
		}
	}
}