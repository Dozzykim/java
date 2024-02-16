package Day02;

public class Ex02_Char {

	public static void main(String[] args) {
		
		//문자데이터: char
		//리터럴(Literal)
		//: 소스코드에 표기하는 데이터
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = '가';
		char c5 =44032;
		char c6 ='\uac00';
		
		
		int unicode = c1;
		
		char b = (char) (c2 + 1);
		//작은 자료형과 큰 자료형 연산 시, 큰 자료형으로 자동 형변환되어 계산됨.
		//(char형 + int 형)이라서 (int형 + int형)으로 자동형변환됨. 문자형 b와 int형 값이 달라 타입 미스매치 오류.
		//=> 해결방법: b를 int형으로 형변환해주기.
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		System.out.println("A의 코드값: " + unicode);
		System.out.println("b: " + b);
		
		
	}
}
