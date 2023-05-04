package ch04;
class WorkTime {
	int time = 0;

	public WorkTime(int time) {
		this.time = time;
	}
	
	int getTime() {
		return this.time;
	}
	
	void workTime() {
		switch (time) {
		case 8:
			System.out.println("case 8");
		case 9:
			System.out.println("case 9");
		case 10:
			System.out.println("case 10");
		default:
			System.out.println("default");
		}
	}
}
public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time=(int)(Math.random()*4)+8;
		
		WorkTime w=new WorkTime(time);
		System.out.println(w.getTime());
		w.workTime();

	}
}
