package Day11.Ex02_UpDownCasting;

public class Person {
	
	String name;
	int age;
	
	
	//생성자
	Person() {
		this("이름없음", 1);
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public String work( ) {
		return "일을 합니다.";
	}

	//getter, setter...
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	

}
