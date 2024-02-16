package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Student extends Person{

	//생성자
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	public void defaultSetting() {
		name = "이름없음";
		age = 20;  // => protected 접근제어자는 같은 패키지 or 상속받은 경우 접근 가능.
//		height = 150; => default 접근제어자는 같은패키지 내에서만 접근 가능.
//		weight = 40; => private 접근제어자는 같은 클래스 내에서만 접근 가능.
		setHeight(150);
		setWeight(40);
	}
	

}
