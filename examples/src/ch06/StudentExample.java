package ch06;


public class StudentExample {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.age=27;
		s1.name="김태형";

		Student s2=new Student();
		s2.age=20;
		s2.name="최유민";

		 System.out.println("s1: "+s1.name+", "+s1.age);
		 System.out.println("s2: "+s2.name+", "+s2.age);
	}
}
