package ch05;

public class MultiIntArrayApp {
	public static void main(String[] args) {
		int[][] intArray=new int[2][];
		intArray[0]=new int[2];
		intArray[1]=new int[3];
		
		intArray[0][0]=0;
		intArray[0][1]=1;
		
		intArray[1][0]=10;
		intArray[1][1]=11;
		intArray[1][2]=12;
		
		System.out.println("==intArray[0]===");
		System.out.println("배열길이="+intArray[0].length);
		for(int i=0;i<intArray[0].length;i++)
			System.out.println("intArray[0]["+i+"]="+intArray[0][i]);
		
		System.out.println("== int Array==");
		System.out.println("배열길이="+intArray.length);
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++)
				System.out.println("intArray["+i+"]["+j+"]="+intArray[i][j]);
		}
	}
}
