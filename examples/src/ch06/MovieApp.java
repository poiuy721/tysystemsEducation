package ch06;

public class MovieApp {

	public static void main(String[] args) {

		System.out.println("===== Creation =====");
		Movie movie = new Movie();

		System.out.println("\n===== Field =====");
		movie.title = "탑건:매버릭";
		System.out.println(movie.title);

		movie.category = "액션";
		System.out.println(movie.category);

		movie.director = "조셉 코신스키";
		System.out.println(movie.director);

		movie.runningTime = 132;
		System.out.println(movie.runningTime);
		
		System.out.println("\n===== Object 2 =====");
		Movie movie2 = new Movie("아바타:물의 길","SF","제임스 카메론",192);
		System.out.println(movie2.title);
		System.out.println(movie2.category);
		System.out.println(movie2.director);
		System.out.println(movie2.runningTime);
	}

}
