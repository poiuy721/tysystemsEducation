package ch06;

public class Actor {
	private String name;
	private String sex;
	private String birthdate;
	private String nationality;
	public Actor(String name,String sex, String birthdate,String nationality) {
		this.name=name;
		this.sex=sex;
		this.birthdate=birthdate;
		this.nationality=nationality;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void printInfo() {
		System.out.println("이름="+name);
		System.out.println("성별="+sex);
		System.out.println("생년월일="+birthdate);
		System.out.println("국적="+nationality);
	}
}
