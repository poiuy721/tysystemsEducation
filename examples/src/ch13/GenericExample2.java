package ch13;

public class GenericExample2 {
	public static void main(String[] args) {
		Product<Tv,String> product1=new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트티비");
		
		Tv tv=product1.getKind();
		String tvModel=product1.getModel();
		
		Product<Car,String> product2=new Product<>();
		product2.setKind(new Car());
		product2.setModel("suv");
		
		Car c=product2.getKind();
		String carModel=product2.getModel();
		
	}
}
