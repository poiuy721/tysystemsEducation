package ch14;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread wtA=new WorkThread("workThreadA");
		WorkThread wtB=new WorkThread("workThreadB");
		wtA.start();
		wtB.start();
		
		try {Thread.sleep(5000000);} catch(InterruptedException e) {}
		wtA.work=false;
		try {Thread.sleep(10000000);} catch(InterruptedException e) {}
		wtA.work=true;
	}
}
