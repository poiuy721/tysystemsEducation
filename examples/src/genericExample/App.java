package genericExample;

public class App {

	public static void main(String[] args) {
		Biz<Integer> biz1=new Biz<>();
		biz1.setData(10);
		System.out.println("biz1 data "+biz1.getData());

		Biz<String> biz2=new Biz<>();
		biz2.setData("lamb");
		System.out.println("biz2 data "+biz2.getData());

	}

}
