package scanner;

import java.util.Scanner;

public class WhileSwitchApp {
	public static void main(String[] args) {
		System.out.println("===start===");
		Scanner sc=new Scanner(System.in);
		boolean whileLoop=true;
		while(whileLoop) {
			System.out.println("\n0~9사이의 숫자를 입력");
			System.out.print("9는 종료 : ");
			String choice=sc.nextLine();
			switch(choice) {
			case"9":
				System.out.println("종료");
				whileLoop=false;
				break;
			default:
				System.out.println("계속 진행");
				break;
			}
		}
		sc.close();
		System.out.println("===end===");
	}
}
