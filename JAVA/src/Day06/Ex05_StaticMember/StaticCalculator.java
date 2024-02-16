package Day06.Ex05_StaticMember;

class Calculator {
	//
	public static int abs(int val) {
		return val >= 0 ? val : -val;
	}

	//최댓값
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	//최솟값
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
}

public class StaticCalculator {

	public static void main(String[] args) {
		int arr[] = {70, 65, 90, 85, 100};
		
		//다른 클래스의 static 메소드를 호출하는 방법
		//=> 클래스명.메소드명();
		
		System.out.println("abs(-123): " + Calculator.abs(-123));
		System.out.println("max(arr): " + Calculator.max(arr));
		System.out.println("max(arr): " + Calculator.min(arr));
	}
}
