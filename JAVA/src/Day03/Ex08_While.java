package Day03;

public class Ex08_While {

	public static void main(String[] args) {
		
		//1~10까지 공백을 두고 출력
		int a = 1;
		
		// while( 조건 ) { 반복 실행문 }
		// 반복문 사용시 반드시 종료조건 넣기. (무한루프 조심~~)
		while (a <= 10) {
			System.out.print(a++ + " ");
		}
	}
}
