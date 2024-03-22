package _05.test;

import _05.hiding.Student;

public class StudentTest {
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		
//		studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
