package Day11.Ex01_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외처리
 * -InputMismatchException
 * :입력된 자료형이 입력 메소드( nextInt, nextLine...)와 일치하지않아 발생하는 예외상황
 * 
*/

public class InputMismatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int menuNo = 0;
		String menuName = "";
		
		do {
			System.out.println("1. Java");
			System.out.println("2. Oracle DB");
			System.out.println("3. HTML");
			System.out.println("4. CSS");
			System.out.println("5. JS");
			System.out.println("0. 종료");
			System.out.print("입력: ");
			
			//예외 메시지: java.util.InputMismatchException
			//입력받는 메소드와 입력된 데이터의 타입이 맞지 않는 경우
			try {
				menuNo = input.nextInt();
			}
			catch (InputMismatchException e) {
				input.nextLine();
				System.err.println("( 0 ~ 5 )번 사이의 정수를 입력해주세요.");
				continue;
			}
			
			if (menuNo == 0) {
				break;
			}
			
			switch (menuNo) {
			case 1:
				menuName = "Java";
				break;
				
			case 2:
				menuName = "Oracle DB";
				break;
				
			case 3:
				menuName = "HTML";
				break;
				
			case 4:
				menuName = "CSS";
				break;
				
			case 5:
				menuName = "JS";
				break;
			}
			System.out.println(menuName + "(을/를) 공부합니다.");
			
		} while (true);
		
		input.close();
	}
}
