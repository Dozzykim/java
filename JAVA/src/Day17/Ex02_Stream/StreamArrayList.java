package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//getter, setter...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class StreamArrayList {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add( new Person("김조은", 20) );
		list.add( new Person("이조은", 30) );
		list.add( new Person("박조은", 25) );
		list.add( new Person("최조은", 35) );
		list.add( new Person("조은", 28) );
		list.add( new Person("김조", 22) );
		
		// 매핑 - map
		// : 스트림 요소를 사용하려는 형태로 변환하는 연산
		// *이름만 추출하여 반복
		list.stream().map(p -> p.getName() ).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// *나이만 추출하여 반복
		list.stream().map(p -> p.getAge()).forEach(a -> System.out.print(a + " "));
		System.out.println();
	}

}
