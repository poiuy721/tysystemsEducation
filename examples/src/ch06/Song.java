package ch06;

public class Song {
	private String title;
	private Singer classSinger;
	private String singer;
	private String album;
	public String getTitle() {
		return title;
	}

	public Singer getClassSinger() {
		return classSinger;
	}

	public String getSinger() {
		return singer;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public String getLyricist() {
		return lyricist;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	private String composer;
	private String lyricist;
	private String releaseDate;
	
	public Song(String title,Singer singer,String album,String composer,String lyricist,String releaseDate) {
		this.title=title;
		this.classSinger=singer;
		this.album=album;
		this.composer=composer;
		this.lyricist=lyricist;
		this.releaseDate=releaseDate;
	}
	
	public Song(String title, String singer, String album, String composer, String lyricist, String releaseDate) {
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
		classSinger.printInfo();
	}
}
