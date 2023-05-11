package ch05;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "java programming";

		int location = subject.indexOf("programming");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);

		location = subject.indexOf("java");
		if (location != -1)
			System.out.println("java subject");
		else
			System.out.println("not a java subject");

		boolean result = subject.contains("java");
		if (result)
			System.out.println("java subject");
		else
			System.out.println("not a java subject");
	}

}
