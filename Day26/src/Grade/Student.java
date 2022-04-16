package Grade;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int rank;
	public Student(String name,int kor,int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.rank=1;
	}
	
	public String getName() {
		return this.name;
	}
	public  int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getSum() {
		return this.kor+this.eng;
	}
	public void addRank() {
		this.rank++;
	}
	public int getRank() {
		return this.rank;
	}
}
