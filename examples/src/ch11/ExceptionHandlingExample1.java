package ch11;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result=data.length();
		System.out.println("문자수:"+result);
	}
	
	public static void main(String[] args) {
		printLength("Thisisjava");
		printLength(null);
		System.out.println("종료");
	}
}
