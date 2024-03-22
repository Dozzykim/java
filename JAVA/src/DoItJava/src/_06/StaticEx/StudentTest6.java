package _06.StaticEx;

public class StudentTest6 {
	
	public static void main(String[] args) {
		
		Student3 std1 = new Student3();
		std1.setStudentName("김도희");
		System.out.println(std1.getStudentName() + "의 학번: " + Student3.getSerialNo() + " 카드번호: " + Student3.cardNo);
		
		Student3 std2 = new Student3();
		std2.setStudentName("강하늘");
		System.out.println(std2.getStudentName() + "의 학번: " + Student3.getSerialNo() + " 카드번호: " + Student3.cardNo);
	}
}
