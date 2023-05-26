package ch09;

public class App {
	public static void main(String[] args) {
		System.out.println("====Object====");
		Character archer = new Archer();
		archer.attack();

		System.out.println("\n=====Anonymous Object =====");
		Character c1 = new Character() {
			public void attack() {
				System.out.println("원거리 공격");
			}
		};
		c1.attack();

		System.out.println("\n-----Game.attack()-----");
		Game game = new Game();
		game.attack(archer);
		game.attack(c1);

		System.out.println("\n=====Knight =====");
		Character c2 = new Character() {
			public void attack() {
				System.out.println("근거리 공격");
			}
		};
		c2.attack();
		game.attack(c2);

		System.out.println("\n=====Wizard =====");
		Character c3 = new Character() {
			public void attack() {
				System.out.println("마법 공격");
			}
		};
		c3.attack();
		game.attack(c3);
		
		System.out.println("\n=====Rifle Man ======");
		Character c4=new Character("제임스","라이플맨") {
			public void attack() {
				System.out.println("소총 공격");
			}
		};
		c4.printInfo();
		c4.attack();
		game.attack(c4);
	}
}
