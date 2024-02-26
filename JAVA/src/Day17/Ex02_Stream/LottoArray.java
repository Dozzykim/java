package Day17.Ex02_Stream;

import java.util.Scanner;

public class LottoArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = input.nextInt();
		input.nextLine();
		
		//N번 반복
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + " 게임] : ");
			int lotto[] = new int[6];
			
			//랜덤 수 6개를 생성 후 배열에 저장
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int)(Math.random() * 45 + 1);
				lotto[j] = rand;
				
				//중복제거
				for (int k = 0; k < j; k++) {
					//현재 뽑은 랜덤 수가, 기존의 수들과 똑같으면, 다시 뽑는다.
					if( rand == lotto[k]) {
						j--;
						break;
					}
				}
			} // -- i번째 게임 배열 저장 끝
			
			//해당 i번째 게임의 랜덤 수들을 정렬
			for (int j = 0; j < lotto.length; j++) {
				for (int k = j+1; k < lotto.length; k++) {
					if (lotto[j] > lotto[k]) {
						int temp = lotto[j];
						lotto[j] = lotto[k];
						lotto[k] = temp;
					}
				}
			}
			
			for (int j : lotto) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	input.close();	
	}
	
}
