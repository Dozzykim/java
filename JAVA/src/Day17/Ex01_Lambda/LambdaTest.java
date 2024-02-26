package Day17.Ex01_Lambda;

/**
 * 익명 객체
 *  - 익명 자식 객체
 *  - 익명 구현 객체
 *  
 *  익명 함수
 *  
 *  
 *  *익명 자식객체 vs 익명 구현 객체 vs 익명 함수
 */

//익명 자식객체의 부모클래스 정의
class Television {
	void volumeUp() { System.out.println("UP"); }
	void volumeDown() { System.out.println("DOWN"); }
}

// 익명 구현 객체의 인터페이스 정의
interface RemoteControl {
	void volumeUp();
	void volumeDown();
}

//함수형 인터페이스 정의
@FunctionalInterface //인터페이스가 함수형 잍너페이스인지 체크 (추상메서드 2개 이상 정의 시, 에러)
interface Calculator {  
	int cal(int a, int b);
	//double cal(double a, double b); -> 함수형 인터페이스는 추상메서드가 2개 이상 존재시 에러발생
}


public class LambdaTest {
	
	public static void main(String[] args) {
		//익명 자식객체
		Television tv = new Television() {

			@Override
			void volumeUp() {
				System.out.println("UP - 구현");
			}

			@Override
			void volumeDown() {
				System.out.println("DOWN - 구현");
			}
			
		};
		System.out.println("[tv]");
		tv.volumeUp();
		tv.volumeDown();
		System.out.println();
		
		//익명 구현객체
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.println("UP - 구현");
			}
			
			@Override
			public void volumeDown() {
				System.out.println("DOWN - 구현");
			}
		};
		System.out.println("[RC카]");
		rc.volumeUp();
		rc.volumeDown();
		System.out.println();
		
		
		
		//익명 구현 객체2 (람다식 인터페이스를 익명구현)
		Calculator cal = new Calculator() {
			
			@Override
			public int cal(int a, int b) {
				return a+b;
			}
		};
		int result1 = cal.cal(10, 20);
		System.out.println("result1: " + result1);
		System.out.println();
		
		
		//람다식
		Calculator calLambda = (a,b) -> {return a + b;};
		int result2 = calLambda.cal(30, 40);
		System.out.println("result2: " + result2);
	
	}

}
