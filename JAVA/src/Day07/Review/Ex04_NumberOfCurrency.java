package Day07.Review;

import java.util.Scanner;

/*
더조은 아카데미에서 김조은 대리를 출장보낸다.
이 때, 출장비를 다음과 같이 지급한다.
출장비: 537,620원

5만원: 10개.
1만원: 3개.
5천원: 1개
1천원: 2개
5백원: 1개
100원: 1개
50원: 0개
10원: 2개
5원: 0개
1원: 0개

*/

public class Ex04_NumberOfCurrency {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//금액 입력
		System.out.print("금액: ");
		int remain = input.nextInt();
		
		int money = 50000;
		boolean sw = true;
		
		while (money >= 1) {
			//화폐매수 계산
			int count = remain / money;
			System.out.println(money  + " : " + count + " 개");
			
			//잔액 계산
			remain -= money * count;
			
			//화폐단위 변환
			if (sw) {
				money /= 5;
			} else {
				money /= 2;
			}
			sw = !sw;
		}
		
		input.close();
	}
}
