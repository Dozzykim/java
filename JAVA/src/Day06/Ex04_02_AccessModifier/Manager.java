package Day06.Ex04_02_AccessModifier;

import Day06.Ex04_01_AccessModifier.Person;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name: " + student.name);
		System.out.println("age: " + student.getAge());
		//Manager에서 Student의 default 접근 지정자 변수인 heigth에 접근할 수 없는 이유
		System.out.println("height: " + student.getHeight());
		System.out.println("weight: " + student.getWeight());
		System.out.println();
		
		Person person = new Person("김도희", 28, 160, 130);
		System.out.println("name: " + person.name);
		System.out.println("age: " + person.getAge());
		System.out.println("height: " + person.getHeight());
		System.out.println("weight: " + person.getWeight());
		System.out.println();
	}

}
