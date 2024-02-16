package Day08.Ex03_Interface;

public class RcCar implements RemoteControl {
	
	int speed;
	boolean check = false;

	@Override
	public void trunOn() {
		System.out.println("RC카 전원: ON");
	}

	@Override
	public void trunOff() {
		System.out.println("RC카 전원: OFF");
		
	}

	@Override
	public void setSpeed(int speed) {
		if (speed > RemoteControl.MAX_SPEED) {
			this.speed = MAX_SPEED;
			System.out.println("최고 속력은 300이며, 이 이상으로 높일 수 없습니다.");
		} else if (speed < RemoteControl.MIN_SPEED) {
			this.speed = MIN_SPEED;
			System.out.println("최저 속력은 0이며, 이 이하으로 낮출 수 없습니다.");
		} else {
			this.speed = speed;
		}
		System.out.println("현재 속도: " + this.speed);
		
	}
	
}
