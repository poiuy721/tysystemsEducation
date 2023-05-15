package hello;

public class FootballPlayer {
	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setUniformNumber(String uniformNumber) {
		this.uniformNumber=uniformNumber;
	}
	public String getUniformNumber() {
		return this.uniformNumber;
	}
	public void setTeamName(String teamName) {
		this.teamName=teamName;
	}
	public String getTeamName() {
		return this.teamName;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setTech(int tech) {
		this.tech=tech;
	}
	public int getTech() {
		return this.tech;
	}
	
	public void printInfo() {
		System.out.println("\n===== FootballPlayer Info =====");
		System.out.println("선수="+this.name);
		System.out.println("팀="+this.teamName);
		System.out.println("유니폼 번호="+this.uniformNumber);
		System.out.println("스피드="+this.speed);
		System.out.println("기술="+this.tech);
	}
}
