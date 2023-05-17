package ch06;

public class Singer {
	String name;
	char sex;
	String birthDate;
	String companyt;
	
	public Singer(String name,char sex,String birthDate,String companyt) {
		this.name=name;
		this.sex=sex;
		this.birthDate=birthDate;
		this.companyt=companyt;
	}
	
	public void printInfo() {
		System.out.println("이름="+name);
		if(sex=='F')
			System.out.println("성별=여");
		else System.out.println("성별=남");
		System.out.println("생년월일="+birthDate);
		System.out.println("소속사="+companyt);
	}
}
