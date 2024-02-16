package Day03;

public class Ex09_WhileSum {
	
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		
		while (a <= 100) {
			sum += a;
			a++;
			
//			다른방법
//			sum += a++;
			
		}
		System.out.println("합계: " + sum);
	}
}
