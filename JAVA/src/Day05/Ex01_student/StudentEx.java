package Day05.Ex01_student;

public class StudentEx {
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.name = "홍길동";
		student.age = 100;
		student.stdNo = "T100200";
		student.major = "경찰행정학";
		
		int scores [] = {100, 80, 90, 50,75};
		int scores2 [] = {55, 80, 60, 35, 90};
		
		System.out.println("----- 학생1 -----");
		System.out.println("학생1");
		System.out.println("   -이름: " + student.name);
		System.out.println("   -나이: " + student.age);
		System.out.println("   -학번: " + student.stdNo);
		System.out.println("   -전공: " + student.major);
		student.study("    자바 프로그래밍");
		System.out.println("    중간고사 점수: " + student.getAvg(100, 90));
		System.out.println("    중간고사 점수: " + student.getAvg(100, 85, 70));
		System.out.println("    최종 점수   : " + student.getAvg(scores));
		System.out.println();
		
		Student student2 = new Student("김도희", 28, "1678002", "스페인 중남미학");
		System.out.println("----- 학생2 -----");
		System.out.println("학생2");
		System.out.println("   -이름: " + student2.name);
		System.out.println("   -나이: " + student2.age);
		System.out.println("   -학번: " + student2.stdNo);
		System.out.println("   -전공: " + student2.major);
		student.study("    초급 스페인어1");
		System.out.println("    중간고사 점수: " + student2.getAvg(100, 90));
		System.out.println("    중간고사 점수: " + student2.getAvg(100, 85, 70));
		System.out.println("    최종 점수   : " + student2.getAvg(scores2));
		System.out.println();
		
		System.out.println();
		
		
		
	}

}
