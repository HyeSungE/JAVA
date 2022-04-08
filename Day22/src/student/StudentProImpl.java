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
			System.out.print(title+"점수를 입력 : ");
			int sub = in.nextInt();
			if (sub>=0 && sub<=100) return sub;
			System.out.println(title+"점수는 0점에서 100점 사이값만 넣어주세요!!");
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
			System.out.print("이름을 입력 : ");
			name = in.next();
			if (inName(name) == null) break;
			else System.out.println("동일한 이름이 존재합니다. 다시입력해 주세요!!");
		}
		int kor = inSub("국어");
		int eng = inSub("영어");
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
			System.out.println(output.getName()+"님의 총점은 " + output.getTot()+
					"점이고, 순위는 " + output.getRank() +"등 입니다.");
		}
	}
	
	public void edit() {
		System.out.print("수정할 학생의 이름 입력 : ");
		String name = in.next();
		Student edit = inName(name);
		if (edit != null) {
			int kor = inSub("수정할 국어");
			int eng = inSub("수정할 영어");
			edit.setKor(kor);
			edit.setEng(eng);
			edit.setTot();
			System.out.println(name+"학생의 국어, 영어점수를 수정하였습니다.");
			return;
		}
		System.out.println(name+"학생은 저희 학생이 아닙니다.");
	}
	
	public void delete() {
		System.out.print("삭제할 학생의 이름 입력 : ");
		String name = in.next();
		Student delete = inName(name);
		if (delete != null) {
			list.remove(delete);
			System.out.println(name+"학생을 삭제하였습니다.");
			return;
		}		
		System.out.println(name+"학생은 저희 학생이 아닙니다.");
	}
	
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
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
			System.err.println("파일 저장시 오류 발생!!" + e.getMessage());
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
			System.out.println("데이터 로드 끝!!");
		}catch(IOException e) {
			System.err.println("파일 로드시 오류 발생!!" + e.getMessage());
		}
		
	}
}









