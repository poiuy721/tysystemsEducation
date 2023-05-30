package ch15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		List<String> l2=new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			l1.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println(endTime-startTime);

		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			l2.add(0,String.valueOf(i));
		}
		endTime=System.nanoTime();
		System.out.println(endTime-startTime);
		
	}
}
