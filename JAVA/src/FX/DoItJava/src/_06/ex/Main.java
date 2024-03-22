package _06.ex;

public class Main {

	public static void main(String[] args) {
		
		Person kim = new Person("김씨", 10000);
		Person lee = new Person("이씨", 20000);
		
		Cafe starbucks = new Cafe("Starbucks");
		Cafe kong = new Cafe("Kong");
		
		kim.takeCoffe(starbucks);
		lee.takeLatte(kong);
		
		kim.showInfo();
		lee.showInfo();
		starbucks.showInfo();
		kong.showInfo();
	}


}
