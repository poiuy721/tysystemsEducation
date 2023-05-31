package ch18;

import java.io.Serializable;

public class Member implements Serializable{

	private static final long serialVersionUID = 6620578182840526629L;
	private String id;
	private String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+": "+name;
	}
}
