package _06.ex;

public class Cafe {
	
	String name;
	int money;
	int orderQty;
	
	public Cafe(String name) {
		this.name = name;
	}
	
	
	public void take(int money) {
		this.money += money;
		orderQty++;
	}
	
	public void showInfo( ) {
		System.out.println("카페 " + name + "에서 주문 수는" + orderQty + "개이고, 수입은 " + money + "입니다.");
	}


}
