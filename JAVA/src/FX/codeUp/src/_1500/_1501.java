package _1500;

import java.util.Scanner;

public class _1501 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr [][] = new int [n][n];
		int a=1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
		
	}

}
