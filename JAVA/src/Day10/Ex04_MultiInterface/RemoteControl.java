package Day10.Ex04_MultiInterface;

public interface RemoteControl {
	
	//인터페이스: 클래스들이 구현해야할 동작을 상수와 추상메소드로만 정의한 타입
	
	//상수
	//최저,최고 속력 상수를 선언.
	//*인터페이스는 변수 선언시, (public static final)이 자동으로 선언됨 = 생략됨.
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	//(public abstract)가 자동으로 선언됨 = 생략됨
	void trunOn();
	void trunOff();
	void setVolume(int volume);
	void setChannel(int channel);
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정 ON");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("음소거 설정 OFF");
			setVolume(10);
		}
	}
	
	static void changeBattery() {
		System.out.println("배터리를 교환하였습니다.");
	}
}
