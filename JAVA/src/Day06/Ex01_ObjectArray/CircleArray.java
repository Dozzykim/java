package Day06.Ex01_ObjectArray;

/*
 * 반지름이 1~5인 Circle 객체를 5개 가지는 객체 배열을 생성하고
 * 배열 요소에 있는 모든 Circle 객체의 넓이를 출력하세요.
 * */

class Circle {
	//변수 : 반지름
	int r;
	
	//생성자
	public Circle(int r) {
		this.r = r;
	}
	
	//메소드 : 넓이
	public double area() {
		//원의 넓이 = 원주율 * r^2
		return Math.PI * Math.pow(r, 2);
	}
}


public class CircleArray {
	
	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i+1);
		}
		
		for (Circle circle : c) {
			System.out.println("넓이: " + circle.area());
			
		}
		
	}
}
