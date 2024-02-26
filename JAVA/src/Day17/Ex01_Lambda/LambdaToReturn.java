package Day17.Ex01_Lambda;

/*
 * 익명함수(람다식)을 반환하여 사용하는 실습
 * 
*/

//함수형 인터페이스 정의
@FunctionalInterface
interface PrintString {
	void showString(String msg);
}

public class LambdaToReturn {
	public static void main(String[] args) {
		
		PrintString ps1 = returnLambda(1);
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);
		
		ps1.showString("안녕하세요1");
		ps2.showString("안녕하세요2");
		ps3.showString("안녕하세요3");
	}
	

// 람다식(익명함수)를 반환하는 메소드
	private static PrintString returnLambda(int code) {
		switch (code) {
		case 1:
			// 매개변수가 1개면 소괄호를 생략할 수 있다.
			return msg -> System.out.println("메시지: " + msg);
			
		case 2:
			return msg ->{
				System.out.println("메시지: ");
				System.out.println(msg);
			};
			
		case 3:
			return (msg) -> System.out.println(msg);
			
		default:
			return (msg) -> System.out.println(msg);
		}
	}
}

