package ch05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("less argument");
			System.exit(0);
		}
		
		String str1=args[0];
		String str2=args[1];
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
}
