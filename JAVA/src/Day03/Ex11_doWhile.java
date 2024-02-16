package Day03;

import java.util.Scanner;

public class Ex11_doWhile {

	public static void main(String[] args) {
		// 메뉴판
		// 변수 선언: 메뉴 번호, 메뉴 이름
		Scanner input = new Scanner(System.in);

		int menuNo = 0;
		int count = 0;
		String menuName = "";

		// do-while문: 무조건 1회는 실행 후, 조건을 검사하여 반복하는 문장
		// 제어문 시작 ---
		do {
			// 메뉴판 띄워주기
			System.out.println("----------------");
			System.out.println("      메뉴판      ");
			System.out.println("1. 맥도날드");
			System.out.println("2. 법대생 김밥");
			System.out.println("3. 돈까스");
			System.out.println("4. 짜장면");
			System.out.println("5. 물 만난 면");
			System.out.println("0. 종료");
			System.out.print("메뉴번호: ");

			menuNo = input.nextInt();

			// 0번 선택시, 종료 (방법1)
			if (menuNo == 0) {
				break;
				
			}

			// 0번 선택시, 종료 (방법2)
//			if (menuNo == 0) {
//				System.out.println("메뉴판을 종료합니다.");
//				return; //main()메소드 종료시키며, 메모리 공간해제. return값을 메소드 호출했던 자리로 반환시킴.
//			}

			// 메뉴판 선택시, menuName에 해당 메뉴 할당.
			switch (menuNo) {
			case 1:
				menuName = "맥도날드";
				break;
			case 2:
				menuName = "법대생 김밥";
				break;
			case 3:
				menuName = "돈까스";
				break;
			case 4:
				menuName = "짜장면";
				break;
			case 5:
				menuName = "물 만난 면";
				break;
			}

			// 선택한 메뉴 표시 or 잘못된 입력 안내
			if (0 < menuNo && menuNo <= 5) {
				System.out.println(menuName + "(을/를) 주문하였습니다.");
				count++;
			} else {
				System.out.println("(0~5)번 사이의 번호를 입력해주세요.");
			}

			// 종료입력 이외에는 계속 반복되도록.
		} while (menuNo != 0);
		/// 제어문 끝 ----

		System.out.println(count + "개의 매뉴를 주문하였습니다.");
		System.out.println("메뉴판을 종료합니다.");

		input.close();
	}
}
