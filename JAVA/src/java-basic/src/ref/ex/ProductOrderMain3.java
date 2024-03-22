package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("입력할 주문의 개수를 입력하세요: ");
		int n = input.nextInt();
		input.nextLine(); //입력 버퍼를 비우기 위한 코드
		
		
		ProductOrder[] orders = new ProductOrder[n];

		for (int i = 0; i < orders.length; i++) {
			
			System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
			
			System.out.print("상품명: ");
			String productName = input.nextLine();
			
			System.out.print("가격: ");
			int price = input.nextInt();
			
			System.out.print("수량: ");
			int qty = input.nextInt();
			input.nextLine(); //입력 버퍼를 비우기 위한 코드
			
			orders[i] = createOrder(productName, price, qty);
			
		}
		
		printOrders(orders);
		int totalAmount = getTotalAmount(orders);
		System.out.println("총 결제 금액: " + totalAmount);

		input.close();
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
