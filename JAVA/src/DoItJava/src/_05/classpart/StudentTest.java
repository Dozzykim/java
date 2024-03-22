package _05.classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentName = "김도희";
		
		System.out.println(studentKim.studentName);
		System.out.println(studentKim.getStudentName());
	}

}
