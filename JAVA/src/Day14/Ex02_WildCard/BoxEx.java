package Day14.Ex02_WildCard;

import Day05.Class.Pikachu;
import Day05.Class.Raichu;

public class BoxEx {
	
	public static void main(String[] args) {
		
		//Box클래스에서 정하지않은 인스턴스 변수 타입을 < >을 통해 지정해줌.
		
		//box1
		Box<String> box1 = new Box<String>();
		box1.setT("쿠팡택배");
		String boxName = box1.getT();
		System.out.println("box1: " + boxName);
		
		//box2
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(200);;
		int boxQty = box2.getT();
		System.out.println("box2의 갯수: " + boxQty);
		
		//monsterBall
		Box<Pikachu> monsterBall = new Box<Pikachu>();
		monsterBall.setT(new Pikachu());
		Pikachu pikachu = monsterBall.getT();
		System.out.println("pikachu: " + pikachu);
		
		// 제네릭 와일드카드
		// - 알 수 없는 타입을 대체하여 사용하는 기호
		// - 주로 타입 제한을 주기 위해서 사용한다.
		//   1) ? super T 	: 해당 클래스부터 상위 클래스를 허용하도록 제한
		//   2) ? extends T : 해당 클래스부터 하위 클래스를 허용하도록 제한
		
		Box<?> wildcardBox = new Box<>();
		
		// 대입할 box1이 무슨 타입일지 모를때 와일드카드 사용
		Box<?> wBox = box1;
		
		// 대입할 box2가 무슨 타입인지 모르지만 숫자타입만 가져오고싶을 때
		// Number클래스와 그 하위클래스들을 허용
		Box<? extends Number> wBox2 = box2;
		
		// Raichu클래스와 그 상위클래스들 허용
		Box<? super Raichu> wBox3 = monsterBall;
//(에러) Box<? super Raichu> wBox4 = box1; => 제한을 걸어뒀기 때문에, String타입인 box1을 가져올 수 없음.
		
		
	}

}

