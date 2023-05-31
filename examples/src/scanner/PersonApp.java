package scanner;

import java.util.Scanner;

import ch13.Person;

public class PersonApp {
	public static void main(String[] args) {
		System.out.println("==start==");
		Scanner sc=new Scanner(System.in);
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.println("나이: ");
		String age=sc.nextLine();
		Person p=new Person(name,Integer.parseInt(age));
		p.printInfo();
		sc.close();
		System.out.println("===end==");
	}
}
