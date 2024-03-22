package _06.cooperation;

public class Student {
	
	public String studentName;  //학생이름
	public int grade;  //학년
	public int money; //가진 돈

	//학생이름과 가진돈을 매개 변수로 받는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//버스를 타면 1000원을 지불하는 기능을 구현한 메소드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	//전철를 타면 1500원을 지불하는 기능을 구현한 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1000;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	//학생의 현재 정보를 출력하는 메서드
	public void showInfo( ) {
		System.out.println(studentName + "님의 잔액은 " + money + "입니다.");
	}
}
