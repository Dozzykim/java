package _06.StaticEx;

import java.util.TimeZone;

public class StudentTest1 {
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNo);
		studentLee.serialNo++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNo);
		System.out.println(studentLee.serialNo);
		
	}
}
