package Day11.Ex01_TryCatch;

import java.util.Scanner;

/*
 * 예외처리
 * -IndexOutOfBound
 * :배열이나 문자열의 index를 벗어난 예외
 * 
*/

public class IndexOutOfBound {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("배열 요소의 개수: ");
		int n = input.nextInt();
		int[] arr = new int[n];

		System.out.print("접근할 index: ");
		int index = input.nextInt();

		System.out.print("입력할 값: ");
		int num = input.nextInt();

		
		//예외 메세지: java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 10
		try {
			arr[index] = num;
			System.out.println("arr[" + index + "]: " + arr[index]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("접근할 index의 범위를 초과하였습니다.");
			System.err.println("( 0~" + (n - 1) + " ) 범위를 입력하세요.");
		}

		input.close();
	}

}
