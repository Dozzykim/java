package Day07.Review;

import java.util.Scanner;

public class Ex01_Multiple {
	
	public static void main(String[] args) {
		//정수 하나를 입력받아, 3의 배수인지 판단하는 프로그램을 작성
		//3의 배수 o : "3의 배수입니다."
		//3의 배수 x : "3의 배수가 아닙니다."
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요: ");
		int n = input.nextInt();
		
		if (n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		input.close();
	}

}
