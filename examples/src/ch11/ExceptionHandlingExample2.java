package ch11;

public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수:" + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("마지막 실행");
		}
	}

	public static void main(String[] args) {
		printLength("Thisisjava");
		printLength(null);
		System.out.println("종료");
	}

}
