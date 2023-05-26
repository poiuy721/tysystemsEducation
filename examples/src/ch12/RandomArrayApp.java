package ch12;

public class RandomArrayApp {
	public static void main(String[] args) {
		int[] arr=new int[7];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					System.out.println("중복 발생");
					i--;
					break;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
