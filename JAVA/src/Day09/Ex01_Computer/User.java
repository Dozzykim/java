package Day09.Ex01_Computer;

public class User {
	
	public static void main(String[] args) {
		Computer computer = new Desktop();
//		Computer computer2 = new Laptop();  => Laptop은 추상클래스로 정의되어있으므로 객체로 생성할 수 없다. (추상클래스는 객체로 생성 불가능)
		Computer computer2 = new MacBook();
		Laptop laptop = new MacBook();
		MacBook imac = new MacBook();
		
		computer.on();
		computer.display();
		computer.typing();
		computer.off();
		
		System.out.println("---------------");
		
		computer2.on();
		computer2.display();
		computer2.typing();
		computer2.off();
		
		System.out.println("---------------");
		
		laptop.on();
		laptop.display();
		laptop.typing();
		laptop.off();
		
		System.out.println("---------------");
		
		imac.on();
		imac.display();
		imac.typing();
		imac.off();
		
		
	}

}
