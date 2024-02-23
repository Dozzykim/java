package Day12.Ex02_Wrapper;

public class CharacterEx {

	public static void main(String[] args) {

		/*
		 * Character char 기본형 -> Character 클래스.
		 * 문자타입인 char 기본형을 객체화한 클래스
		 * 
		 * 주요 메소드
		 * -대소문자 변환
		 * -문자/숫자 여부 판단
		 */

		char a = 'a';
		char A = 'A';

		System.out.println(Character.toUpperCase(a)); // 대문자로 변환
		System.out.println(Character.toLowerCase(A)); // 소문자로 변환

		char c1 = '5';
		char c2 = 'X';

		// 해당 문자가 숫자인지 확인
		if (Character.isDigit(c1)) {
			System.out.println(c1 + "(은/는) 숫자입니다.");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "(은/는) 영문자입니다.");
		}
		
		String str = "Hello The Jouen Academy";
		
		char[] arr = str.toCharArray(); //toCharArray() 한글자씩 배열로 만들어줌
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			//대문자인지 확인
			if (Character.isUpperCase(arr[i])) {
				count ++;
			}
		}
		System.out.println(str + " - 대문자 개수: " + count);

	}
}
