package Day04;

import java.util.Scanner;

public class Ex02_Min {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 출력하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)
		// 최댓값: 100

		/*
		 * (순서도) 
		 * 1. 정수 하나를 입력받기.
		 * 2. 입력받은 정수를 변수 N에 대입.
		 * 3. N번 반복해 N개의 정수를 입력받기.
		 * 4. 입력받은 N개의 정수를 배열 arr에 저장.
		 * 5. 배열 arr을 반복하여, 최댓값 변수 max와 i번째 배열요소를 비교.
		 * 6. 두 요소 중 더 큰 요소를 max에 대입.
		 * 7. 반복 종료 후, 변수 max를 출력.
		 */

//	    1. 정수 하나를 입력받기.
//		2. 입력받은 정수를 변수 N에 대입.
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int N = input.nextInt();
		int arr[] = new int[N];

		// 최솟값 선언
		int min = Integer.MAX_VALUE;

//		3. N번 반복해 N개의 정수를 입력받기.
//		4. 입력받은 N개의 정수를 배열 arr에 저장.
		
		//  i = 0,1,2,3,4
		System.out.print("배열요소" + N + "개의 정수를 입력하세요: ");
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
//			5. 배열 arr을 반복하여, 최댓값 변수 max와 i번째 배열요소를 비교.
//			6. 두 요소 중 더 큰 요소를 max에 대입.
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		// 다른방법 -> int가 표현하는 가장 작은 정수를 변수에 담기
//		int max = Integer.MAX_VALUE;


//		7. 반복 종료 후, 변수 max를 출력.
		System.out.println("입력한 배열 요소 중 최솟값은: " + min);
		
		input.close();
		
	}
}
