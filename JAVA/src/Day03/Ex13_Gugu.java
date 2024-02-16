package Day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("원하는 단 수를 입력하세요: ");
		int a = input.nextInt();

		for (int i = 1; i <= 9; i++) {
			int result = a*i;
			System.out.println(a + " * " + i + " = " + result);
		}

		input.close();
	}
}
