package Day02;

import java.util.Scanner;

public class Ex08_Circle {

	public static void main(String[] args) {
		// 상수: 프로그램 실행동안 값을 변경하지 않고 사용할 값
		// 상수는 선언 시에 반드시 값을 초기화해야함.
		// 선언 후 값을 변경하면 에러 발생.
		// 키워드: final
		
		final double PI = 3.141592;
		//PI = 3.14; (주석 풀면 에러발생 => 선언 후에 값을 변경하려 했으므로.)
		
		Scanner input = new Scanner(System.in);
		
		//원의 넓이 = 반지름^2 * 원주율(PI)
		
		System.out.print("반지름: ");
		double r = input.nextDouble();
		double area = PI * r * r ;
		
		System.out.println("원의 넓이: " + area);
		
		input.close();
	}
}
