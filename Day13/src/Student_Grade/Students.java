package Student_Grade;

class Students implements Comparable<Students>{
	private String name;
	private int kor;
	private int eng;
	int total;
	int rank;
	Students(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	@Override
	public int compareTo(Students o) {
		//이름정렬 : return name.compareTo(o.getName());
		//->Collections.sort()하면 이름으로 정렬이됨
		if(rank < o.getRank()) {
			return -1;
		}//순위를 오름차순으로 정렬 순위가 적으면 (높으면) 먼저 출력
		else if(rank>o.getRank()) {
			return 1;
		}
		else return 0;
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
	int getRank() {
		return rank;
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