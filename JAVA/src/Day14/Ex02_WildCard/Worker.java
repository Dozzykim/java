package Day14.Ex02_WildCard;

public class Worker extends Person{

	public Worker(String name) {
		//부모클래스의 생성자를 호출하여 name 초기화
		super(name);
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + this.getName() + "]";
	}

}
