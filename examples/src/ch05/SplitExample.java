package ch05;

public class SplitExample {
	public static void main(String[] args) {
		String board="1,a,b,c,sds.";
		
		String[] tokens=board.split(",");
		
		for(String token:tokens)
			System.out.println(token);
	}
}
