package Day02;

import java.util.Scanner;

public class Ex07_Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("삼각형의 넓이");
		System.out.print("밑변: ");
		double width = input.nextDouble();
			
		System.out.print("높이: ");
		double height = input.nextDouble();
		
		double area = width * height / 2;
		System.out.println("넓이: " + area);
		
		input.close();
	}
}
