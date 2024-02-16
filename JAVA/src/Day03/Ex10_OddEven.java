package Day03;

public class Ex10_OddEven {

	public static void main(String[] args) {

		int a = 1;
		int oddSum = 0;
		int evenSum = 0;

		while (a <= 20) {
			if (a % 2 == 0) {
				evenSum += a;
			} else {
				oddSum += a;
			}
			a++;
		}
		
		System.out.println("홀수의 합: " + oddSum);
		System.out.println("짝수의 합: " + evenSum);
	}

}