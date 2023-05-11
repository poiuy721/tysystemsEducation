package ch05;

public class ArrayCreatedByValueListExample1 {
	public static void main(String[] args) {
		String[] season= {"spring","summer","fall","winter"};
		
		for(String s:season)
			System.out.println(s);
		
		season[1]="SUMMER";
		System.out.println(season[1]);
		
		int[] scores= {83,90,87};
		int sum=0;
		for(int score:scores) 
			sum+=score;
		System.out.println(sum);
		double avg=sum/3.0;
		System.out.println(avg);
	}
}
