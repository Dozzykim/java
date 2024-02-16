package Day08.Ex02_Shape;

/*
 * 추상클래스
*/

public abstract class Shape {

	//Point 멤버변수ㅜ를 선언하시오.
	Point point;
	
	//넓이와 둘레를 구하는 메소드 원형을 정의하시오.
	//*키워드: abstract
	//추상 메소드: abstract 반환타입 메소드명(매개변수);
	
	abstract double area();
	abstract double round();

	
	//getter, setter 메소드를 정의하시오.
	public Point getPoint() {
		return point;
	}
	
	public void setPoint(Point point) {
		this.point = point;
	}
	
	
	
	
}
