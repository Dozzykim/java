package Day04;

public class Ex07_String {

	public static void main(String[] args) {
		//String은 참조 자료형.
		//문자열 한글자, 한글자를 비교 시, .equals()메소드를 사용.
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		
		//문자열 객체 생성
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c: " + (a == c)); //문자리터럴 대입 시, 같은 메모리주소를 공유하므로, 값은 true;
		System.out.println("a == d: " + (a == d)); //d는 새로운 객체를 생성하여, 새로운 메모리주소를 할당받았으므로, 값은 false;
		System.out.println(a.equals(d)); // 문자열 비교 메소드 사용 시, 한글자씩 비교하므로 값 true;
				
		System.out.println("e == f: " + (e == f)); //e 와 f는 서로 각각 객체를 생성하여, 각각 새로운 메모리 주소를 할당받았으므로, 값은 false;
		System.out.println("문자열 비교: " + e.equals(f));// 문자열 비교 메소드 사용 시, 한글자씩 비교하므로 값 true;
		
		
	}
}
