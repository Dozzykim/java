package homework;

import java.util.Scanner;

public class _1353 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("별 피라미드 층 수: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}



//*         i = 1 / j = 1
//**        i = 2 ; j = 1,2
//***       i = 3 ; j = 1,2,3
//****      i = 4 ; j = 1,2,3,4