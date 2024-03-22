package _06.StaticEx;

public class StudentTest3 {
	
	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNo);  //studentLee인스턴스로 접근해서 시리얼넘버를 가져오는게 아니라 클래스 이름으로 참조하여 가져올수도 있음
		System.out.println(studentLee.stdName + " 학번: " + studentLee.stdId);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNo);
		System.out.println(studentSon.stdName + " 학번: " + studentSon.stdId);
		
	}
}
