package ch06;

public class Kart {
	private String name;
	private String color;
	private int currentSpeed;
	private static final int UP_SPEED=40;
	private static final int DOWN_SPEED=80;
	private static final int MAX_SPEED=150;
	private static final int BOOSTER_SPEED=100;
	private int remainedBooster;
	private static final int MAX_BOOSTER=1;
	
	
	public Kart() {}
	public Kart(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
	public void printKartInfo() {
		System.out.println("===Kart Info===");
		System.out.println("["+this.name+"("+this.color+")]");
		System.out.println("SpeedUp 증가 속도 : "+UP_SPEED+"(km)");
		System.out.println("SpeedDown 감소 속도 : "+DOWN_SPEED+"(km)");
		System.out.println("카트 최대 속도 : "+MAX_SPEED+"(km)");
		System.out.println("부스터 사용시 증가 속도 : "+BOOSTER_SPEED+"(km)");
		System.out.println("부스터 최대 개수 : "+MAX_BOOSTER+"(개)");
	}
	public void speedUp() {
		if(currentSpeed+UP_SPEED<=MAX_SPEED)
			currentSpeed+=UP_SPEED;
		else currentSpeed=MAX_SPEED;
		System.out.println("["+name+"("+color+")] speedUp | 속도 : "+
		currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개)");
	}
	public void speedDown() {
		if(currentSpeed-DOWN_SPEED>=0)
			currentSpeed-=DOWN_SPEED;
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
			if(currentSpeed+BOOSTER_SPEED<=MAX_SPEED)
				currentSpeed+=BOOSTER_SPEED;
			else currentSpeed=MAX_SPEED;
			System.out.println("["+name+"("+color+")] useBooster | 속도 : "+
					currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개)");
		}
		else {
			System.out.println("["+name+"("+color+")] useBooster | 속도 : "+
					currentSpeed+"(km) | 부스터 : "+remainedBooster+"(개) | 사용 가능한 부스터가 없습니다.");
		}
	}
	
}
