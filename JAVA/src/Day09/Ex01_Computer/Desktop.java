package Day09.Ex01_Computer;

public class Desktop extends Computer {
	
	//부모클래스의 추상메소드는 반드시 오버라이딩 해야함.

	@Override
	public void display() {
		System.out.println("Desktop - display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop - typing...");
	}

}
