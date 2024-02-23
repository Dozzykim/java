package Day14.Ex02_WildCard;

public class Person {
	
	private String name;

	//생성자 Person객체 생성 시, 이름 꼭 매개변수로 넣어줘야함!!!!!!!!!!!!!!!!!!!!!!!!!! (기본생성자가 없으니..)
	public Person(String name) {
		this.name = name;
	}

	//getter, setter...
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//toString()
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
