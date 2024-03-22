package _06.cooperation;

public class Taxi {
	
	int money;
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo( ) {
		System.out.println("택시의 수입은 " + money + "입니다.");
	}

}
