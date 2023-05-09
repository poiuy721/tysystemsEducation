package ch06;

public class Computer {
	int sum(int ... values) {
		int sum=0;
		for(int i:values) {
			sum+=i;
		}
		return sum;
	}
}
