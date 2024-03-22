package _1100;

import java.util.Scanner;

public class _1157 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		
		if (50 <= a && a <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		
		input.close();
	}

}
