package Day06.Ex02_Encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		Account account = new Account(0, "김도희", "1002-654-743113", "우리은행");

//		account.deposit = 10000; => 에러! deposit은 private으로 지정했기 때문에, 접근불가
		account.setDeposit(1000000000);
		
		int money = account.getDeposit();
		System.out.println("예금액: " + money);
		System.out.println(account);
	}

}
