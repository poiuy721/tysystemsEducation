package ch04;

import java.util.Scanner;

public class KeyControlExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int speed=0;
		
		/*
		 * while(run){ System.out.println("1  2  3"); String strNum=sc.nextLine();
		 * 
		 * if(strNum.equals("1")) { speed++; System.out.println("now "+speed); }else
		 * if(strNum.equals("2")) { speed--; System.out.println("now "+speed); }else
		 * if(strNum.equals("3")) { run=false; } }
		 */
		
		do {
			System.out.println("1  2  3");
			String strNum=sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도= "+speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도= "+speed);
			}else if(strNum.equals("3")) {
				run=false;
			}
		}while(run);
		
		System.out.println("프로그램 종료");
	}
}
