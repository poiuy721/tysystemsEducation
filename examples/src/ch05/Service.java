package ch05;

import ch06.Actor;

public class Service {
	private static Actor actor;
	
	public static Actor getActor(String name,String sex,String birthDate,String nationality) {
		actor=new Actor(name,sex,birthDate,nationality);
		return actor;
	}
}