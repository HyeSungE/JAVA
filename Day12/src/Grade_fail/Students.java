package Grade_fail;

class Students{
	protected String name;
	private int kor;
	private int eng;
	int total;
	int rank;
	Students(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	void setKor(int kor) {
		this.kor=kor;
	}
	void setEng(int eng) {
		this.eng=eng;
	}
	void setRank() {
		rank++;
	}
	String getName() {
		return name;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getTotal() {
		return kor+eng;
	}
	void rankReset() {
		rank=1;
	}
	public void display() {
		System.out.println(name+"님의 성적의총점은 "+getTotal()+"점입니다 "+rank+"등입니다. ");
	}
}