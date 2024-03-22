package _05.classpart;

//Student 클래스
public class Student {
	
	//멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "김도희";
		
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}
}
