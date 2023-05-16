package ch06;

public class MobilePhone {
	private String company;
	private String name;
	private String os;
	private String color;
	private boolean pen;
	private int memory;
	private int storage;
	private int battery;
	
	public void setCompany(String company) {
		this.company=company;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setOs(String os) {
		this.os=os;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setPen(boolean pen) {
		this.pen=pen;
	}
	public void setMemory(int memory) {
		this.memory=memory;
	}
	public void setStorage(int storage) {
		this.storage=storage;
	}
	public void setBattery(int battery) {
		this.battery=battery;
	}
	void printInfo() {
		System.out.println("===== Mobile Phone Info =====");
		System.out.println("회사 : "+this.company);
		System.out.println("제품 : "+this.name);
		System.out.println("운영체제 : "+this.os);
		System.out.println("컬러 : "+this.color);
		System.out.println("펜 : "+(this.pen?"지원":"미지원"));
		System.out.println("메모리 : "+this.memory+" (GB)");
		System.out.println("스토리지 : "+this.storage+" (GB)");
		System.out.println("배터리 : "+this.battery+" (mAh)");
	}
}
