package Grade;

public class Student {
	private String name;
	private int kor;
	private int eng;
	int total;
	int rank;
	
	Student(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		total=kor+eng;
	}
	
	public int getTotal() {
		return kor+eng;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setRank() {
		rank++;
	}
	public void rankReset() {
		this.rank=1;
	}
	public int getRank() {
		return rank;
	}
	public void display() {
		System.out.println("이름 : "+getName()+" 성적의 총합 : "+getTotal()+" 등 수 : "+getRank());
	}
}
