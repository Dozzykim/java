package _06.StaticEx;

public class StudentTest2 {
	
	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNo);
		System.out.println(studentLee.stdName + " 학번: " + studentLee.stdId);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNo);
		System.out.println(studentSon.stdName + " 학번: " + studentSon.stdId);
		
	}
}
