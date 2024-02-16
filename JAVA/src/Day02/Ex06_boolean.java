package Day02;

import java.util.Scanner;

public class Ex06_boolean {

	public static void main(String[] args) {
		
		//boolean: 참, 거짓 논리값만 가지는 자료형
//		boolean check1 = false;
//		boolean check2 = true;
		
		Scanner input = new Scanner(System.in);
		boolean on = input.nextBoolean();
		
		System.out.println("on: " + on);
		
		if (on) {
			System.out.println("전원 ON");
		}
		else {
			System.out.println("전원 OFF");
		}
		
		input.close();
		
	}
}
