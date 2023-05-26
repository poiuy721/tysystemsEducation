package hello;
import java.util.Scanner;
import java.io.FileInputStream;
public class Test {
	static int AnswerN;
	static int N = 10;
	

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		String[][] strArr;
		int T = sc.nextInt();
		int xX=0;
		int xY=0;
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			strArr=new String[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					//배열에 장기판 저장
					strArr[i][j]=sc.next();
					
					if(strArr[i][j].equals("X")) {
						//X의 좌표 저장
						xX=j;
						xY=i;
					}
				}
			}
			//X의 x,y좌표가 다음으로 이동할 좌표
			int nextX=xX;
			int nextY=xY;
			//오른쪽으로 움직일때 체크
			//X좌표가 다음으로 이동할곳은 0이상 N이하
			//H를 하나 뛰어넘어야함-> H를 두번 만나야함
			int hStack=0;
			//오른쪽 탐색 시작
			while(nextX>0&&nextX<N&&nextY>0&&nextY<N) {
				nextX++;
				//1. Y를 만나면 더 움직일 수 없음
				if(strArr[nextY][nextX].equals("Y"))
					break;
				else if(strArr[nextY][nextX].equals("H")) {
					hStack++;
					if(hStack==2) { //H를 두번 만나면 h스택을 초기화 시키고 정답결과 +1, 오른쪽 탐색 끝.
						hStack=0;
						AnswerN++;
						break;
					}
				}
			}
			nextX=xX;
			nextY=xY;
			//왼쪽 탐색 시작
			while(nextX>0&&nextX<N&&nextY>0&&nextY<N) {
				nextX--;
				//1. Y를 만나면 더 움직일 수 없음
				if(strArr[nextY][nextX].equals("Y"))
					break;
				else if(strArr[nextY][nextX].equals("H")) {
					hStack++;
					if(hStack==2) { //H를 두번 만나면 h스택을 초기화 시키고 정답결과 +1, 왼쪽 탐색 끝.
						hStack=0;
						AnswerN++;
						break;
					}
				}
			}
			nextX=xX;
			nextY=xY;
			//아래쪽 탐색 시작
			while(nextX>0&&nextX<N&&nextY>0&&nextY<N) {
				nextY++;
				//1. Y를 만나면 더 움직일 수 없음
				if(strArr[nextY][nextX].equals("Y"))
					break;
				else if(strArr[nextY][nextX].equals("H")) {
					hStack++;
					if(hStack==2) { //H를 두번 만나면 h스택을 초기화 시키고 정답결과 +1, 아래쪽 탐색 끝.
						hStack=0;
						AnswerN++;
						break;
					}
				}
			}
			nextX=xX;
			nextY=xY;
			//위쪽 탐색 시작
			while(nextX>0&&nextX<N&&nextY>0&&nextY<N) {
				nextY--;
				//1. Y를 만나면 더 움직일 수 없음
				if(strArr[nextY][nextX].equals("Y"))
					break;
				else if(strArr[nextY][nextX].equals("H")) {
					hStack++;
					if(hStack==2) { //H를 두번 만나면 h스택을 초기화 시키고 정답결과 +1, 위쪽 탐색 끝.
						hStack=0;
						AnswerN++;
						break;
					}
				}
			}
			System.out.println("#"+test_case+" "+AnswerN);
			AnswerN=0;
		}
	}
}
