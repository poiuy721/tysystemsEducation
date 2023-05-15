package hello;

public class CarCompany {
	public static void main(String[] args) {
		Car[] cars=new Bus[5];

		for(int i=0;i<5;i++) {
			cars[i]=new Bus(1,2,3);
		}
		//1번 예제
		int s=((Bus[])cars)[0].getSeat();
		System.out.println(s);
		
		Car[] carArr=new Car[5];
		carArr[0]=new Bus(4,5,6);
		
		//2번 예제
		s=((Bus)carArr[0]).getSeat();
		System.out.println(s);
	}
}
