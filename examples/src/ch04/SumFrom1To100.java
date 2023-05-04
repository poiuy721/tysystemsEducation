package ch04;
class Sum{
	int sumToNum(int num) {
		int i=1,
			result=0;
		
		while(i<=num) {
			result+=i;
			i++;
		}
		return result;
	}
}
public class SumFrom1To100 {
	int sumToNum(int num) {
		int i=1,
			result=0;
		
		while(i<=num) {
			result+=i;
			i++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n=100;
		//int sum=new Sum().sumToNum(n);
		int sum=new SumFrom1To100().sumToNum(n);
		
		System.out.println("sum 1~"+n+"= "+sum);
	}
}
