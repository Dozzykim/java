package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력하시오.

		Scanner input = new Scanner(System.in);

		System.out.print("성적을 입력하세요: ");
		int score = input.nextInt();
		char grade;

//if 단독사용
//		
//		if (score >= 90 && score <= 100)
//			grade = 'A';
//		if (score >= 80 && score < 90)
//			grade = 'B';
//		if (score >= 70 && score < 80)
//			grade = 'C';
//		if (score >= 60 && score < 70)
//			grade = 'D';
//		if (score < 60 && score >= 0)
//			grade = 'F';
//		
//		System.out.println("학점: " + grade);
// 독립된 조건문이라서 주석풀면 오류남; else가 없어서, if조건의 예외 경우엔 grade에 초기화가 되지않아서! => 해결방법: grade선언시 값 아무거나 초기화 해주기.

		
		//if ~ else if 사용
		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("학점: " + grade);
		
		input.close();
	}

	
}
