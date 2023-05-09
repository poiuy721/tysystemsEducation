package hello;

public class Test {
	public static void main(String[] args) {
		Bus bus1=new Bus();
		Car bus2=new Bus();
		Bus bus3=(Bus)bus2;
		
		System.out.println(bus1);
		System.out.println(bus3.getSeat());
		System.out.println(((Bus)bus2).getSeat());
	}
}
