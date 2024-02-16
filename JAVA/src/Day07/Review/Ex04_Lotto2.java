package Day07.Review;

public class Ex04_Lotto2 {
	
	public static void main(String[] args) {
		
		//Math.random(): 0.xxx ~ 0.9xxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		
		//1~6 사이의 정수: 주사위
		//Math.random()					: 0.xxx ~ 0.9
		//Math.random()	* 10			: 0 ~ 9 (10개)
		//(int) (Math.random()*6)  	    : 0 ~ 5 (6개)
		//(int) (Math.random()*6) +1	: 1 ~ 6 (6개)
		int dice = (int) (random*6 + 1);
		System.out.println("주사위: " + dice);
		
		//1~45 사이의 정수: 로또
		int lotto = (int) (Math.random() * 45 +1);
		System.out.println("로또 랜덤번호: " + lotto);
		
		//공식-> (int) Math.random() * 개수 + 시작숫자;
		//1~20 사이의 랜덤 수
		int start1to20 = (int) (Math.random() * 20 + 1);
		System.out.println("1~20사이의 랜덤 수: " + start1to20);

		
		//-20~20 사이의 랜덤 수
		int start_under20to20 = (int) (Math.random() * 41 + -20);
		System.out.println("-20~20사이의 랜덤 수: " + start_under20to20);

		
		
		System.out.println("-----------------------------------------.");
		//1~45사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오
		
		//랜덤 수 6개 담아둘 배열 생성 및 선언.
		int[] arr = new int [6];
		//배열 요소 앞뒤 자리 바꿀때 잠시 값 저장해둘 변수 선언.
		int change;
		
		while (true) {
			System.out.println("중복을 제거해보도록 하겠습니다.");
			for (int i = 0; i < arr.length; i++) {
				int randomNo = (int) (Math.random() * 45 + 1);
				arr[i] = randomNo;
				for(int j = 0; j < i; j++) {
					if (arr[j] != arr[i]) {
						continue;
					} else {
						
					}
				}
				
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			
			break;
		}
		
		//랜덤 수 6개 생성하여 배열 담기
		System.out.print("랜덤출력 오름차순 정렬 전: ");
		for (int i = 0; i < arr.length; i++) {
			int randomNo = (int) (Math.random() * 45 + 1);
			arr[i] = randomNo;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		//내부 for문 = 앞, 뒷자리 2개 비교 후, 크면 자리 바꾸기.
		//외부 for문 = 내부for문의 과정을 arr.length번 반복하는 반복문
		//(외부for문 존재 이유: 혹시 맨 끝 숫자가 제일 작은 경우, 맨 앞으로 가져와야하는데, 내부 for문은 앞뒤만 비교해 자리 바꾸는 로직이어서
		//					그 상황을 대비해 맨끝 자리까지 체크할 수 있도록 확실히 돌아주는 역할
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				//앞뒤 비교 해서 자리 바꿀지 말지 체크하는 조건문
				if (arr [j-1] > arr [j]) {
					change = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = change;
					
					//올바르게 정렬되어있다면, 다음 반복 돌아가도록 continue;
				} else {
					continue;
				}
			}
		}
		
		System.out.print("랜덤출력 오름차순 정렬 후: ");
		//foreach문을 사용하여 요소 한개씩 꺼내서 프린트
		for (int z : arr) {
			System.out.print(z + " ");
		}
		System.out.println();
	}
}

