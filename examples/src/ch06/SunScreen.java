package ch06;

public class SunScreen {
	String company;
	String name;
	boolean stickiness;
	char skinType;
	int volume;
	int spf;
	String pa;
	
	void setCompany(String company) {
		this.company=company;
	}
	void setName(String name) {
		this.name=name;
	}
	void setStickiness(boolean stickiness) {
		this.stickiness=stickiness;
	}
	void setSkinType(char skinType) {
		this.skinType=skinType;
	}
	void setVolume(int volume) {
		this.volume=volume;
	}
	void setSpf(int spf) {
		this.spf=spf;
	}
	void setPa(String pa) {
		this.pa=pa;
	}
	
	void printInfo() {
		System.out.println("===== SunScreen Info =====");
		System.out.println("회사 : "+this.company);
		System.out.println("제품 : "+this.name);
		System.out.println("끈적임 "+(this.stickiness?"있음":"없음"));
		switch(this.skinType) {
		case 's': System.out.println("피부타입 : 민감성"); break;
		case 'o': System.out.println("피부타입 : 지성"); break;
		case 'n': System.out.println("피부타입 : 중성"); break;
		case 'd': System.out.println("피부타입 : 건성"); break;
		}
		System.out.println("용량 : "+this.volume+"(ml)");
		System.out.println("SPF : "+this.spf);
		System.out.println("PA : "+this.pa);
	}
}
