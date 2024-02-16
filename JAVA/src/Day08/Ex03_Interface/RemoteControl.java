package Day08.Ex03_Interface;

public interface RemoteControl {
	
	//인터페이스: 클래스들이 구현해야할 동작을 상수와 추상메소드로만 정의한 타입
	
	//상수
	//최저,최고 속력 상수를 선언.
	//*인터페이스는 변수 선언시, (public static final)이 자동으로 선언됨 = 생략됨.
	
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	//추상 메소드
	//(public abstract)가 자동으로 선언됨 = 생략됨
	void trunOn();
	void trunOff();
	void setSpeed(int speed);
	
	//디폴트 메소드
	//:인터페이스를 구현한 객체가 따로 오버라이딩하지 않아도 기본으로 사용할 수 있는 메소드
	default void parking(boolean check) {
		if (check) {
			System.out.println("주차되었습니다.");
			setSpeed(MIN_SPEED);
		} else {
			System.out.println("주행모드를 시작합니다.");
			setSpeed(10);
		}
	}
	
	//static 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환하였습니다.");
	}
	
	

}
