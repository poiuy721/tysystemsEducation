package ch08;

public class MultiInterfaceExample {
	public static void main(String[] args) {
		RemoteControl rc=new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable s=new SmartTelevision();
		s.search("youtube.com");
	}
}
