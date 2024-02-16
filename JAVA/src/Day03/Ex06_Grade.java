package Day03;

import java.util.Scanner;

public class Ex06_Grade {

	public static void main(String[] args) {
		// 학점을 입력받아, 점수대를 출력하시오

		Scanner input = new Scanner(System.in);
		
		System.out.print("학점: ");
		String grade = input.next();
		
		
		switch (grade) {
		case "A":
			System.out.println("90~100점 입니다.");
			break;

		case "B":
			System.out.println("80~89점 입니다.");
			break;
			
		case "C":
			System.out.println("70~79점 입니다.");
			break;
			
		case "D":
			System.out.println("60~69점 입니다.");
			break;
			
		case "F":
			System.out.println("60점 미만 입니다.");
			break;

		default:
			System.out.println("A~F 사이의 문자를 입력해주세요.");
			break;
		}

		input.close();
	}
	
}
