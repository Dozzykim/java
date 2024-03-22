package _06.cooperation;

public class Subway {
	
	String lineNo;
	int passengerCount;
	int money;
	
	public Subway (String lineNo) {
		this.lineNo = lineNo;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo( ) {
		System.out.println(lineNo + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
