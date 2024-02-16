package Day07.Review;

import java.util.Scanner;


public class Ex07_Method {
	


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = input.nextInt();
		System.out.print("b: ");
		int b = input.nextInt();
		
		//메소드 호출: 메소드명(인자1, 인자2);
		System.out.println( minus(a, b) );
		System.out.println( plus(a, b) );
		
		input.close();
	}
	
	
	//아래의 메소드들은 static으로 전역메소드 지정해두었기 때문에, 따로 객체 생성을 하지 않아도 같은 클래스 안에서 사용 가능.
	/**
	 * 뺄셈메소드
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public static int minus(int a, int b) {
		return a - b;
	}
	
	/**
	 * 덧셈메소드
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static int plus(int a, int b) {
		return a + b;
	}
}
