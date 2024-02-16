package Day07.Review;

import java.util.Scanner;

public class Ex06_Matrix {
	
	public static void main(String[] args) {
		//2차원 배열
		
		//양의 정수 M과 N을 입력받아 저장하고, M행 N열의 2차원 배열을 생성한다.
		//각 요소의 값을 입력받고, 그대로 출력하시오.
		
		Scanner input = new Scanner(System.in);
		System.out.print("M: ");
		int m = input.nextInt();
		System.out.print("N: ");
		int n = input.nextInt();
		
		int[][] arr = new int[m][n];
		
		
		//입력
		//2차원 배열은 이중 반복문으로 접근한다.
		//외부 반복문: 반복변수 i -> 행 반복
		//내부 반복문: 반복변수 j -> 열 반복
		//arr.length: 행 갯수
		//arr[i].length: 열 갯수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		
		//foreach로 2차원 배열 출력 (위의 이중 for문과 같은 출력, 다른방식)
		for (int[] row : arr) {
			for (int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
}
