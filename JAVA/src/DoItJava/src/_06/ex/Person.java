package _06.ex;

public class Person {
	
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeCoffe(Cafe cafe) {
		System.out.println("아메리카노를 마셨습니다.");
		cafe.take(4000);
		this.money -= 4000;
	}
	
	public void takeLatte(Cafe cafe) {
		System.out.println("라떼를 마셨습니다.");
		cafe.take(4500);
		this.money -= 4500;
	}
	
		public void showInfo( ) {
			System.out.println(this.name + "님의 잔액은 " + money + "입니다.");
		}

}
