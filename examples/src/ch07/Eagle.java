package ch07;

public class Eagle extends Animal{
	private int wings;
	public Eagle(String name,int age,String sex,int wings) {
		super("Eagle",name,age,sex);
		this.wings=wings;
	}
	
	public void printInfo() {
		System.out.println("=== Eagle Info ====");
		System.out.println("동물="+super.getType()+" | 이름="+super.getName()+" | 나이="+super.getAge()+" | 성별="+(super.getSex().equals("M")?"남":"여")+" | 날개="+wings+"(개)");
		

	}
	
	public void fly() {
		System.out.println(super.getName()+" :: fly()");
	}
}
