package ch07;

public abstract class Phone {
	public String model;
	public String color;
	String owner;
	
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
	public Phone(String model,String color) {
		this.model=model;
		this.color=color;
		System.out.println("Phone(String,String) 생성자 실행");
	}
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
		
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: "+message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
