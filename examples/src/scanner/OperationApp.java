package scanner;

import java.util.Scanner;

public class OperationApp {
	public static void main(String[] args) {
		System.out.println("===start====");
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		String i1=sc.nextLine();
		System.out.print("두번째 숫자: ");
		String i2=sc.nextLine();
		
		int plusResult=Integer.parseInt(i1)+Integer.parseInt(i2);
		System.out.print(i1+"+"+i2+"=");
		System.out.println(plusResult);
		sc.close();
		System.out.println("===end==");
	}
}
