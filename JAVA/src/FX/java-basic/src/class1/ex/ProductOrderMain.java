package class1.ex;

public class ProductOrderMain {
	
	public static void main(String[] args) {
		
		int total = 0;
		ProductOrder[] orders = new ProductOrder[3];
		
		ProductOrder order1 = new ProductOrder();
		order1.productName = "두부";
		order1.price = 2000;
		order1.qty = 2;
		orders[0] = order1;
		
		ProductOrder order2 = new ProductOrder();
		order2.productName = "김치";
		order2.price = 5000;
		order2.qty = 1;
		orders[1] = order2;
		
		ProductOrder order3 = new ProductOrder();
		order3.productName = "콜라";
		order3.price = 1500;
		order3.qty = 2;
		orders[2] = order3;
		

		
		for (ProductOrder o : orders) {
			total += o.price * o.qty;
			System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.qty);
		}
		System.out.println("총 결제 금액: " + total);
		
		
	}

}
