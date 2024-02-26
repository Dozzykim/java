package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LottoArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = input.nextInt();
		input.nextLine();

		// N번 반복
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");
			ArrayList<Integer> lottoList = new ArrayList<Integer>();

			// 랜덤 수 6개를 생성 후 배열에 저장
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random() * 45 + 1);

				// 중복제거
				if (lottoList.contains(rand)) {
					j--;
				} else {
					lottoList.add(rand);
				}
			}

			// 해당 i번째 게임의 랜덤 수들을 정렬 - 오름차순
			Collections.sort(lottoList);
			// -- i번째 게임 배열 저장&정렬 끝

			for (Integer j : lottoList) {
				System.out.print(j + " ");
			}
			System.out.println();
			input.close();
		}
	}

}
