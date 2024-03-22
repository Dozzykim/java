package _1400;

import java.util.Scanner;

public class _1443_Insert {

	public static void main(String[] args) {
		/*
		 * 삽입정렬
		 * 
		 * 두번째 자리부터 시작하는 배열 요소를 key값에 대입한 후,
		 * 앞 요소와 비교하면서 key값이 올바른 위치로 가도록 반복.
		 * 
		 * -key < 앞요소: 기준 자리에 앞 요소 값 대입 후, key와 더 앞에 있는 요소 비교.
		 * -key > 앞 요소: 다음 반복으로 넘기기
		 */		
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		//외부 반복문: 처음요소부터 끝까지 비교하는 반복
		//key값을 외부반복문 안에 쓰는 이유:내부 반복문에서 조건에 걸려 순서가 바뀌면
		//기준이 되는 key값이 내부 반복문 내에 있는 경우, 비교할 key 값이 변동될 수 있어서!
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			for (int j = i-1; j >= 0; j--) {
				if (key < arr[j]) {
					arr[j+1] = arr[j];
					arr[j] = key;
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
