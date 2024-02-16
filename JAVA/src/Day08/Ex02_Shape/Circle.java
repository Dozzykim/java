package Day08.Ex02_Shape;

public class Circle extends Shape{

	double r;
	
	public Circle () {
		this(0);
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	double area() {
		// 원주율 * 반지름^2
		return Math.PI * r * r;
	}

	@Override
	double round() {
		// 2 * 원주율 * 반지름
		return 2 * Math.PI * r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	
}
