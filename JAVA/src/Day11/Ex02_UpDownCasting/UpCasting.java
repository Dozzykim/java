package Day11.Ex02_UpDownCasting;

public class UpCasting {

	public static void main(String[] args) {

		// 업캐스팅 (자동타입 변환)
		// 부모클래스 = 자식클래스
		Person person = (Person) new Student("김도희", 28, 3, "스페인 중남미학");
		// Person타입의 person 변수는 Student 인스턴스임. 그래서 참조값은 Student를 가리킴.

		// 가지고 있는 변수
		// Person클래스: name, age
		// Student클래스: name, age, grade, major

		System.out.println("name: " + person.name);
		System.out.println("age: " + person.age);

		// Person 객체에서는 grade, major 변수를 접근할 수 없다.
//		System.out.println("grade: " + person.grade);
//		System.out.println("major: " + person.major);

		// 클래스를 업캐스팅 하면,
		// 변수는 부모 클래으세 있는 변수만 접근 가능하고,
		// 메소드는 자식 클래스의 메소득가 우선하여 실행된다.
		System.out.println(person);
		System.out.println(person.work()); // -> 자식클래스에서 오버라이딩된 메소드가 우선되어 실행됨.

		/*
		 * 바인딩(Binding)
		 * : 프로그램에서 사용되는 요소에 실제 값을 결정짓는 행위
		 * 
		 * -정적 바인딩
		 *  :컴파일 시간 내에 결정
		 * 
		 * -동적 바인딩
		 *  :실행 시간내에 결정 (오버라이딩 등)
		 *  
		 */
	}

}
