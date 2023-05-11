package ch05;

public class ArrayCreatedByNewExample {
	public static void main(String[] args) {
		int[] arr1=new int[3];
		for(int i:arr1)
			System.out.println(i);
		
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		for(int i:arr1)
			System.out.println(i);
		
		double[] arr2=new double[3];
		for(double i:arr2)
			System.out.println(i);
		
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		
		for(double i:arr2)
			System.out.println(i);
		
		String[] arr3=new String[3];
		for(String i:arr3)
			System.out.println(i);
		
		arr3[0]="jan";
		arr3[1]="feb";
		arr3[2]="mar";
		
		for(String i:arr3)
			System.out.println(i);
	}
}
