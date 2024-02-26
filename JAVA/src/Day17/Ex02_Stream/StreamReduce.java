package Day17.Ex02_Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(90);
		list.add(60);
		list.add(80);
		list.add(70);
		
		//이것을 한줄로 줄인게...아래의 코드...
//		int sum = 0;
//		for (Integer integer : list) {
//			sum += integer;
//		}
//		System.out.println(sum);
		
		/*reduce 연산*/
		// reduce(누적할 변수의 초기값, (누적할 변수, 각각 개별요소) -> 수식)
		// 모든 스트림 요소를 하나의 값으로 누적해서 줄이는 연산
		int result = list.stream().reduce(0, (sum, a) -> sum + a);
		System.out.println("result: " + result);
		
		//---------------------------
		List<String> wordList = new ArrayList<String>();
		wordList.add("안녕하세요");
		wordList.add("20분 뒤면");
		wordList.add("집에 갈 시간입니다.");
		wordList.add("reduce()를 알아봅시다.");
		
		String msg = wordList.stream().reduce("", (a, b) -> a + b + " " );
		System.out.println(msg);
		System.out.println();
	}

}
