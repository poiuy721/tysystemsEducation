package ch06;

public class Movie {
	String title;
	String category;
	String director;
	int runningTime;
	Actor actor;
	String[] actors;
	Actor[] actorArr;
	
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
	public Movie(String newTitle,String newCategory,String newDirector,int newRunningTime,String[] actors) {
		this(newTitle,newCategory,newDirector,newRunningTime);
		this.actors=actors;
	}
	public Movie(String newTitle,String newCategory,String newDirector,int newRunningTime,Actor[] actorArr) {
		this(newTitle,newCategory,newDirector,newRunningTime);
		this.actorArr=actorArr;
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
		System.out.print("제목="+title);
		System.out.print(" | 분류="+category);
		System.out.print(" | 감독="+director);
		System.out.println(" | 상영시간="+runningTime+"(분)");
		//System.out.println("===actor info===");
		//actor.printInfo();
		System.out.println("---actor info---");
		for(int i=0;i<actorArr.length;i++) {
			System.out.println((i+1)+".이름="+actorArr[i].getName()+" | 성별="+actorArr[i].getSex()+" | 생년월일="+actorArr[i].getBirthdate()+" | 국적="+actorArr[i].getNationality());
		}
	}
}
