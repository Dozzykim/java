package Day17.Ex01_Lambda;

/*
 * 매개변수가 있는 람다식
 * - 최댓값을 구하는 함수
 * - 합계를 구하는 함수
 * 
*/
@FunctionalInterface
interface SmartCal {
	int cal(int x, int y);
}
public class LambdaToParameter {
	public static void main(String[] args) {
		
		//최댓값
		SmartCal sc1 = (x, y) -> {
			return (x > y)? x : y;
		};
		
		//x~y까지의 합계
		SmartCal sc2 = (x, y) -> {
			int sum = 0;
			for (int i = x; i <= y; i++) {
				sum += i;
			}
			return sum;
		};
		
		int result1 = sc1.cal(10, 20);
		int result2 = sc2.cal(10, 20);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		
		//메소드의 익명함수(람다식)을 전달하여 사용할 수도 있다.
		smartCal(sc1, 10, 20);
		smartCal(sc2, 10, 20);
		
		
		}
	// Q: 메소드(익명함수 람다식)를 메소드에 전달할 수 있을까?
	// A: 람다식을 정의한 익명함수는 인터페이스 타입으로 잔달할 수 있다.
			public static void smartCal(SmartCal sm, int a, int b) {
				int result = sm.cal(a, b);
				System.out.println("result: " + result);
	}

}
