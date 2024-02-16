package Day11.Ex06_UserException;

public class Account {

	private long balance;  //예금잔액
	
	public Account( ) {
		
	}
	
	//getter
	public long getBalance( ) {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceException {
		//잔고보다 큰 금액을 출금 불가능하도록 예외 강제 발생시키기(throw)
		if (balance < money) {
			throw new BalanceException("잔고가 부족합니다." + (money - balance) + "원이 부족합니다.");
		}
		balance -= money;
	}
}
