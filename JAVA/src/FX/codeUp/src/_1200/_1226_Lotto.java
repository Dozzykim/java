package _1200;

import java.util.Scanner;

public class _1226_Lotto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] jh = new int[6];
		int check;
		int count = 0;
		int bonus;
		int rank;

		// 로또번호 6개 + 보너스 1개 = 총 7개 입력받기
		for (int i = 0; i < 6; i++) {
			lotto[i] = input.nextInt();
		}
		
		bonus = input.nextInt();

		// 지혜번호 6개 입력받기
		for (int i = 0; i < 6; i++) {
			jh[i] = input.nextInt();
		}
		

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < jh.length; j++) {
				check = lotto[i];
				if (check == jh[j]) {
					count++;
					continue;
				} else {
					continue;
				}
			}
		}
		
		if (count == 6) {
			rank = 1;
		}
		else if (count == 5) {
			rank = 3;
			for (int i = 0; i < jh.length; i++) {
				if (jh[i] == bonus) {
					rank = 2;
					break;
				} else {
					continue;
				}
			}
			
		} else if (count == 4) {
			rank = 4;
		} else if (count == 3) {
			rank = 5;
		} else {
			rank = 0;
		}

		System.out.println(rank);
		input.close();

	}

}
