package Day14.Ex01_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	
	/*
  	Set
  	: 순서가 없고, 중복요소를 허용하지 않는 컬렉션
  	
  	요소 추가
  	- add()				: 중복이 아니면, 요소를 추가 (true)
  					  	  중복이면, 추가를 안 함 (false)
  	요소 검색
  	- contains()		: 해당 요소가 존재하면 true
  	- isEmpty()			: 요소가 하나도 없으면 true
  	- size()			: 요소의 개수를 반환
  	
  	요소 삭제
  	- remove(Object)	: 해당 요소를 삭제
  						  index가 없으므로, 객체로만 삭제할 수 있다
*/

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		//1,2,3,4,5
		System.out.println( set.add(1) );
		System.out.println( set.add(2) );
		System.out.println( set.add(3) );
		System.out.println( set.add(4) );
		System.out.println( set.add(5) );
		
		System.out.println("<추가 전>");
		for (Integer item : set) {
			System.out.println("item: " + item);
		}
		System.out.println();
		
		//추가
		// Set컬렉션은 중복된 요소를 저장하지 않는다. (중복불가)
		// 이미 존재하는 3, 5 추가해보기
		System.out.println( set.add(3) );
		System.out.println( set.add(5) );
		
		System.out.println("<추가 후>");
		for (Integer item : set) {
			System.out.println("item: " + item);
		}
		System.out.println();
		System.out.println("size(갯수): " + set.size() );
		
		//삭제
		set.remove(3);
		set.remove(5);
		System.out.println("size(갯수): " + set.size() );
		for (Integer item : set) {
			System.out.println("item: " + item);
		}
		
	}
}
