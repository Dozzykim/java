package _1500;

import java.util.Scanner;

public class _1508 {

	public static void main(String[] args) {
		
		/*
		 순서도
		 1. 정수 N을 입력받는다.
		 2. N행의 2차원 배열을 생성한다.
		 3. N번 반복하여, 정수 N개를 입력받고, 모든행의 첫열에 그 값을 순서대로 각각 고정한다.
		 4. 배열을 아래의 반복변수 i,j 로 반복한다. (1부터 시작하는 이유: 0번째, 값은 고정되어있으므로!!!)
		  i: 1 ~ (N-1)
		  j: 1 ~ i
		  arr[i][j] = arr[i][j-1] - arr[i-1][j-1] 수식으로 연산하여 빈칸에 대입.
		 5.배열을 반복하여, 값이 있는 부분만 출력한다. 
		 */
		
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int arr[][] = new int[n][];

		// 행마다 열이 1개씩 추가되는 반복문 작성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			// 첫열은 입력받은 값으로 고정
			arr[i][0] = input.nextInt();
		}
		
		// 고정이외에 나머지 칸에 계산하여 대입
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = arr[i][j - 1] - arr[i - 1][j - 1];
			}
		}
		
		
		//배열 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
