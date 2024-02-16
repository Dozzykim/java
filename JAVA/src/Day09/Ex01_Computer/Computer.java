package Day09.Ex01_Computer;

public abstract class Computer {
	
	//추상 메소드를 정의하려면, abstract 예약어를 선언한 뒤 메소드를 입력.
	//추상 메소드를 정의하려면, 클래스도 추상 클래스로 정의해야함.
	
	public abstract void display();
	abstract public void typing();
	
	public void on() {
		System.out.println("전원 ON");
	}
	
	public void off() {
		System.out.println("전원 OFF");
	}
	
	
		
}
