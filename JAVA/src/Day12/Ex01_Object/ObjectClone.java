package Day12.Ex01_Object;

/*
 * 객체 복제 = clone 메소드
 * 
 * clone() 메소드를 사용 시, 복제당할 클래스에 Clonable 인터페이스를 구현해야함.
*/

class Point {

	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

class Circle implements Cloneable {
	Point point; // 중심점
	int r; // 반지름

	Circle(int x, int y, int r) {
		this.r = r;
		this.point = new Point(x, y);
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", r=" + r + "]";
	}

	@Override // 반환 타입 => 최상위 부모클래스 Object
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ObjectClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 5);

		// clone메소드는 최상위 부모클래스인 Object로 반환함.
		// 부모클래스를 자식클래스에 대입할 수 없기에, 자식클래스로 강제 형변환 후 대입해줌.
		Circle copyCircle = (Circle) circle.clone(); // 객체(인스턴스) 복제
		// *clone()메소드로 객체를 복제하면, 같은 객체 정보를 가지는 새로운 인스턴스를 생성

		System.out.println(circle);
		System.out.println(copyCircle);

		if (circle.equals(copyCircle)) {
			System.out.println("circle과 copyCircle은 같은 객체.");
		}

		// System.identityHashCode(객체): 객체의 해시코드를 반환
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));

	}
}
