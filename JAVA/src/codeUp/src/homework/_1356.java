package homework;

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 1; i <= n - 2; i++) {
			for (int j = 1; (j == 1); j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= n - 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j == 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		input.close();
	}
}