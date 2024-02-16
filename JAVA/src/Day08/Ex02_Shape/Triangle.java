package Day08.Ex02_Shape;

public class Triangle extends Shape {

	double width, height;

	public Triangle() {
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {

		return width * height / 2;
	}

	@Override
	public double round() {
		return width * 3;
	}

	//getter, settter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
