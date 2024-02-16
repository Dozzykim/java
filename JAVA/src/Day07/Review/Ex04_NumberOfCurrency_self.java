package Day07.Review;

import java.util.Scanner;

public class Ex04_NumberOfCurrency_self {
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
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		//몇장인지
		int count = 0;
		//화폐단위
		int money = 50000;
		boolean check = true;
		
		while (money >= 1) {
			//몇장인지 체크
			count = input / money;
			//남은 금액 대입
			input -= money * count;
			
			//화폐단위 바꿔주기
			if (check) {
				money /= 5;
			} else {
				money /= 2;
			}
			
			
			
		}
		
		sc.close();
	}

}
