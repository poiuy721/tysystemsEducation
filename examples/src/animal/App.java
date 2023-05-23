package animal;

public class App {

	public static void main(String[] args) {

		System.out.println("===== cry() =====");
		Bird bird = new Bird();
		Cow cow = new Cow();

		animalSound(cow);
		animalSound(bird);
	}
	public static void animalSound(Animal a) {
		a.sound();
	}
}
