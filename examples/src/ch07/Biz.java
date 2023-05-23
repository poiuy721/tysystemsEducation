package ch07;

public class Biz {

	public void top(Person person) {
		// - 모두 Person 클래스 객체를 가지고 있다.
		// - 따라서 첫번째 if 문만 실행된다.

		if (person instanceof Person) {
			System.out.println("Person");
		} else if (person instanceof Student) {
			System.out.println("Student");
		} else if (person instanceof Teacher) {
			System.out.println("Teacher");
		}

	}

	public void down(Person person) {

		if (person instanceof Student) {
			System.out.println("\n----- person instanceof Student -----");

			System.out.println("이름 : " + person.getName());
			System.out.println("나이 : " + person.getAge());
//			System.out.println("학번 : " + person.getHakbun());	// Error

			Student student = (Student) person; // Object Casting
			System.out.println("학번 : " + student.getHakbun());

		} else if (person instanceof Teacher) {
			System.out.println("\n----- person instanceof Teacher -----");

			System.out.println("이름 : " + person.getName());
			System.out.println("나이 : " + person.getAge());
//			System.out.println("과목 : " + person.getLesson());	// Error

			Teacher teacher = (Teacher) person; // Object Casting
			System.out.println("과목 : " + teacher.getLesson());

		} else if (person instanceof Person) {
			System.out.println("\n----- person instanceof Person -----");

			System.out.println("이름 : " + person.getName());
			System.out.println("나이 : " + person.getAge());
		}
	}

}

