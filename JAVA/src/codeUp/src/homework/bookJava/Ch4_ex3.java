package homework.bookJava;

public class Ch4_ex3 {
	public static void main(String[] args) {
		int dan;
		int multi;

		for (dan = 2; dan <= 9; dan++) {
			for (multi = 1; multi <= 9; multi++) {
				if (multi > dan) {
					break;
				}
				System.out.println(dan + " * " + multi + " = " + (dan * multi));
			}
		}

	}

}
