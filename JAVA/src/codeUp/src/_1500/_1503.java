package _1500;

import java.util.Scanner;

public class _1503 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int arr[][] = new int[n][n];
		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			// 정방향 저장
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a++;
				}
			}
			// 역방향 저장
			else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					arr[i][j] = a++;
				}
			}
		}
		// 배열 프린트
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		input.close();
	}
}
