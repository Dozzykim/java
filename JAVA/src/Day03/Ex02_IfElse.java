package Day03;

import java.util.Scanner;

public class Ex02_IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int num = input.nextInt();

		// 입력받은 값이 홀수인지, 짝수인지 판단하시오.

		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

		input.close();

	}
}
