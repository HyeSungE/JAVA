package Student_Score;
import java.io.Serializable;
import java.util.*;

public class StudentProImpl implements StudentPro,Serializable{

	private List<Student> list;
	
	public StudentProImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void input(String name, int kor, int eng) {
		Student input = new Student(name, kor, eng);
		list.add(input);
	}

	public void rank() {
		for(Student i : list) {
			i.clearRank();
			for(Student j : list) {
				if (i.getTot() < j.getTot()) {
					i.plusRank();
				}
			}
		}
	}
	
	@Override
	public List<Student> output(String name) {
		rank();
		if (name.equals("이름")) {
			Collections.sort(list);
		}else if (name.equals("국어")) {
			Comparator<Student> kor = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getKor() < o2.getKor()) {
						return 1;
					}else if (o1.getKor() > o2.getKor()) {
						return -1;
					}else {
						return 0;
					}
				}
			};
			Collections.sort(list, kor);
		}else if (name.equals("영어")) {
			Comparator<Student> eng = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getEng() < o2.getEng()) {
						return 1;
					}else if (o1.getEng() > o2.getEng()) {
						return -1;
					}else {
						return 0;
					}
				}
			};
			Collections.sort(list, eng);
		}else if (name.equals("총점")) {
			Comparator<Student> tot = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getTot() < o2.getTot()) {
						return 1;
					}else if (o1.getTot() > o2.getTot()) {
						return -1;
					}else {
						return 0;
					}
				}
			};
			Collections.sort(list, tot);
		}
		return list;
	}

	@Override
	public Student getStudent(String name) {
		for(Student st : list) {
			if (st.getName().trim().equals(name)) {
				return st;
			}
		}
		return null;
	}

	@Override
	public void edit(Student edit) {
		for(Student st : list) {
			if (st.getName().equals(edit.getName())) {
				st.setKor(edit.getKor());
				st.setEng(edit.getEng());
				st.setTot();
				return;
			}
		}
		
	}

	@Override
	public void delete(Student delete) {
		list.remove(delete);
	}

	@Override
	public void exit() {
		System.exit(0);
	}
}









