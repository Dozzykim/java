package Day12.Ex04_Util;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerSum {
	
	// "1,2,3,4,5"
	// "," --분리--> (String) 1 2 3 4 5
	//토큰을 (int) 타입으로 변환하여 합계 구하기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("정수를 ,로 구분하여 여러개 입력하시오: ");
		String str = input.nextLine();
		
		//토큰 객체 생성 (구분할 문자열, 구분자)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		
		//hasMoreTokens = 토큰이 남있으면 true, 없으면 false 반환
		while (st.hasMoreTokens()) {
			int item = Integer.parseInt( st.nextToken() );  //st.nextToken()으로 토큰 하나씩 꺼내는데, 정수형으로 형변환해주고 int 변수에 집어넣기
			System.out.print(item + " ");
			sum += item;
		}
		
		System.out.println();
		
		System.out.println("입력한 정수의 합계= " + sum);
		
		input.close();
	}
}
