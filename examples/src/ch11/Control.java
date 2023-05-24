package ch11;

public class Control {
	
	public void method() throws ArrayIndexOutOfBoundsException{
		System.out.println("\tControl.method()::Start");	
		
		Service s = new Service();
		//try {
		s.method();
		//}catch(ArrayIndexOutOfBoundsException e) {
		//	System.out.println("\t----- catch : Control.method() -----");
		//}finally {

		//	System.out.println("\t----- finally : Control.method() -----");
		//}
		
		System.out.println("\tControl.method()::End");
	}

}
