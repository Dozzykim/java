package _05.contstructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		
		//기본 생성자로 클래스 생성한 후, 인스턴스 변수 값을 따로 초기화 하는 방법
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 160;
		personKim.weight = 45;
		
		//인스턴스 변수 초기화와 동시에 클래스 생성
		Person dohee = new Person("김도희", 160, 50);
	}
}
