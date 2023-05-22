package ch07;


public class Teacher extends Person{

	private String lesson; // 과목

	public Teacher() {
		System.out.println("Teacher()");
	}
	public Teacher(String name,int age,String lesson) {
		super(name,age);
		this.lesson=lesson;
		System.out.println("Teacher(String,int,String)");
	}
	public void setLesson(String newLesson) {
		lesson = newLesson;
	}

	public String getLesson() {
		return lesson;
	}

	public void printInfo() {
		System.out.println("Teacher.printInfo() : 이름 : "+super.getName()+" | 나이 : "+super.getAge()+" | 과목 : "+lesson);
	}
}
