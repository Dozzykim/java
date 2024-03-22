package _05.classpart;

public class StudentTest2 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentName = "김도희";
		System.out.println(student1.studentName);
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.studentName = "이병건";
		System.out.println(student2.studentName);
		System.out.println(student2.getStudentName());
		
	}

}
