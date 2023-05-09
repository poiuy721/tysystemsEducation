package ch06;

public class KoreanExample {
	public static void main(String[] args) {
		/*
		 * Korean k1=new Korean("Park","123-123"); System.out.println(k1.nation);
		 * System.out.println(k1.name); System.out.println(k1.ssn);
		 * System.out.println();
		 * 
		 * Korean k2=new Korean("Kim","456-123"); System.out.println(k2.nation);
		 * System.out.println(k2.name); System.out.println(k2.ssn);
		 * System.out.println();
		 */
		Korean k1=new Korean("123","kth");
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		k1.name="kkth";
	}
}
