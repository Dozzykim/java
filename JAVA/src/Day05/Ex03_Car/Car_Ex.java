package Day05.Ex03_Car;

public class Car_Ex {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "볼보";
		
		//private으로 지정한 변수는 외부에서 접근 불가능
		//car.speed = 200;
		car.setSpeed(200);
		System.out.println("model: " + car.getModel());
		System.out.println("spped: " + car.getSpeed());
		
		car.setSpeed(-50);
		System.out.println("model: " + car.getModel());
		System.out.println("spped: " + car.getSpeed());
		
		car.setSpeed(400);
		System.out.println("model: " + car.getModel());
		System.out.println("spped: " + car.getSpeed());
		
		car.setSpeed(200);
		System.out.println("model: " + car.getModel());
		System.out.println("spped: " + car.getSpeed());
		
		
		
	}

}
