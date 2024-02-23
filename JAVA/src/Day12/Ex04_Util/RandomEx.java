package Day12.Ex04_Util;

import java.util.Random;

/*
 * Random 클래스
 *  : 타입별로 난수(랜덤수)를 생성하는 클래스
 *  
 * *주요 메소드
 *  -nextInt()		: int형 랜덤수를 반환하는 메소드
 *  -nextBoolean()	: boolean형 랜덤수를 반환하는 메소드
 *  -nextDouble()	: double형 랜덤수를 반환하는 메소드
 *   
*/

public class RandomEx {

	public static void main(String[] args) {
		Random random = new Random();
		
		//동전 던지기
		boolean randomTF = random.nextBoolean();
		System.out.println("동전 앞뒤: " + randomTF);
		
		System.out.println("동전 던지기...");
		if (randomTF) {
			System.out.println("앞면");
		} else {
			System.out.println("뒷면");
		}
		System.out.println("---------------------");
		
		
		// 정수형 랜덤수
		// *4byte (-21억 xxx ~ 21억 xxx)사이의 난수를 반환
		int fourByteRandom = random.nextInt();
		System.out.println("fourbyteRandom: " + fourByteRandom);
		System.out.println("---------------------");
		
		
		//주사위 던지기(1 ~ 6)
		//nextInt( N )	 : (0 ~ N-1) 사이의 난수를 반환함
		//nextInt( 6 )	 : (0 ~ 5)
		//nextInt( 6 )+1 : (1 ~ 6)
		//[공식] random.nextInt(개수) + 시작숫자
		int dice = random.nextInt(6)+1;  //1 ~ 6사이의 랜덤수
		System.out.println("주사위: " + dice);
		System.out.println("---------------------");
		
		
		int lotto = random.nextInt(45) + 1;
		System.out.println("로또번호: " + lotto);
		
		System.out.println("---------------------");
		
		double randomDouble = random.nextDouble();
		System.out.println("랜덤 실수: " + randomDouble);
		
		System.out.println("---------------------");
	}
}
