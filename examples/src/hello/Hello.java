package hello;


public class Hello {

	static String staticVariable="static variable";
	String memberVariable="member variable";
	Hello(){
		System.out.println("Call constructor");
	}
	static void staticMethod(String argument) {
		System.out.println(argument);
	}
	void memberMethod() {
		String localVariable="local variable";
		System.out.println(localVariable);
	}
	public static void main(String[] args) {
		System.out.println(Hello.staticVariable);
		Hello.staticMethod("argument");
		Hello h=new Hello();
		System.out.println(h.memberVariable);
		
		
		
	}
}
