package Day05.Ex01_student;

public class Student {

	// 학생의 속성: 이름, 나이, 학번, 전공
	// 학생의 행동: 공부하기, 성적 평균 구하기

	// 변수
	String name;
	int age;
	String stdNo;
	String major;

	// 생성자
	public Student() {
		this("이름없음", 1, "0000", "없음");
	}

	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	// 메소드
	// *공부하기
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		// void: 반환타입 없음 = return 생략가능
	}

	// *성적 평균 구하기
	// 메소드 오버로딩 "메소드 중복정의" 같은이름으로 다른 형태 메소드 만들기
	public double getAvg(int score1, int score2) {
		int sum = score1 + score2;
		double avg = (double) sum / 3;
		
		return avg;
	}
	
	public double getAvg(int score1, int score2, int score3) {
		int sum = score1 + score2 + score3;
		double avg = (double) sum / 3;
		
		return avg;
	}
	
	public double getAvg(int[] scores) {
		// 합계
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}

		// 평균
		double avg = 0.0;
		avg = (double) sum / scores.length;

		return avg;
		
	}
}
