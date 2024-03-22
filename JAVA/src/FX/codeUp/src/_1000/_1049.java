package _1000;

import java.util.Scanner;

public class _1049 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
//		
//		if (a > b) {
//			System.out.println(1);
//		} else {
//			System.out.println(0);
//		}
		
		//삼항연산자 풀이
		
		System.out.println((a>b)? 1 : 0);
		
	}

}
