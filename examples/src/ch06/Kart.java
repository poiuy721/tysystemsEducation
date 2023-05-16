package ch06;

public class Kart {
	private String name;
	private String color;
	private int currentSpeed;
	private int upSpeed;
	private int downSpeed;
	private int maxSpeed;
	private int boosterSpeed;
	private int remainedBooster;
	private int maxBooster;
	
	
	public Kart() {}
	public Kart(String name,String color) {
		this.name=name;
		this.color=color;
		this.upSpeed=40;
		this.downSpeed=80;
		this.maxSpeed=150;
		this.boosterSpeed=100;
		this.maxBooster=1;
	}
	
	public void printKartInfo() {
		System.out.println("===Kart Info===");
		System.out.println("["+this.name+"("+this.color+")]");
		System.out.println("SpeedUp 증가 속도 : "+upSpeed+"(km)");
		System.out.println("SpeedDown 감소 속도 : "+downSpeed+"(km)");
		System.out.println("카트 최대 속도 : "+maxSpeed+"(km)");
		System.out.println("부스터 사용시 증가 속도 : "+boosterSpeed+"(km)");
		System.out.println("부스터 최대 개수 : "+maxBooster+"(개)");
	}
	public void speedUp() {
		if(currentSpeed+upSpeed<=maxSpeed)
			currentSpeed+=upSpeed;
		else currentSpeed=maxSpeed;
		System.out.println("["+name+"("+color+")] speedUp | 속도 : "+
		currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개)");
	}
	public void speedDown() {
		if(currentSpeed-downSpeed>=0)
			currentSpeed-=downSpeed;
		else currentSpeed=0;
		System.out.println("["+name+"("+color+")] speedDown | 속도 : "+
		currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개)");
	}
	public void pickupBooster() {
		if(remainedBooster==0) {
			remainedBooster++;
			System.out.println("["+name+"("+color+")] pickupBooster | 속도 : "+
			
		currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개)");
		}
		else
			System.out.println("["+name+"("+color+")] pickupBooster | 속도 : "+
					currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개) | 부스터를 더 이상 추가할 수 없습니다.");
	}
	public void useBooster() {
		if(remainedBooster==1) {
			remainedBooster--;
			if(currentSpeed+boosterSpeed<=maxSpeed)
				currentSpeed+=boosterSpeed;
			else currentSpeed=maxSpeed;
			System.out.println("["+name+"("+color+")] useBooster | 속도 : "+
					currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개)");
		}
		else {
			System.out.println("["+name+"("+color+")] useBooster | 속도 : "+
					currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개) | 사용 가능한 부스터가 없습니다.");
		}
	}
	
}
