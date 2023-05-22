package hello;

public class Test {
	public static void main(String[] args) {
		int[][] queries= {{0,4,2},{0,3,2},{0,2,2}};
		int[] arr= {0,1,2,4,3};
        int answerNum=0;
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if(arr[j]>queries[i][2]){
                	answerNum=arr[j];
                	System.out.println(answerNum);
                    if(answerNum>arr[j]) {
                        answerNum=arr[j];
                    }
                }
                else answerNum=-1;
            }
            answer[i]=answerNum;
        }
        
        for(int a:answer) {
        	System.out.println(a);
        }
	}
}
