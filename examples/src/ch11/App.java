package ch11;

public class App {

	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{

		System.out.println("App.main()::Start");

		Control c = new Control();
		//try {
			c.method();
		//} catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println("----- catch : Main.main() -----");
		//} finally {
		//	System.out.println("----- finally : Main.main() -----");
		//}

		System.out.println("App.main()::End");

	}

}