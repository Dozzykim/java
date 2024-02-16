package Day03;

import java.util.Scanner;

public class Ex15_Continue {

	public static void main(String[] args) {
		// 5개의 정수를 입력받아, 양수만 합계를 구하여 출력하시오.

		Scanner input = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();

			if (num < 0) {
				continue;
				//continue: 남은 실행문을 무시하고, 다음 반복으로 점프
			}
			sum += num;
		}

		System.out.println("양수의 합: " + sum);

		input.close();
	}
}
