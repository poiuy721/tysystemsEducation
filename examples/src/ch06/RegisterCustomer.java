package ch06;

public class RegisterCustomer {
	public static void main(String[] args) {
		Customer c1=new Customer("ty1","1234","kth");
		Customer c2=new Customer("ty2","2345","kht","01012345678","Korea");
		
		System.out.println(c1.name+" "+c1.tel+" "+c1.addr);
		System.out.println(c2.name+" "+c2.tel+" "+c2.addr);
	}
}
