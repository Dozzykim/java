package Day12.Ex02_Wrapper;

public class IntegerEx {

	public static void main(String[] args) {
		//int -> Integer
		//: 정수 타입인 int 기본 타입을 객체화한 클래스
		
		int a = 10;
		Integer A = 100;
		
		//*주요 메소드
		//(문자열) --> (정수)
		//(정수) --> (문자열)
		//(정수) --> (다른타입)
		
		System.out.println(Integer.parseInt("28") + 2); //문자열 => 정수
		System.out.println(Integer.toString(28) + 2); //정수 -> 문자열
		System.out.println(A.doubleValue() + 2.5); //정수 -> 실수
		System.out.println(Integer.toBinaryString(28)); //2진법 문자열로 출력
		System.out.println(Integer.bitCount(28)); //2진수의 1비트 갯수 카운트!
		
		//deprecated?
		//:더 이상의 사용을 권장하지 않는 문법!
//		Integer i = new Integer(10);  //이 방법말고 간단히, Integer i = 10; 으로 기본형처럼 정의 가능.
		
		//*Auto Boxing (오토박싱)
		//자바 5버전부터는 객체로 생성하여 생성하지 않아도, 자동으로 객체로 감싸줌.
		Integer i = 10; //오토박싱~
		int value = i.intValue(); //언박싱~
		System.out.println("객체로 생성한 Integer: " + i);
		System.out.println("기본타입 int: " + value);
	}
	
}
