package ch07;

public class App {

	public static void main(String[] args) {

		Person p=new Person("Paige",20);
		Student s=new Student("James",30,"2023-001");
		Teacher t=new Teacher("Victoria",40,"Music");
		
		Person[] pArray=new Person[3];
		pArray[0]=p;
		pArray[1]=s;
		pArray[2]=t;
		
		for(int i=0;i<pArray.length;i++)
			pArray[i].printInfo();

	}

}