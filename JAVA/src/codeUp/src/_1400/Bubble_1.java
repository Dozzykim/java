package _1400;

import java.util.Scanner;

public class Bubble_1 {
	
	/* - 버블정렬
	 * 5개의 임의의 정수 데이터를 입력받아 배열에 저장한 후,
	 * 저장된 자료를 오름차순으로 정렬
	 * 
	*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 5-i; j++) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				} else {
					continue;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		input.close();
	}

}
