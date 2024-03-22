package _1000;

import java.util.Scanner;

public class _1050 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();

		if (a == b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		input.close();
	}

}
