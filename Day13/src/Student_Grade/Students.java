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
		//�̸����� : return name.compareTo(o.getName());
		//->Collections.sort()�ϸ� �̸����� �����̵�
		if(rank < o.getRank()) {
			return -1;
		}//������ ������������ ���� ������ ������ (������) ���� ���
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
		
		System.out.println(name+"���� ������������ "+getTotal()+"���Դϴ� "+rank+"���Դϴ�. ");
	}
	
}