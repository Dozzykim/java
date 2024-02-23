package Day14.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx2 {
	
	public static void printList(List<?> list) {
		//유효성 검사(null, 비어있는지 체크)
		if (list == null || list.isEmpty()) {
			System.err.println("요소가 없습니다.");
			return;
		}
		
		//각 리스트 컬렉션 객체로부터 Iterator 객체를 반환하는 메소드 => list.iterator()로 반환된 Iterator객체를 it에 대입
		Iterator<?> it = list.iterator();
		//hasNext() 다음요소가 있으면 반복
		while (it.hasNext()) {
			//다음 요소를 item 변수에 대입
			Object item =it.next();
			System.out.print(item);
			
			if (it.hasNext()) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<String> menuList = new Vector<String>();
		System.out.println("-----메뉴관리-----");
		
		do {
			System.out.println("입력 (종료: 0) : ");
			String menu = input.nextLine();
			
			//종료여부 체크
			if (menu.equals("0")) {
				break;
			}
			
			menuList.add(menu); //메뉴추가
			
		} while (true);
		
		printList(menuList);
		
		//전체 추가
		Vector<String> goodsList = new Vector<String>();
		goodsList.add("딸기 텀블러");
		goodsList.add("화이트 머그컵");
		menuList.addAll(goodsList); //menuList에 goodsList의 모든요소들을 추가
		
		printList(menuList);
		
		
		input.close();
	}

}
