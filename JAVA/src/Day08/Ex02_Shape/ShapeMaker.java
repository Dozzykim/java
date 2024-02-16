package Day08.Ex02_Shape;

import java.util.Scanner;

public class ShapeMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 입력변수
		double width = 0.0;
		double height = 0.0;
		double r = 0.0;

		// 입력받은 도형 배열
		Shape[] shapeList = new Shape[3];
		int index = 0;

		while (index < 3) {
			System.out.println(" 1. 삼각형, 2. 사각형, 3. 원형");
			String user = input.next(); // next(); -> String(문자열)

			if (user.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			// 선택한 도형별로 로직 만들기
			switch (user) {
			case "1":
				System.out.print("가로: ");
				width = input.nextDouble();
				System.out.print("세로: ");
				height = input.nextDouble();

				shapeList[index++] = new Triangle(width, height);
				break;

			case "2":
				System.out.print("가로: ");
				width = input.nextDouble();
				System.out.print("세로: ");
				height = input.nextDouble();

				shapeList[index++] = new Rectangle(width, height);
				break;

			case "3":
				System.out.print("반지름: ");
				r = input.nextDouble();

				shapeList[index++] = new Circle(r);
				break;
			} //switch 끝
			
		} //while 끝
		
		//넓이 총합, 둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;
		
		for (Shape shape : shapeList) {
			if (shape == null) {
				continue;
			}
			
			//instanceof: 인스턴스를 비교하는 연산
			//-같으면 true, 아니면 false를 반환.
			if (shape instanceof Triangle) {
				System.out.println("삼각형");
			}
			if (shape instanceof Rectangle) {
				System.out.println("사각형");
			}
			if (shape instanceof Circle) {
				System.out.println("원형");
			}
			
			//넓이와 둘레
			double area = shape.area();
			double round = shape.round();
			
			//합계
			areaSum += area;
			roundSum += round;
			
			System.out.print("넓이: " + area + "\t");
			System.out.print("둘레: " + round + "\t");
			System.out.println();
		} //foreach 끝
		
		System.out.println("넓이 총합: " + areaSum);
		System.out.println("둘레 총합: " + roundSum);
		input.close();
	}
}
