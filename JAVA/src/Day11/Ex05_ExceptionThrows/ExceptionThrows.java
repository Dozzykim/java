package Day11.Ex05_ExceptionThrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			//in()메소드에서 throws를 통해 예외를 전가했으므로,
			//호츨한 곳에서 에외처리를 해야한다.
			in();

		} catch (Exception e) {
			e.printStackTrace();  //오류 내용을 출력
			System.err.println("정수를 입력해주세요");
		}

	}

	// 예외 전가 (=예외 던지기; 예외 떠넘기기) - throws
	// :예외 처리에 대한 책임을 메소드를 호출한 곳으로 떠넘기는 것
	public static void in() throws InputMismatchException {
		System.out.print("입력: ");
		int in = input.nextInt();
		System.out.println(in);
	}
}
