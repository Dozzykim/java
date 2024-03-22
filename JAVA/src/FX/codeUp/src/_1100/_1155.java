package _1100;

import java.util.Scanner;

public class _1155 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		if (num % 7 == 0) {
			System.out.println("multiple");
		} else {
			System.out.println("not multiple");
		}
		
		input.close();
	}
}
