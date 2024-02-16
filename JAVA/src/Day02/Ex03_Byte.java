package Day02;

public class Ex03_Byte {

	public static void main(String[] args) {
		// byte는 1byte 범위의 정수 데이터를 표현
		// 1byte = 8bits  (0000 0000) = 2^8 = 256개
		// 양수와 음수로 나누면, -128 ~ (128-1) -> 중간에 0이 있어서 128에서 1빼줌~~~~
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte)128;  //오버플로우 (표현가능한 데이터 범위를 벗어남)
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
	}
	
}
