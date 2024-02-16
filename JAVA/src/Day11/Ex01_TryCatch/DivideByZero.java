package Day11.Ex01_TryCatch;

import java.util.Scanner;

/*
 * 예외처리
 * -ArithmeticException
 * :산술 연산 예외 => 0이 아닌 어떤 수 n을 0으로 나누는 경우 수학적 정의 불가(n / 0)
*/

public class DivideByZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a; // 피제수 - 나누어지는 수
		int b; // 제수 - 나누는 수

		System.out.print("a: ");
		a = input.nextInt();

		System.out.print("b: ");
		b = input.nextInt();

		// 예외 메세지 : java.lang.ArithmeticException: / by zero
		// 예외 처리 : try ~ catch
		try {
			// 예외 발생 가능성이 있는 문장 ↓
			System.out.println("a / b = " + (a / b));
		}
		
		// catch (예외타입 객체) { }
		// * 예외타입 Exception: 최상위 예외 클래스 => 이걸로 지정하면 모든 예외상황에 대해서도 처리해버림.
		catch (ArithmeticException e) {
			// 예외 발생 시, 실행할 예외 처리 문장
			System.err.println("0으로 나눌 수 없습니다.");
		}
		
		//finally 블록 생략가능
		//예외 발생과 무관하게 실행하는 문장.
		//주로 예외처리와 관련된 문장을 작성(자원 해제 등)
		finally {
			System.out.println("메모리를 해제합니다...");
			input.close();
		}
		System.out.println("프로그램을 종료합니다...");
	}
}
