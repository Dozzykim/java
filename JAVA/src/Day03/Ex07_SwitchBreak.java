package Day03;

import java.util.Scanner;

public class Ex07_SwitchBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("정수 입력: ");

		int num = input.nextInt();

		switch (num % 5) {

		case 0:
			System.out.println("*");
			break;

		case 1:
			System.out.println("*");
			break;

		default:
			System.out.println("**");
			break;
		}

		input.close();
	}
}
