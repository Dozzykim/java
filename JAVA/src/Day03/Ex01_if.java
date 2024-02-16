package Day03;

import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = input.nextInt();
		
		//입력받은 값이 홀수인지, 짝수인지 판단하시오.
		
		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		if (num % 2 != 1) {
			System.out.println("짝수입니다.");
		}
		
		//if문을 각각 독립적으로 사용하면, 판별이 각각들어감.
		
		input.close();
	}
}
