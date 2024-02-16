package Day11.Ex01_TryCatch;

/*
 * 예외처리
 * -NumberFormatException
 * : 숫자형식이 아닌 것을 숫자형으로 변환 시 나타나는 예외
 * ex) 문자열숫자 "10"
*/

public class NumberFormat {

	public static void main(String[] args) {
		String strNum = "10";
		int num = 10;

		System.out.println("10 + 20 = " + (strNum + 20));
		System.out.println("10 + 20 = " + (num + 20));

		String numberString = "10";
		String numberAndString = "A10";
		
		//Integer.parseInt("문자열 숫자")
		//:문자열인 숫자를 int 타입의 숫자로 변환하는 메소드
		
		int n1 = Integer.parseInt(numberString); //변환 O
		System.out.println("numberString + 5 = " + (n1 + 5));
		
		int n2 = 0;
		
		try {
			n2 = Integer.parseInt(numberAndString); //변환 X
			
		}
		catch (NumberFormatException e) {
			System.err.println("문자열숫자가 아닌 문자열은 숫자타입으로 변환할 수 없습니다.");
		}

		System.out.println("n1 + 10 = " + (n1 + 10));
		System.out.println("n2: " + n2);
	}
}
