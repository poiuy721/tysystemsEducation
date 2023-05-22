package ch07;


public class Student extends Person{

	private String hakbun; // 학번

	public Student() {
		System.out.println("Student()");
	}
	public Student(String name,int age,String hakbun) {
		super(name,age);
		this.hakbun=hakbun;
		System.out.println("Student(String,int,String)");
	}
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public void printInfo() {
		System.out.println("Student.printInfo() : 이름 : "+super.getName()+" | 나이 : "+super.getAge()+" | 학번 : "+hakbun);
	}

}