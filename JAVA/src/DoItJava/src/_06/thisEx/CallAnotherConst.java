package _06.thisEx;

class Person {

	String name;
	int age;

	public Person() {
		this("이름없음", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person retunItSelf() {
		return this;
	}

}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.retunItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
