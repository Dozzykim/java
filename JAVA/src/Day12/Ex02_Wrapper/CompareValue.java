package Day12.Ex02_Wrapper;

public class CompareValue {

	public static void main(String[] args) {
		
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		//Q. intObj1 객체와 intObj2의 값이 같은가?
		// => 10이라는 값은 같음.
		//값을 꺼내서 비교 (언박싱하여 비교)
		System.out.println("언박싱하여 intObj1 / int Obj2 비교");
		System.out.println("결과: " + (intObj1.intValue() == intObj2.intValue()));
		System.out.println("-----------------");
		
		
		//Q. intObj1 객체와 intObj2의 인스턴스가 같은가?
		// => byte 범위에서는 같은 레퍼런스(인스턴스)로 생성됨.
		//*byte(8bit) = -128 ~ 127범위에서는 같은 인스턴스로 생성함.
		System.out.println("레퍼런스로 비교 (객체의 참조값)");
		System.out.println("결과: " + (intObj1 == intObj2));
		System.out.println("-----------------");
		
		System.out.println("equals 메소드로 비교");
		System.out.println("결과: " + intObj1.equals(intObj2));
		System.out.println("-----------------");
		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		//Q. intObj3 객체와 intObj4의 값이 같은가?
		// => 200이라는 값은 같음.
		//값을 꺼내서 비교 (언박싱하여 비교)
		System.out.println("언박싱하여 intObj3 / int Obj4 비교");
		System.out.println("결과: " + (intObj3.intValue() == intObj4.intValue()));
		System.out.println("-----------------");
		
		
		//Q. intObj3 객체와 intObj4의 인스턴스가 같은가?
		// => byte 범위에서는 같은 레퍼런스(인스턴스)로 생성됨.
		//intObj3,4는 byte범위 밖이므로 다른 레퍼런스(인스턴스)로 생성됨.
		System.out.println("레퍼런스로 비교 (객체의 참조값)");
		System.out.println("결과: " + (intObj3 == intObj4));
		System.out.println("-----------------");
		
		System.out.println("equals 메소드로 비교"); //인스턴스는 다르지만 equals로 비교시, Integer타입 클래스라면 내부의 값이 같을때 true 반환하기로 함.
		System.out.println("결과: " + intObj3.equals(intObj4));
		System.out.println("-----------------");
		
		// ==, != 기호로 래퍼객체를 비교하면,
		// 아래의 범위에서는 내부의 값을 ==, != 기호로 바로 비교 가능
		// Boolean		: true, false
		// 정수 타입		: -128~127
		// char			: \u0000 ~ \u007f
	}
}
