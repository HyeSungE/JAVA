package BaseballTeam_fail;

public class Player {
	private String name;
	private String team;
	private int Salary;
	
	Player(String name,String team,int salary){
		this.name=name;
		this.team=team;
		this.Salary=salary;
	}
	public void setTeam(String team) {
		this.team=team;
	}
	public void setSalary(int Salary) {
		this.Salary=Salary;
	}
	public void setName(String Name) {
		this.name=name;
	}
	public String getTeam() {
		return team;
	}
	public int getSalary() {
		return Salary;
	}
	public String getName() {
		return name;
	}
}
