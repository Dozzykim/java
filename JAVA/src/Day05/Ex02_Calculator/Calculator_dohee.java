package Day05.Ex02_Calculator;

import java.util.Scanner;

public class Calculator_dohee {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner input = new Scanner(System.in);




		do {
			int n;
			int sum = 0;
			int count = 0;
			double avg;
			
			System.out.println("원하는 계산을 선택하세요");
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5. 나머지 | 6. 합계 | 7. 평균 | 0. 종료");
			
			int user = input.nextInt();
			
			if (user == 0) {
				break;
			}
			
			switch (user) {
			case 1:
				System.out.println("정수 2개를 입력하세요");
				int a = input.nextInt();
				int b = input.nextInt();

				System.out.println("결과: " + a + " + " + b + " = " + cal.plus(a, b));
				break;

			case 2:
				System.out.println("정수 2개를 입력하세요");
				a = input.nextInt();
				b = input.nextInt();

				System.out.println("결과: " + a + " - " + b + " = " + cal.min(a, b));
				break;

			case 3:
				System.out.println("실수 2개를 입력하세요");
				double c = input.nextDouble();
				double d = input.nextDouble();

				System.out.println("결과: " + c + " * " + d + " = " + cal.multi(c, d));
				break;

			case 4:
				System.out.println("실수 2개를 입력하세요");
				c = input.nextDouble();
				d = input.nextDouble();

				System.out.println("결과: " + c + " / " + d + " = " + cal.div(c, d));
				break;

			case 5:
				System.out.println("정수 2개를 입력하세요");
				c = input.nextDouble();
				d = input.nextDouble();

				System.out.println("결과: " + c + " % " + d + " = " + cal.remain(c, d));
				break;

			case 6:
				System.out.print("입력할 정수 개수를 입력하세요. (입력종료: 0): ");
				n = input.nextInt();
				int[] arr = new int[n];
				
				System.out.println("정수를 입력하세요");
				for (int i = 0; i < arr.length; i++) {
					arr[i]= input.nextInt();
					
				}
				System.out.println("입력한 모든 정수의 합계= " + cal.sum(arr));
				break;

			case 7:
				System.out.println("평균을 구할 정수를 입력하세요. (입력종료: 0)");
				while (true) {
					n = input.nextInt();
					if (n == 0) {
						System.out.println("입력을 종료합니다.");
						break;
					}
					sum += n;
					count++;
				}
				avg = (double) sum / count;
				System.out.println("입력한 모든 정수의 평균= " + avg);
				break;
			
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
			System.out.println("-------------------------");
			System.out.println();
		} while (true);
		
		System.out.println("프로그램을 종료합니다.");
		input.close();

	}
}
