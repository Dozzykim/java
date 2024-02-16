package Day05.Ex02_Calculator;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.print("a: ");
		int a = input.nextInt();
		System.out.print("b: ");
		int b = input.nextInt();
		
		System.out.print("x: ");
		double x = input.nextDouble();
		System.out.print("y: ");
		double y = input.nextDouble();
		
		//덧셈 메소드 호출
		int result1 = cal.plus(a, b);
		System.out.println("a + b = " + result1);
		
		//뺄셈 메소드 호출
		int result2 = cal.min(a, b);
		System.out.println("a - b = " + result2);
		
		//printf("포맷", 변수): %X.Y(리터럴)
		//X: 양수 / 크기만큼 칸을 지정하고 오른쪽으로 정렬
		//   음수 / 크기만큼 칸을 지정하고 왼쪽으로 정렬
		//Y: 지정한 크기만큼 소수점 아래 자릿수를 표현(반올림)
		//*리터럴: %d 정수, %f 실수, %s 문자열
		
		//곱셈 메소드 호출
		double result3 = cal.multi(a, b);
		System.out.println("a * b = " + result3);
		System.out.printf("a * b = %5.2f \n", result3);
		
		//나눗셈 메소드 호출
		double result4 = cal.div(x, y);
		System.out.println("a / b = " + result4);
		System.out.printf("a / b = %5.2f \n", result4);
		
		//나머지 메소드 호출
		double result5 = cal.remain(x, y);
		System.out.println("a % b = " + result5);
		
		int arr[] = {10, 20, 30, 40, 50};
		System.out.println("합계: " + cal.sum(arr));
		System.out.println("평균: " + cal.avg(arr));
		
		input.close();
		
		
	}
}
