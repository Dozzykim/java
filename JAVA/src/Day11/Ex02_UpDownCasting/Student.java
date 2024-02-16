package Day11.Ex02_UpDownCasting;

public class Student extends Person {

	int grade;
	String major;

	//생성자메소드에서 매개변수를 4개 받을 수 있는 이유 : 부모클래스에서 이미 name, age변수가 선언되어있어서
	//따로 생성하지 않아도 물려받아 쓸 수 있음.
	
	//생성자
	public Student() {
		this("이름없음", 1, 1, "없음");
	}

	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}

	//부모클래스 메소드 오버라이딩
	@Override
	public String work() {
		return "공부를 합니다.";
	}

	//getter, setter...
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
