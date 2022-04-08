package baseBall;

public class Player {
	private String name;
	private String club;
	private int salary;
	
	public Player(String name, String club, int salary) {
		this.club = club;
		this.name = name;
		this.salary = salary;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	public String getName() {
		return name;
	}
	public String getClub() {
		return club;
	}
	public int getSalary() {
		return salary;
	}
}









