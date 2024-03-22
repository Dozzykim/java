package _1100;

import java.util.Scanner;

public class _1156 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("odd");
		} else {
			System.out.println("even");
		}
		
		input.close();
	}
}
