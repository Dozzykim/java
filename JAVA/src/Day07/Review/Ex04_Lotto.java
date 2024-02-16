package Day07.Review;

public class Ex04_Lotto {
	
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
		

		// 내부 for문 = 앞, 뒷자리 2개 비교 후, 크면 자리 바꾸기.
		// 외부 for문 = 내부for문의 과정을 arr.length번 반복하는 반복문
		// (외부for문 존재 이유: 혹시 맨 끝 숫자가 제일 작은 경우, 맨 앞으로 가져와야하는데, 내부 for문은 앞뒤만 비교해 자리 바꾸는
		// 로직이어서
		// 그 상황을 대비해 맨끝 자리까지 체크할 수 있도록 확실히 돌아주는 역할

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 1; j < lotto.length; j++) {
				// 앞뒤 비교 해서 자리 바꿀지 말지 체크하는 조건문
				if (lotto[j - 1] > lotto[j]) {
					change = lotto[j - 1];
					lotto[j - 1] = lotto[j];
					lotto[j] = change;

					// 올바르게 정렬되어있다면, 다음 반복 돌아가도록 continue;
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
