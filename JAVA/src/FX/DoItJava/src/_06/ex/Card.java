package _06.ex;

public class Card {

	private static int serialNo = 1000;
	private int cardNo;
	
	public Card () {
		serialNo ++;
		cardNo = serialNo;
	}
	
	public int getCardNo() {
		System.out.println(cardNo);
		return cardNo;
	}
}
