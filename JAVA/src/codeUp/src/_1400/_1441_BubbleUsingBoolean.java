package _1400;

import java.util.Scanner;

public class _1441_BubbleUsingBoolean {

	// 버블정렬 이용하여 문제 풀기
	// 배열길이의 정수를 입력받고
	// 길이의 갯수만큼 요소를 입력받아 오름차순으로 출력

	
	//5번째 테스트에서 오답처리가 나는데,,, 왜그럴까요..ㅠㅠㅠ
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int[] arr = new int[n];
		boolean change = true;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length-1; i++) {
			if (change == false) {
				break;
			}
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					change = true;
				} else {
					change = false;
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
