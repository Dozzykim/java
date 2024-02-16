package Day03;

public class Ex14_GuguAll2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.print(j + " * " + i + " = " + result);
				System.out.print("\t");
			}
			System.out.println();
		}

	}
}
