package _1400;

import java.util.Scanner;

public class Insert {
	
	/* 삽입정렬
	 * 
	 * 1. 뒤 요소를 key 값에 저장.
	 * 2. 앞 요소를, key 값 저장했던 뒤의 요소자리에 우선 대입.
	 * 3. 앞 요소와, key 값 비교
	 * 3-1. 앞 요소 > key key를 앞 요소 자리에 대입.
	 * (2번에서 이미 큰 수인 앞 요소를 뒤에 대입해두었기에 순서가 바뀜)
	 * 3-2. 앞 요소 < key 탐색한 앞 요소에 +1을 하여 key 값 대입
	 * (바꿀필요 없었으니 다시 올바르게 제자리로 정렬)
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		int key;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		
		//앞과 뒤를 비교 후, 앞이 더 크면 더 앞 요소를 비교.
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			for (int j = i-1; j>=0; j--) {
				if (key < arr[j]) {
					arr[j+1] = arr[j];
					arr[j] = key;
				} else {
					break;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		input.close();
	}
}
