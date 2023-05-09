package hello;


public class Hello {

	static int solution(int a, int b) {
        int answer = 0;
        if(Integer.parseInt(Integer.toString(a)+Integer.toString(b))>Integer.parseInt(Integer.toString(b)+Integer.toString(a))){
            answer=Integer.parseInt(Integer.toString(a)+Integer.toString(b));
    }
        else
            answer=Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        return answer;
}
	public static void main(String[] args) {
		
		System.out.println(solution(19,91));
		
		
	}
}
