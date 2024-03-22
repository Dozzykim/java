package homework;

import java.util.Scanner;

public class _1355 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();


		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int k = n; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
//             3
//  *** i = 1 / ' ' 0 * 3
//   ** i = 2 / ' ' 1 * 2
//    * i = 3 / ' ' 2 * 1