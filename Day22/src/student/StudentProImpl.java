package student;
import java.util.*;
import java.io.*;
public class StudentProImpl implements StudentPro{

	private ArrayList<Student> list;
	private Scanner in;
	private File dir, data;
		
	public StudentProImpl(){
		list = new ArrayList<>();
		in = new Scanner(System.in);
		dir = new File("C:\\Users\\i7C-43\\eclipse-workspace\\Day22\\src\\student");
		data = new File(dir, "data.txt");
	}
	
	protected int inSub(String title) {
		while(true) {
			System.out.print(title+"������ �Է� : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			System.out.println(title+"������ 0������ 100�� ���̰��� �־��ּ���!!");
		}
	}
	
	protected Student inName(String name) {
		for(Student st : list) {
			if (st.getName().equals(name)) {
				return st;
			}
		}
		return null;
	}
	
	public void input() {
		String name = null;
		while(true) {
			System.out.print("�̸��� �Է� : ");
			name = in.next();
			if (inName(name) == null) break;
			else System.out.println("������ �̸��� �����մϴ�. �ٽ��Է��� �ּ���!!");
		}
		int kor = inSub("����");
		int eng = inSub("����");
		Student input = new Student(name, kor, eng);
		list.add(input);
	}
	
	protected void rank() {
		for(Student rank1 : list) {
			rank1.clearRank();
			for(Student rank2 : list) {
				if (rank1.getTot() < rank2.getTot()) {
					rank1.plusRank();
				}
			}
		}
	}
	
	public void output() {
		rank();
		Collections.sort(list);
		for(Student output : list) {
			System.out.println(output.getName()+"���� ������ " + output.getTot()+
					"���̰�, ������ " + output.getRank() +"�� �Դϴ�.");
		}
	}
	
	public void edit() {
		System.out.print("������ �л��� �̸� �Է� : ");
		String name = in.next();
		Student edit = inName(name);
		if (edit != null) {
			int kor = inSub("������ ����");
			int eng = inSub("������ ����");
			edit.setKor(kor);
			edit.setEng(eng);
			edit.setTot();
			System.out.println(name+"�л��� ����, ���������� �����Ͽ����ϴ�.");
			return;
		}
		System.out.println(name+"�л��� ���� �л��� �ƴմϴ�.");
	}
	
	public void delete() {
		System.out.print("������ �л��� �̸� �Է� : ");
		String name = in.next();
		Student delete = inName(name);
		if (delete != null) {
			list.remove(delete);
			System.out.println(name+"�л��� �����Ͽ����ϴ�.");
			return;
		}		
		System.out.println(name+"�л��� ���� �л��� �ƴմϴ�.");
	}
	
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	public void save() {
		try {
			FileWriter fw = new FileWriter(data);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for(Student save : list) {
				pw.println(save.getName()+"@"+save.getKor()+"@"+save.getEng());
				pw.flush();
			}
			pw.close();
		}catch(IOException e) {
			System.err.println("���� ����� ���� �߻�!!" + e.getMessage());
		}
		
	}

	public void load() {
		list.clear();
		try {
			FileReader fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String str = br.readLine();
				if(str==null) break;
				String std[] = str.split("@");
				Student load = new Student(std[0],Integer.parseInt(std[1]),Integer.parseInt(std[2]));
				list.add(load);
			}
		}catch(EOFException e) {
			System.out.println("������ �ε� ��!!");
		}catch(IOException e) {
			System.err.println("���� �ε�� ���� �߻�!!" + e.getMessage());
		}
		
	}
}









