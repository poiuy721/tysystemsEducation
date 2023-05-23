package ch08;

public class SmartTelevision implements RemoteControl,Searchable{

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url+"을 검색하빈다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv off");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}


	
}
