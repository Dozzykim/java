package Day08.Ex03_Interface;

public class RemoteControlEx {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스 객체를 만드는 법
		// - 인터페이스타입 객체명 = new 구현클래스;
		
		RemoteControl carRc = new RcCar();
		carRc.trunOn();
		
		//default 메소드는 구현하지않아도 (오버라이딩) 바로 호출 가능
		carRc.parking(false);
		
		carRc.setSpeed(20);
		carRc.parking(true);
		carRc.trunOff();
		System.out.println();
		
		//static 메소드는 객체 생성 없이도 바로 호출 가능...
		RemoteControl.changeBattery();
		System.out.println();
		
		System.out.println("--------------------------");
		
		
		//드론
		RemoteControl droneRC = new Drone();
		droneRC.trunOn();
		droneRC.parking(false);
		droneRC.setSpeed(15);
		droneRC.parking(true);
		droneRC.trunOff();
		System.out.println();
	}
}
