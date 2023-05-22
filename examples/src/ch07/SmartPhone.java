package ch07;

public class SmartPhone extends Phone{
	public boolean wifi;
	
	public SmartPhone(String model,String color) {
		super(model,color);
		System.out.println("SmartPhone(String,String) 생성자 실행");
	}
	
	public void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태를 변경하였습니다.");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
