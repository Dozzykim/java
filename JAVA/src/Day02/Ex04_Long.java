package Day02;

public class Ex04_Long {

	public static void main(String[] args) {
		
		// int (4bytes = 32bits = 2^32개 = 약 42억개
		// int 범위: -21억 nnn ~ 21억 nnn
		
		// long (8byes = 64bites = 2^64개)
		
		long ln1 = 1000;
		long ln2 = 2100000000;
		
		//long타입 리터럴 표현: 숫자끝에 L붙임 **L을 붙이지않으면 기본정수는 int 타입으로 취급
		
		long ln3 = 2200000000L;
		
		System.out.println("ln1: " + ln1);
		System.out.println("ln2: " + ln2);
		System.out.println("ln3: " + ln3);
		
	}
}
