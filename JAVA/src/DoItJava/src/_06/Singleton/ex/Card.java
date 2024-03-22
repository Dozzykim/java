package _06.Singleton.ex;

public class Card {
	
	private static int serialNo = 10000;
	private int cardNo;
	
	public Card() {
		serialNo++;
		cardNo = serialNo;
	}
	
	public int getCardNo() {
		return this.cardNo;
	}
	
	public void showInfo() {
		System.out.println("카드 번호: " + cardNo);
	}

}
