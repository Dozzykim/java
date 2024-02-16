package Day11.Ex01_TryCatch;

/*
 * 예외처리
 * -ClassCastException
 * :클래스 간의 타입 변환 시, 올바르지 않는 변환으로 인해 발생하는 예외 상황
 * :부모자식 관계가 없는 클래스 간에 강제로 타입변환 시 발생하는 예외
 * 
 * -> 업캐스팅이 전제되지 않은 다운캐스팅 적용하는 경우.
*/

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}

public class ClassCast {
	// 부모 클래스        자식클래스
	// Animal   <---   Dog, Cat
	
	// Animal = cat 으로 업캐스팅한 후
	// 다시 그 Aminal을 Dog로 다운캐스팅할 수는 없음.
	// = Cat을 Dog로 타입변환할 수 없다.

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeToDog(dog);
		
		Cat cat = new Cat();
		changeToDog(cat);
		
	}
	
	public static void changeToDog(Animal animal) { //매개변수로 받는 과정에서 업캐스팅이 이루어짐 Animal animal = dog;
		//예외 메시지: java.lang.ClassCastException
		try {
			Dog dog = (Dog) animal;
		} catch (Exception e) {
			System.err.println("Cat을 Dog로 변환할 수 없음.");
		}
	}
}
