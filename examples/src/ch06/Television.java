package ch06;

public class Television {
	static String company="my company";
	static String model="LCD";
	static String info;
	
	static{
		info=company+"-"+model;
		System.out.println("st");
	}
}
