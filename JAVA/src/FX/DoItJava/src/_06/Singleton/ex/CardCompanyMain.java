package _06.Singleton.ex;

public class CardCompanyMain {
	
	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		Card shinhan = company.createCard();
		Card samsung = company.createCard();
		
		shinhan.showInfo();
		samsung.showInfo();
		
	}
	
	
	
	
	

}
