package _1100;

/*
두 정수를 입력받아 아래와 같이 출력하시오.

*/

import java.util.Scanner;

public class _1116 {
	public static void main(String[] args) {

		//1. 두 정수 입력받기
		
		Scanner input = new Scanner(System.in);		
		int a = input.nextInt();
		int b = input.nextInt();
		
		//2. 사칙연산 결과 구하기
		
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + (a/b));
		
		
		input.close();
	}

}
