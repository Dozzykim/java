package Day11.Ex06_UserException;

public class AccountEx {
	
	public static void main(String[] args) {
		
		Account myAccount = new Account();
		
		//입금
		myAccount.deposit(10000);
		
		
		//출금 (단, 잔액보다 큰 금액 출금 시 강제로 예외발생시킴)
		try {
			myAccount.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	}

}
