package hello;

public class Test {
	public static void main(String[] args) {
		int[] numLog= {1,2,3,4,5,6,7,8,9};
        String answer = "";
        for(int i=0;i<numLog.length-1;i++){
            if((numLog[i+i]-numLog[i])==1)
                answer+="w";
            else if((numLog[i+i]-numLog[i])==-1)
                answer+="s";
            else if((numLog[i+i]-numLog[i])==10)
                answer+="d";
            else if((numLog[i+i]-numLog[i])==-10)
                answer+="a";
        }
        System.out.println(answer);
	}
}
