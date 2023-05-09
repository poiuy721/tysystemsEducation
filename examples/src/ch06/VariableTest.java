package ch06;

public class VariableTest {
	{
		System.out.println("instance initializer");
	}
	static String classVariable = "class variable";
	static {
		System.out.println("static initializer");
		System.out.println(VariableTest.classVariable+"1");
	}
	String memberVariable = "member variable";

	VariableTest() {
		System.out.println("Call constructor");
	}

	static void staticMethod(String argument) {
		System.out.println(argument);
	}

	void memberMethod() {
		String localVariable = "local variable";
		System.out.println(localVariable);
	}

	public static void main(String[] args) {

		System.out.println(VariableTest.classVariable);
		VariableTest.staticMethod("argument");
		VariableTest vt = new VariableTest();
		System.out.println(vt.memberVariable);

	}
}
