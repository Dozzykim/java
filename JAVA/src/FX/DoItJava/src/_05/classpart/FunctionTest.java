package _05.classpart;

public class FunctionTest {
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		
		System.out.println(n1 + " + " + n2 + " = " + add(n1, n2) + "입니다.");
		System.out.println(n1 + " - " + n2 + " = " + diff(n1, n2) + "입니다.");
		System.out.println(n1 + " * " + n2 + " = " + multi(n1, n2) + "입니다.");
		System.out.println(n1 + " / " + n2 + " = " + div(n1, n2) + "입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	public static int diff(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int multi(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

}
