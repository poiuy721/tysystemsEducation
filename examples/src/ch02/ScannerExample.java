package ch02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("x: ");
		String strX=scanner.nextLine();
		int x=Integer.parseInt(strX);
		
		System.out.print("y: ");
		String strY=scanner.nextLine();
		int y=Integer.parseInt(strY);
		
		int result=x+y;
		System.out.println("x+y: "+result);
		System.out.println();
		
		while(true) {
			System.out.print("Input string: ");
			String data=scanner.nextLine();
			if(data.equals("q")) {break;}
			System.out.println("Output string: "+data);
			System.out.println();
		}
		
		System.out.println("quit");
		
	}
}
