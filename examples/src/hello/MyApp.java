package hello;

public class MyApp {
	public static void main(String[] args) {
		FootballPlayer fp1=new FootballPlayer();
		fp1.setName("a");
		fp1.setTeamName("b");
		fp1.setUniformNumber("5");
		fp1.setSpeed(5);
		fp1.setTech(3);
		fp1.printInfo();
		

		FootballPlayer fp2=new FootballPlayer();
		fp2.printInfo();
		
	}
}