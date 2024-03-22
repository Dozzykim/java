package _06.cooperation;

public class Bus {
	
	int busNo;
	int passengerCount;
	int money;
	
	//버스 번호를 매개변수로 받는 생성자
	public Bus(int busNo) {
		this.busNo = busNo;
	}
	
	//승객이 버스에 탄 경우를 구현한 메소드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	//버스의 정보를 출력하는 메소드
	public void showInfo( ) {
		System.out.println("버스 " + busNo + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
