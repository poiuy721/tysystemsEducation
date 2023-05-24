package ch11;

public class sp10_App {
	public static void main(String[] args) {
		
		try {
			System.out.println("===Object1===");
			String str1="Hello";
			System.out.println(str1.charAt(1));
			
			System.out.println("\n===Object2 ===");
			String str2="";
			System.out.println(str2.charAt(1));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("=== catch ===");
		}finally {
			System.out.println("=====finally====");
		}
	}
}
