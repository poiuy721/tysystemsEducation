package ch11;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array= {"100","1oo"};
		for(int i=0;i<=array.length;i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println(value);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}catch(Exception e) {
				System.out.println("실행에 문제가 잇습니다");
			}
		}
	}
}
