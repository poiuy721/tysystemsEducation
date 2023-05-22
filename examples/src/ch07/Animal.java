package ch07;

public class Animal {
	private String type;
	private String name;
	private int age;
	private String sex;
	public Animal(String type,String name,int age,String sex) {
		this.type=type;
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public void printInfo() {
		System.out.println("== Animal Info ==");
		System.out.println("동물="+type+" | 이름="+name+" | 나이="+age+" 성별="+(sex.equals("F")?"여":"남"));
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}
}
