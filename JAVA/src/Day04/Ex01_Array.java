package Day04;

public class Ex01_Array {
	
	public static void main(String[] args) {
		//배열 선언: 자료형 변수명[];
		int arr[];       //여기서는 arr 라고하는 변수만 생김
		
		//배열 생성: 변수명 = new 자료형[개수];
		arr = new int[5];   // 여기서 생성함으로써 5칸을 할당받고 메모리 주소를 부여받음.
		
		//배열 요소에 접근
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//배열의 길이: 배열 요소의 개수 = 배열.length
		int N = arr.length;
		System.out.println("배열의 길이: " + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		
	}		

}
