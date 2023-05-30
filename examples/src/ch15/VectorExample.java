package ch15;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> l=new Vector<>();
		Thread tA=new Thread() {
			public void run() {
				for(int i=1;i<=1000;i++)
					l.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
		};
		Thread tB=new Thread() {
			public void run() {
				for(int i=1001;i<=2000;i++)
					l.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
			}
		};
		
		tA.start();
		tB.start();
		
		try {
			tA.join();
			tB.join();
		}catch(Exception e) {}
		System.out.println("총 객체 수: "+l.size());
	}
}
