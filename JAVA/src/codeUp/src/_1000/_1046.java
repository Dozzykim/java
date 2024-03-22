package _1000;

import java.util.Scanner;

public class _1046{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		int sum = n1 + n2 + n3;
		float avg = (float)sum / 3;
		
		System.out.println(n1 + n2 + n3);
		System.out.printf("%.1f", avg);
		
		input.close();
		
	}
}
