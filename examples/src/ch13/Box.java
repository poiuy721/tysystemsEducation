package ch13;

public class Box<T> {
	public T data;
	
	public Box() {}
	public Box(T data) {
		this.data=data;
	}
	
	public void setData(T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	public boolean compare(Box<T> other) {
		return data.equals(other.data);
	}
}
