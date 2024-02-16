package Day09.Ex01_Computer;

//부모클래스인 추상클래스의 추상메소드를 구현하지 않으려면,
//해당 클래스도 추상 클래스로 정의해야함.

public abstract class Laptop extends Computer {
	
	@Override
	public void display() {
		System.out.println("Laptop - display");
	}

}
