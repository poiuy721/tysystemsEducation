package ch07;

public class PersonApp {

	public static void main(String[] args) {


		Student s = new Student();
		s.setName("Lee");
		s.setAge(30);
		s.setHakbun("2023-001");
		System.out.println("\n===== Student =====");
		System.out.print("이름=" + s.getName());
		System.out.print(" | 나이=" + s.getAge());
		System.out.println(" | 학번=" + s.getHakbun());


	}

}
