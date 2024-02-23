package Day12.Ex01_Object;

/*
 * Object 클래스의 equals() 메소드 활용
*/

class Student {
	int studentId;
	String studentName;
	
	
	public Student() {
	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	//equals() 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//두 객체가 의미상으로 일치하는지 여부 체크(T/F)
		if (this == obj) {
			return true;
		}
		
		//null체크
		if (obj == null) {
			System.out.println("NullPointerException");
			return false;
		}
		
		//학번과 학생명이 모두 일치하는 경우
		Student student = (Student) obj; //Object라는 최상위 부모클래스로 업캐스팅된 매개변수로 받아왔으므로, 다시 다운캐스팅해주는 과정
		if (this.studentId == student.studentId && this.studentName == student.studentName) {
			return true;
		}
		
		return false;
	}
}

public class ObjectEquals {

	public static void main(String[] args) {
		Student std1 = new Student(1678002, "김도희");
		Student std2 = std1;
		Student std3 = new Student(1678002, "김도희");
		
		
		//학생1과 학생2의 레퍼런스 비교 (참조값 비교)
		if (std1 == std2) {
			System.out.println("std1과 std2의 주소(레퍼런스)가 같습니다.");
		} else {
			System.out.println("std1과 std2의 주소(레퍼런스)가 다릅니다.");
		}
		
		System.out.println("---------------------------");
		
		//학생1과 학생2의 인스턴스 비교
		if (std1.equals(std2)) {
			System.out.println("std1과 std2는 같습니다.");
		} else {
			System.out.println("std1과 std2는 다릅니다.");
		}
		
		System.out.println("---------------------------");
		
		//학생1과 학생3의 레퍼런스 비교
		if (std1 == std3) {
			System.out.println("std1과 std3의 주소(레퍼런스)가 같습니다.");
		} else {
			System.out.println("std1과 std3의 주소(레퍼런스)가 다릅니다.");
		}
		
		System.out.println("---------------------------");
		
		//학생1과 학생3의 인스턴스 비교
		if (std1.equals(std3)) {
			System.out.println("std1과 std3는 같습니다.");
		} else {
			System.out.println("std1과 std3는 다릅니다.");
		}
		
		System.out.println("---------------------------");
		
	}
}
