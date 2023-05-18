package ch05;

public class WeekIntent {
	public static void main(String[] args) {
		String daysString="일,월,화,수,목,금,토";
		
		String[] strArr= daysString.split(",");
			for(int i=0;i<strArr.length;i++) {
				for(int j=0;j<i;j++)
					System.out.print("	");
				System.out.println(strArr[i]+"요일");
			}
			
		
		
	}
}
