package ch07;

public class Character {
	private String name;
	public String getName() {
		return name;
	}

	public String getCharacter() {
		return character;
	}
	private String character;
	public Character(String name, String character) {
		super();
		this.name = name;
		this.character = character;
	}
	
	public void printInfo() {
		System.out.println("이름="+name+" | 캐릭터="+character);
	}
	public void attack() {
		System.out.println("공격");
	}
}
