package ch05;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr="java ~~~ java ~~~ String";
		String newStr=oldStr.replace("java", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
