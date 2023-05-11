package ch05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "hong";
		String strVar2 = "hong";

		System.out.println(strVar1==strVar2);
		System.out.println(strVar1.equals(strVar2));
		
		String strVar3 =new String( "hong");
		String strVar4 =new String ( "hong");

		System.out.println(strVar3==strVar4);
		System.out.println(strVar3.equals(strVar4));
	}
}
