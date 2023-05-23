package ch07;

public class Game {
	public void attack(Character c) {
		System.out.print("["+c.getName()+" / "+c.getCharacter()+"] ");
		if(c instanceof Wizard)
			System.out.println("마법 공격");
		else if(c instanceof Knight)
			System.out.println("근거리 공격");
		else if(c instanceof Archer)
			System.out.println("원거리 공격");
		else if(c instanceof Character)
			System.out.println("공격");
	}
}
