package homework.bookJava;

public class Ch4_ex2 {
	
	public static void main(String[] args) {
		int dan;
		int multi;

		for (dan = 2; dan <= 9; dan++) {
			if (dan % 2 != 0) {
				continue;
			}
			for (multi = 1; multi <= 9; multi++) {
				System.out.println(dan + " * " + multi + " = " + (dan*multi));
			}
		}

	}
	
}
