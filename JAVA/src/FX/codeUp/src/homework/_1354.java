package homework;

import java.util.Scanner;

public class _1354 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("별 피라미드 층 수: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}

}



//num = 4
//****      i=1 j=4,3,2,1,
//***       i=2 j=4,3,2
//**        
//*         
