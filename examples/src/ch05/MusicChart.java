package ch05;

import ch06.Song;

public class MusicChart {
	private Song[] songArr;
	
	public MusicChart(Song[] songArray) {
		songArr=new Song[songArray.length];
		for(int i=0;i<songArray.length;i++) {
			songArr[i]=songArray[i];
		}
	}
	public void printMusicChart() {
		System.out.println("==music chart==");
		for(int i=0;i<songArr.length;i++) {
			System.out.println((i+1)+".");
			System.out.println("제목="+songArr[i].getTitle());
			System.out.println("가수="+songArr[i].getSinger());
			System.out.println("앨범="+songArr[i].getAlbum());
			System.out.println("작곡자="+songArr[i].getComposer());
			System.out.println("작사가="+songArr[i].getLyricist());
			System.out.println("발매일="+songArr[i].getReleaseDate().substring(0, 4)+"."+songArr[i].getReleaseDate().substring(4, 6)+"."+songArr[i].getReleaseDate().substring(6));
		}
	}
}
