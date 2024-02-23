package Day14.Ex01_Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
	
	/*
 	 * List 인터페이스
 	 * - 요소 추가
 	 * add(E)				:	맨 끝에 추가
 	 * add(index, E)		: 	index 추가
 	 * set(index, E)		:	index 요소를 E로 지정(변경)
 	 * addAll(Collection)	: 	해당 컬렉션에 지정한 컬렉션 요소 전체를 추가
 	 *  
 	 * - 요소 검색
 	 * get(index)			: 	index 에 있는 요소를 반환
 	 * contains(Object)	: 	요소의 포함 여부 (true/false)
 	 * isEmpty()			: 	컬렉션이 비어있는지 여부 (true)/false)
 	 * size()				:	지정된 요소의 개수 반환
 	 * 
 	 * - 요소 삭제
 	 * remove(index)		: 	index 에 있는 요소 삭제
 	 * remove(Object)		:	지정된 객체 요소를 삭제
 	 * clear()				: 	모든 요소 삭제			
 	 * 
 	 */
	
	public static void main(String[] args) {
		// 컬렉션 생성
		// : 컬렉션타입 <요소타입> 변수명 = new 클래스명 <요소타입>();
		
		// Vector 객체 생성
		Vector<Integer> list = new Vector<Integer>();
		//요소 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		//용량을 지정하여 생성
		Vector<String> vector = new Vector<String>(50);
		//요소 추가
		vector.add("아메리카노");
		vector.add("녹차라떼");
		vector.add("연유라떼");
		vector.add("아이스티");
		vector.add("돌체라떼");
		System.out.println(vector);
		
		//갯수, 용량확인
		System.out.println("갯수: " + vector.size());
		System.out.println("용량: " + vector.capacity());
		System.out.println();
		
		// 반복하는 여러가지 방법
		// 1. for문!
		System.out.println(">>반복2 - for문");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i); // vector.get(i) = 배열의 arr[i]랑 같음
			System.out.println("메뉴 이름: " + item);
		}
		System.out.println();
		
		// 2. foreach문
		System.out.println(">>반복2 - foreach문");
		for (String item : vector) {
			System.out.println("메뉴 이름: " + item);
		}
		System.out.println();
		
		// 3. Iterator를 이용한 반복
		// 해당 리스트를 컬렉션으로부터 Iterator 객체를 가져와서 반복할 수 있다.
		
		// iterator()
		// :각 리스트 컬렉션 객체로부터 Iterator 객체를 반환하는 메소드
		// vector.iterator(); 메소드를 호출하면 반복역할을 할 객체를 하나 가져옴.
		
		// Iterator
		// -hasNext()	: 다음 요소의 존재 여부
		// - next()		: 다음 요소를 반환
		//컬렉션객체.iterator() : 해당 컬렉션에 대한 iterator 객체 반환
		
		System.out.println(">>반복3 - iterator 활용한 반복");
		Iterator<String> it = vector.iterator();
		
		while (it.hasNext()) {
			String item =  it.next();
			System.out.print(item);
			
			if (it.hasNext()) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		System.out.println();
		
		
		// 삭제
		// - 삭제할 때, 삭제한 위치 뒤의 index가 앞으로 한 칸씩 당겨짐.
		System.out.println("==삭제 전==");
		System.out.println(vector);
		
		vector.remove(0);
		vector.remove("녹차라떼");
		vector.remove("연유라떼");
		vector.remove("아이스티");
		vector.remove("돌체라떼");
		
		System.out.println("\n==삭제 후==");
		System.out.println(vector);
		
		// 컬렉션.isEmpty() : 요소가 하나도 없으면 true, 아니면 false
		if (vector.isEmpty()) {
			System.out.println("메뉴가 없습니다.");
		}
	}
}
