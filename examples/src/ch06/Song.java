package ch06;

public class Song {
	private String title;
	private Singer singer;
	private String album;
	private String composer;
	private String lyricist;
	private String releaseDate;
	
	public Song(String title,Singer singer,String album,String composer,String lyricist,String releaseDate) {
		this.title=title;
		this.singer=singer;
		this.album=album;
		this.composer=composer;
		this.lyricist=lyricist;
		this.releaseDate=releaseDate;
	}
	
	public void printInfo() {
		System.out.println("제목="+title);
		System.out.println("앨범="+album);
		System.out.println("작곡="+composer);
		System.out.println("작사="+lyricist);
		System.out.println("발매일="+releaseDate);
		System.out.println("--singer info--");
		singer.printInfo();
	}
}
