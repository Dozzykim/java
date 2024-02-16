package Day02;

import java.util.Scanner;

public class Ex09_InputOperator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = input.nextInt();
		
		System.out.print("y: ");
		int y = input.nextInt();
		
		System.out.print("z: ");
		int z = input.nextInt();
		
		
		//합계, 평균
		int sum = x + y + z;
		double avg = sum / 3;  //int는 정수형으로, 소수부분을 날려버림. => 강제 형변환 필요.
		
		//큰 자료형 + 작은 자료형 = 큰자료형 => 서로다른 자료형 연산 시, 결과는 큰 자료형으로 자동 형변환.
		
		
		//강제 형변환: (변환할 자료형)변수
		double realAvg1 = (double)sum / 3;
		double realAvg2 = sum / 3.0;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("평균1: " + realAvg1);
		System.out.println("평균2: " + realAvg2);
		
		input.close();
	}
}
