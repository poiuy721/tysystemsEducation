package ch05;

public class WeekDayApp {
	public static void main(String[] args) {
		String [] weekDay;
		weekDay =new String[7];
		weekDay[0]="월요일";
		weekDay[1]="화요일";
		weekDay[2]="수요일";
		weekDay[3]="목요일";
		weekDay[4]="금요일";
		weekDay[5]="토요일";
		weekDay[6]="일요일";
		
		System.out.println("==week day==");
		for(int i=0;i<weekDay.length;i++) {
			System.out.println("weekDay["+i+"] "+weekDay[i]);
		}
		
	}
}
