package _1400;

import java.util.Scanner;

public class Select {

	/*
	 * -선택정렬- (앞 뒤 2개의 변수를 비교하여 교환하는 방식)
	 * 
	 * 5명의 수학 성적을 입력받아 배열에 저장하고, 이를 Select Sort를 이용하여 오름차순으로 정렬하기.
	 * 
	 * 1. 5명의 수학성적을 받아 배열에 저장하기 2.
	 */

	public static void main(String[] args) {

		// 수학 성적 5개 입력받을 배열 선언
		Scanner input = new Scanner(System.in);
		int[] scores = new int[5];

		// 순서변경할 때 값을 임시로 저장할 변수 선언
		int temp;

		// 수학 성적 5개 입력받기
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}

		// 내부 반복문: 앞,뒤 요소를 비교하여 자리를 바꾸는 반복문
		// 외부 반복문: 모든 요소를 비교해야하므로, 앞뒤 요소 비교를 마지막요소까지 하도록
		// 배열 길이만큼 반복
		for (int i = 0; i < scores.length-1; i++) {
			for (int j = 1; j < scores.length; j++) {
				if (scores[j - 1] > scores[j]) {
					temp = scores[j - 1];
					scores[j - 1] = scores[j];
					scores[j] = temp;
				} else {
					continue;
				}
			}
		}

		//배열 요소 프린트
		for (int i : scores) {
			System.out.print(i + " ");
		}

		input.close();
	}

}
