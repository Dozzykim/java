package _1100;

import java.util.Scanner;

public class _1158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if ((30 <= n && n <= 40) || (60 <= n && n <=70)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		
		input.close();
	}
}
