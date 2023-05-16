package ch06;

public class Movie {
	String title;
	String category;
	String director;
	int runningTime;
	
	public Movie() {
		System.out.println("Movie()");
	}
	public Movie(String newTitle,String newCategory,String newDirector,int newRunningTime) {
		System.out.println("Movie(String newTitle,String newCategory,String newDirector,String newRunningTime)");
		title=newTitle;
		category=newCategory;
		director=newDirector;
		runningTime=newRunningTime;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getCategory() {
		return this.category;
	}
	public void setDirector(String director) {
		this.director=director;
	}
	public String getDirector() {
		return this.director;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime=runningTime;
	}
	public int getRunningTime() {
		return this.runningTime;
	}
}
