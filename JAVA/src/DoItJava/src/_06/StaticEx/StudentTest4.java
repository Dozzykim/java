package _06.StaticEx;

public class StudentTest4 {
	
	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
//		System.out.println(Student2.serialNo); serialNo 변수를 private으로 지정하여, 접근 불가!
		System.out.println(Student2.getSerialNo());
		System.out.println(studentLee.stdName + " 학번: " + studentLee.stdId);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNo());
//		System.out.println(Student2.serialNo); serialNo 변수를 private으로 지정하여, 접근 불가!
		System.out.println(studentSon.stdName + " 학번: " + studentSon.stdId);
		
	}
}
