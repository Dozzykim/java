package Day06.Ex02_Encapsulation;

/*
 * 통장계좌
 * -예금주
 * -예금액
 * -계좌번호
 * -은행명
 * 
 * */


public class Account {

	private int deposit;
	private String depositor;
	private String depoNo;
	private String bank;
	
	//기본 생성자
	public Account() {
		this(0, "예금주 없음", "0000-0000-0000", "지정은행 없음");
	}
	
	//모든 매개변수가 있는 생성자
	public Account(int deposit, String depositor, String depoNo, String bank) {
		this.deposit = deposit;
		this.depositor = depositor;
		this.depoNo = depoNo;
		this.bank = bank;
	}

	//getter, setter
	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getDepositor() {
		return depositor;
	}

	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}

	public String getDepoNo() {
		return depoNo;
	}

	public void setDepoNo(String depoNo) {
		this.depoNo = depoNo;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	//toString()
	@Override
	public String toString() {
		return "계좌 [예금액=" + deposit + ", 예금주=" + depositor + ", 계좌번호=" + depoNo + ", 은행명=" + bank+ "]";
	}
	
	
}
