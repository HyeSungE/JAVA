import java.util.Comparator;

public class Student implements Comparable<Student>{
	private String name;
	private int kor;
	private int eng;
	private int total;
	
	Student(String name, int kor, int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.total=this.kor+this.eng;
	}

	

	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return this.eng;
	}

	public int getTotal() {
		return this.total;
	}

	public void setKor(int kor) {
		this.kor=kor;
	}

	public void setEng(int eng) {
		this.eng=eng;
	}

	public void setTotal() {
		this.total=this.kor+this.eng;
		
	}


	
	
	
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.getName().compareTo(o.getName()) ;
		}
	
}
