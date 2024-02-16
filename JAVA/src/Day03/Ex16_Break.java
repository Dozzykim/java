package Day03;

import java.util.Scanner;

public class Ex16_Break {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// while(true): 무한반복 루프 -> 반드시 종료조건 추가해야함.
		while (true) {
			System.out.print("입력: ");
			String str = input.nextLine(); // 문자열 한 줄 입력

			// 문자열.equals("비교문자열") : 문자열의 일치여부 알려주는 메소드
			if (str.equals("STOP")) {
				break;
			}
			System.out.println(">>" + str);

		}
		System.out.println("프로그램을 종료합니다.");

		input.close();
	}
}
