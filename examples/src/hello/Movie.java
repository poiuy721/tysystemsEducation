package hello;

public class Movie {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	
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
