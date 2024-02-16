package Day11.Ex06_UserException;

/*
 * 사용자 정의 예외 클래스
 * public class ??Exception extends Exception {  }
 * -일반예외: Exception클래스 상속
 * -실행예외: RuntimeException클래스 상속
*/

public class BalanceException  extends Exception {
	
	public BalanceException ( ) {
		super();
	}
	
	public BalanceException(String message) {
		super(message);
	}
	
	
}
