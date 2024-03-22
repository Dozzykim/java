package _1400;

import java.util.Scanner;

public class _1442_Select {
	// 선택정렬. 모든 케이스 다 조사

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} else {
					continue;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
		input.close();
	}
}
