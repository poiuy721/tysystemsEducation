package ch06;

public class Movie {
	String title;
	String category;
	String director;
	int runningTime;
	Actor actor;
	
	public Movie() {
	}
	public Movie(String title) {
		this(title,null,null,0);
	}
	public Movie(String title,String category) {
		this(title,category,null,0);
	}
	public Movie(String title,String category,String director) {
		this(title,category,director,0);
	}
	public Movie(String newTitle,String newCategory,String newDirector,int newRunningTime) {
		title=newTitle;
		category=newCategory;
		director=newDirector;
		runningTime=newRunningTime;
	}
	public Movie(String newTitle,String newCategory,String newDirector,int newRunningTime,Actor actor) {
		this(newTitle,newCategory,newDirector,newRunningTime);
		this.actor=actor;
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
	public void printInfo() {
		System.out.println("===Movie Info ===");
		System.out.println("제목="+title);
		System.out.println("카테고리="+category);
		System.out.println("감독="+director);
		System.out.println("상영시간="+runningTime);
		System.out.println("===actor info===");
		actor.printInfo();
		System.out.println();
	}
}
