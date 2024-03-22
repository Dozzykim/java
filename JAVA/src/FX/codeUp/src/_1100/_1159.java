package _1100;

import java.util.Scanner;

public class _1159 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if ((50 <= n && n <= 70) || (n % 6 == 0)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		
		input.close();
		
	}
}
