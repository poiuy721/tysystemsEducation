package ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set=new HashSet<Member>();
		
		set.add(new Member("홍",30));
		set.add(new Member("홍",30));
		
		System.out.println(set.size());
	}
}
