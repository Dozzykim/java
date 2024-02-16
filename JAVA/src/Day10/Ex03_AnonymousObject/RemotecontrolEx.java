package Day10.Ex03_AnonymousObject;

import Day08.Ex03_Interface.RemoteControl;

public class RemotecontrolEx {
	
	public static void main(String[] args) {
		//익명 구현 객체: 클래스를 정의하지 않고도, 이름없이 구현한 객체
		//인터페이스 객체명 = new 인터페이스(인자1...) {객체 정의}
		//인터페이스를 구현한 클래스를 생성해야하는데, 클래스를 만들지않고 익명 개체로 만든거임.
		RemoteControl rc = new RemoteControl() {
			
			int speed = 0;
			
			@Override
			public void trunOn() {
				System.out.println("ON");				
			}
			
			@Override
			public void trunOff() {
				System.out.println("OFF");
				
			}
			
			@Override
			public void setSpeed(int speed) {
				this.speed = speed;
				System.out.println("속도: " + this.speed);
			}
		};
		
		rc.trunOn();
		rc.setSpeed(100);
		rc.trunOff();
	}

}
