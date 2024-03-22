package ref.ex;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		
		ProductOrder[] orders = new ProductOrder[3];
		orders[0] = createOrder("두부", 2000, 2);
		orders[1] = createOrder("김치", 5000, 1);
		orders[2] = createOrder("당근", 1500, 2);

		
		printOrders(orders);
		int totalAmount = getTotalAmount(orders);
		System.out.println("총 결제 금액: " + totalAmount);

	}

	static ProductOrder createOrder(String productName, int price, int qty) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.qty = qty;

		return order;
	}

	static void printOrders(ProductOrder[] orders) {
		for (ProductOrder o : orders) {
			System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.qty);
		}

	}

	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for (ProductOrder o : orders) {
			totalAmount += o.price * o.qty;
		}
		return totalAmount;
	}

}
