package ch06;

public class Customer {
	 String id;
	 String password;
	 String name;
	 String tel;
	 String addr;
	
	Customer(){
		
	}
	
	Customer(String id,String pw,String name){
		this.id=id;
		this.password=pw;
		this.name=name;
	}
	
	Customer(String id,String pw,String name,String tel,String addr){
		this.id=id;
		this.password=pw;
		this.name=name;
		this.tel=tel;
		this.addr=addr;
	}
	
}
