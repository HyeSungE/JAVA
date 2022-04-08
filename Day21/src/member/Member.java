package member;

public class Member implements Comparable<Member>{
	private String name;
	private String tel;
	public Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public void disp() {
		System.out.println(name+"님의 전화번호는 " + tel +"번 입니다.");
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.getName());
	}
}










