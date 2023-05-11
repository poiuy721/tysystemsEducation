package ch05;

public class ArrayCreatedByValueListExample2 {
	public static void main(String[] args) {
		int[]scores;
		scores=new int[] {83,90,87};
		
		int sum1=0;
		for(int score:scores)
			sum1+=score;
		System.out.println(sum1);
		
		printItem(new int[] {80,90,87});
	}
	public static void printItem(int[] scores) {
		for(int score:scores)
			System.out.println(score);
	}
}
