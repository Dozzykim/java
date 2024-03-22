package _06.Singleton.ex;

public class CarFactory {
	
	//인스턴스 변수에 private을 걸어서 더이상 생성하지 못하게 막음
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {
		//private로 지정하여 마음대로 CarFactory인스턴스를 생성하지 못하게 함.
	}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car.serialNum++;
		Car car = new Car();
		return car;
	}

}
