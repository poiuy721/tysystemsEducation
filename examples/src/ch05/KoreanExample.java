package ch05;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1=new Korean("123456-1234567","감자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		k1.name="김자바";
	}
}
