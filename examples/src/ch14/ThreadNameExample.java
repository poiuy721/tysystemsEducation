package ch14;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainTh=Thread.currentThread();
		System.out.println(mainTh.getName()+" 실행");
		
		for(int i=0;i<3;i++) {
			Thread thA=new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+" 실행");
				}
			};
			thA.start();
		}
		Thread chatTh=new Thread() {
			public void run() {
				System.out.println(getName()+" 실행");
			}
		};
		chatTh.start();
	}
}
