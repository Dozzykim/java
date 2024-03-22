package _06.Singleton;

public class Company {
	private static Company instance = new Company();
	
	//생성자를 private로 선언하여 외부 클래스에서의 생성을 제어함!!
	private Company () {  }
	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
