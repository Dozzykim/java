package Day05.Ex02_Calculator;

public class Calculator {

	/*
	 * 계산기 - 피연산자를 2개로 하는 계산기
	 * - 기능
	 * 1. 덧셈 : 정수 2개 덧셈
	 * 2. 뺄셈 : 정수 인자1 - 인자 2 연산을 하는 뺄셈
	 * 3. 곱셈 : 실수 2개 곱셈
	 * 4. 나눗셈 : 실수 인자 1 / 인자2 연산을 하는 나눗셈
	 * 5. 나머지 : 실수 인자 1 % 인자2 연산을 하는 
	 * 나머지 연산
	 * 6. 합계 : 배열을 매개변수로 전달받아, 모든 요소의 합을 구함.
	 * 7. 평균 : 배열을 매개변수로 전달받아, 모든 요소의 평균을 구함.
	 * 
	 * *메소드명 :plus, min, multi, div, remain, sum, avg
	 */

	// 변수

	// 메소드
	//덧셈
	public int plus(int a, int b) {
		return a + b;
	}
	//뺄셈
	public int min(int a, int b) {
		return a - b;
	}
	//곱셈
	public double multi(double a, double b) {
		return a * b;
	}
	//나눗셈
	public double div(double a, double b) {
		return a / b;
	}
	//나머지
	public double remain(double a, double b) {
		return a % b;
	}
	//합계
	public int sum(int[] num) {
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		return sum;
	}
	//평균
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = (double)sum / arr.length;
		
		return avg;
	}

}
