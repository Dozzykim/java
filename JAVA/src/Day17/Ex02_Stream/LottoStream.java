package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoStream {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = input.nextInt();
		input.nextLine();

		// N번 반복
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i + 1) + " 게임] : ");
			List<Integer> lottoList = new ArrayList<Integer>();

			// 랜덤 수 6개를 생성 후 배열에 저장
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < 6; j++) {
				int rand = (int) (Math.random() * 45 + 1);

				// 중복제거
				// set.add(): 중복아니면 true, 중복이면 false
				if (!set.add(rand)) {
					j--;
				}
			}

			// 해당 i번째 게임의 랜덤 수들을 정렬 - 오름차순
			// 스트림을 사용하여, Set을 ArrayList로 변환하여 대입
			lottoList = set.stream().collect(Collectors.toList());

			// 스트림을 사용하여, 정렬 + 출력
			lottoList.stream().sorted().forEach(lotto -> System.out.print(lotto + " "));
			// -- i번째 게임 배열 저장&정렬&출력 끝
			System.out.println();
		}
		
		input.close();
	}
}
