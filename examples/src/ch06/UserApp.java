package ch06;

public class UserApp {
	public static void main(String[] args) {
		User u1=new User();
		u1.setName("James");
		u1.setAge(30);
		u1.setHeight(178.5F);
		u1.setSex('M');
		u1.setMarriageYn(true);
		u1.printInfo();
		
		User u2=new User("Paige",25,'W');
		u2.setHeight(175.2F);
		u2.setMarriageYn(true);
		u2.printInfo();
		
		User u3=new User("Victoria",30,'W',180.0f,false);
		u3.printInfo();
	}
}
