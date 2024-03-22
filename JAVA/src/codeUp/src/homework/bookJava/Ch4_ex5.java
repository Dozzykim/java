package homework.bookJava;

public class Ch4_ex5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			// 공백
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			// 별표
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 3; i++) {
			// 공백
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// 별표
			for (int j = 5; j >= (2 * i - 1); j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
