package Day11.Ex03_MultiCatch;

import java.util.Scanner;

public class MultCatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 자리 수인 정수 2개를 입력하세요: ");
		
		try {
			String str1 = input.nextLine();  //"20"
			String str2 = input.nextLine();  //"40"
			
			char[] char1 = str1.toCharArray(); //char1 = {'2', '0'}
			char[] char2 = str2.toCharArray(); //char1 = {'4', '0'}
			
			String[] input1 = new String[char1.length]; //input1 [2]
			String[] input2 = new String[char2.length]; //input2 [2]
			
			//char1 --> ['1']['0']
			//input1 --> ["1"]["0"]
			
			for (int i = 0; i < char1.length; i++) { //input1 = {"2", "0" }
				input1[i] = char1[i] + "";
			}
			
			for (int i = 0; i < char1.length; i++) { //input1 = {"4", "0" }
				input2[i] = char2[i] + "";
			}
			
			System.out.println(input1[0] + input1[1]); //출력결과: "20"
			System.out.println(input2[0] + input2[1]); //출력결과: "40"
			
			int val1 = Integer.parseInt(str1); //문자열숫자를 정수로 변환 => 변환결과 val1 = 20
			int val2 = Integer.parseInt(str2); //문자열숫자를 정수로 변환 => 변환결과 val2 = 40
			int result = val1 + val2;  //result = 20 + 40
			System.out.println(str1 + " + " + str2 + " = " + result);
			
		}
		
		/*
		 * 다중 Catch
		 * :여러 예외를 각각 다른 catch블록으로 처리하는 것
		 * -상위 예외 클래스가 하위 예외 클라스보다 아래쪽에 위치해야한다.
		 * 
		 * ex) Exception(최상위 예외변수)가 상위에 있으면, 모든 에러가 Exception에 걸리므로!!!!!!
		 */
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("접근할 수 없는 배열 index 범위. (한자리 수 입력함)");
		}
		
		catch (NumberFormatException e) {
			System.err.println("숫자로 변환할 수 없는 값. (문자 입력함)");
		}
		
		catch (Exception e) {
			System.err.println("알 수 없는 예외 발생");
		}
		
		input.close();
	}
}
