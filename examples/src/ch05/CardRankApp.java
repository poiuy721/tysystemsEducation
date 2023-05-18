package ch05;

public class CardRankApp {
	public static void main(String[] args) {
		String[] cardRanks= {"1","2","3","4","5","6","7","8","9","Jack","Queen","King"};
		System.out.println("==card ranks==");
		for(int i=0;i<cardRanks.length;i++)
			System.out.println("cardRanks["+i+"] "+cardRanks[i]);
	}
}
