package _05.classpart.ex;

public class OrderMain {
	
	public static void main(String[] args) {
		Order order = new Order(); 

		order.No = 201803120001L;
		order.userID = "abc123";
		order.Date = "2018년 3월 12일";
		order.userName = "홍길순";
		order.productNo = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호: ");
		System.out.println("주문자 아이디: ");
		System.out.println("주문 날짜: ");
		System.out.println("주문자 이름: ");
		System.out.println();
		
		
	}

}
