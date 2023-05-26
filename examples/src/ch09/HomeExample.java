package ch09;

public class HomeExample {
	public static void main(String[] args) {
		Home h=new Home();
		h.use1();
		h.use2();
		h.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("난방을 켭니다");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("난방을 끕니다");
			}
			
		});
	}
}
