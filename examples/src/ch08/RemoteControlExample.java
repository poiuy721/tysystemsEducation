package ch08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc=new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
	}
}
