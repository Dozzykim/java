package Day07.Review;

public class Ex04_Lotto_Selected {
	
	// 1~45사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오
	public static void main(String[] args) {

		// 랜덤 수 6개 담아둘 배열 생성 및 선언.
		int[] lotto = new int[6];
		// 배열 요소 앞뒤 자리 바꿀때 잠시 값 저장해둘 변수 선언.
		int change;

		
		
		System.out.print("랜덤뽑기: ");
		//외부 반복문: 6번 반복해서 랜덤 번호를 뽑는 반복문
		//내부 반복문: 중복체크 반복문. but 앞서 뽑힌 번호와 비교 시, 중복됐다면 외부반복변수 i 카운트를 한개 줄여서 다시 뽑게 하는 조건문이 들어있음.
		for (int i = 0; i < lotto.length; i++) {
			int randomNo = (int) (Math.random() * 45 + 1);
			//랜덤번호를 배열에 저장
			lotto[i] = randomNo;
			
			//              j < i인 이유: 랜덤번호가 1개 생겼을때는 비교할 대상이 없고, n개 생겼을 때는 이전의 n-1개와 중복체크하면 되므로.
			for (int j = 0; j < i; j++) {
				if (lotto[j] != lotto[i]) {
					continue;
				} else {
					i--;
				}
			}

			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		System.out.print("중복제거: ");
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
		

		//선택정렬
		int temp;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i+1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
			
		}

		System.out.print("랜덤출력 오름차순 정렬 후: ");
		// foreach문을 사용하여 요소 한개씩 꺼내서 프린트
		for (int z : lotto) {
			System.out.print(z + " ");
		}
		System.out.println();
	}
}
