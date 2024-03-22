package _1100;

import java.util.Scanner;

public class _1149 {
	public static void main(String[] args) {
	 //두 수 중 큰 수 출력
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		
		input.close();
		
	}
}
