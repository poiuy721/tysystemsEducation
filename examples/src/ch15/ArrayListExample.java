package ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Board> list=new ArrayList<>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		System.out.println("총 객체 수: "+list.size());
		
		Board b=list.get(2);
		System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			Board bo=list.get(i);
			System.out.println(bo.getSubject()+"\t"+bo.getContent()+"\t"+bo.getWriter());
			
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		
		for(Board bo:list) {
			System.out.println(bo.getSubject()+"\t"+bo.getContent()+"\t"+bo.getWriter());
		}
	}
}
