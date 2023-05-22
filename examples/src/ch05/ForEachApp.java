package ch05;

public class ForEachApp {
	public static void main(String[] args) {
		String[] messageArr= {"hello","world","welcome"};
		
		System.out.println("-for-");
		for(int i=0;i<messageArr.length;i++) {
			System.out.println(messageArr[i]);
		}
		
		System.out.println("-advanced for-");
		for(String str:messageArr)
			System.out.println(str);
	}
}
