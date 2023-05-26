package ch09;

public class Car {
	private Tire tire1=new Tire();
	private Tire tire2=new Tire() {
		public void roll() {
			System.out.println("익명 자식 객체1");
		}
	};
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire=new Tire() {
			public void roll() {
				System.out.println("익명 자식 객체2");
			}
		};
		tire.roll();
		
	}
	public void run3(Tire tire) {
		tire.roll();
	}
}
