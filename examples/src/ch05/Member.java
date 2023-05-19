package ch05;

public class Member {
	private String id;
	private String name;
	private String membership;
	private int point;
	
	public Member(String id, String name, String membership, int point) {
		this.id = id;
		this.name = name;
		this.membership = membership;
		this.point = point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMembership() {
		return membership;
	}

	public int getPoint() {
		return point;
	}
}
