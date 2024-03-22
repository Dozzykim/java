package _1400;

import java.util.Scanner;

public class Bubble_2 {
	
	/* - 버블정렬
	 * 5개의 임의의 정수 데이터를 입력받아 배열에 저장한 후,
	 * 저장된 자료를 오름차순으로 정렬
	 * 
	 * boolean형 변수를 선언하여 불필요한 반복을 줄여줌
	*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		boolean change = true;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = input.nextInt();
		}
		
		//불필요한 반복을 줄이기 위해, 올바른 정렬이 되어있다면,
		//change를 false로 반환하여 반복 멈추도록함.
		for (int i = 0; i < 4; i++) {
			if (change == false) {
				break;
			}
			for (int j = 1; j < 5-i; j++) {
				for (int k : arr) {
					System.out.print(k + " ");
				}
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					change = true;
				} else {
					change = false;
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
