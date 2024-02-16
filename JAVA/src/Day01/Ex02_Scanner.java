package Day01;

import java.util.Scanner;

//외부에서 정의되어있는 클래스를 import를 통해 포함시킴 -> import 패키지명.클래스명;

public class Ex02_Scanner {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("a: ");
			int a = input.nextInt();   //nextInt() : 정수 하나를 입력받는 메소드~
			
			System.out.println("a: " + a);
			
			//정수 + 정수 -> 정수 계산.
			//정수 + 문자열 -> 숫자 데이터가 문자열로 변환되어 연결됨.
			//문자열 + 변수 ->  변수가 문자열 데이터로 변환되어 연결됨.
			
			input.close(); //input 스캐너를 해제. -> 해제한 후에는 더 이상 input 스캐너 사용할 수 없음.
	}
}



/*
빨간 밑줄 - 에러  : 프로그램 실행 불가

노란 밑줄 - 경고  : 프로그램 실행 가능 (실행엔 문제가 없지만, 수정이나 추가 권장 안내)
*/
