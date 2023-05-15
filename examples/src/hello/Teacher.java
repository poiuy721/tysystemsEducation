package hello;

public class Teacher {
	private String name;
	private int age;
	private String lesson;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setLesson(String lesson) {
		this.lesson=lesson;
	}
	public String getLesson() {
		return this.lesson;
	}
	
	public void printInfo() {
		System.out.println("===== Teacher Info =====");
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("과목 : "+this.lesson);
	}
}
