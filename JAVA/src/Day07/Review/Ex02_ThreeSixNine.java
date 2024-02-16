package Day07.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수 1~100까지 반복하여 출력하면서,
		// 해당 수가 3 또는 6 또는 9가 될 때,
		// 369의 개수만큼 정수대신 "*"을 출력하는 프로그램 작성

		// 1. 반복문
		// 2. 369가 몇개인지 판단.
		// 3. 그 개수만큼 "*" 출력.
		for (int i = 1; i <= 100; i++) {
			//10의 자리 수 
			int ten = i / 10;
			int one = i % 10;
			
			// ten369를 ten%3==0으로만 두면, 0 % 3 == 0이라 1~9까지 *이 출력됨. 그래서 ten이 0이 아닌 조건을 넣어줘야함.
			boolean ten369 = (ten != 0) && (ten % 3 == 0);
			boolean one369 = (one != 0) && (one % 3 == 0);
			
			
			if (ten369 && one369 ) {
				System.out.println("**");
			} else if (ten369 || one369) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}
				

		}
	}

}
