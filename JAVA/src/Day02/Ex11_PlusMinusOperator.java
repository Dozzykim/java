package Day02;

public class Ex11_PlusMinusOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c ;
		
		// 증감연산자
		// ++a, a++ : a를 1 증가
		// --a, a-- : a를 1 감소
		
		// 전위연산자: 연산자 우선순위가 가장 높음. 먼저 1증가시키고 나중에 해당 변수에 대입
		c = ++a + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		// 후위연산자: 연산자 우선순위가 가장 낮음. 
		
		int x = 10;
		int y = 20;
		int z;
		
		z= x++ + y;
		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
	}
}
