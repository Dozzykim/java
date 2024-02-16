package Day02;

public class Ex14_TernaryOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
	
		//삼항연산자-> (조건식)? (참일때 값) : (거짓일때 값)
		int result = (a>b) ? a-b : b-a;
		System.out.println("두 수의 차: " + result);
		
		if (a > b) 
			result = a-b;
		 else 
			result = b-a;
		
		System.out.println("result: " + result);
	}
}
