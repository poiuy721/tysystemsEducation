package ch13;

public class BizApp {
	public static void main(String[] args) {
		Biz<Cat> bizCat=new Biz<Cat>(new Cat());
		Cat cat=bizCat.getT();
		cat.printInfo();
		
		Eagle eagle=bizCat.biz(new Eagle());
		eagle.printInfo();
		
		System.out.println("명시적 방법");
		Biz2 biz=new Biz2();
		Integer i=biz.<Integer>biz(100);
		System.out.println(i);
		
		System.out.println("묵시적 방법");
		String str=biz.biz("hi");
		System.out.println(str);
	}
}
