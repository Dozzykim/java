package _06.Singleton.ex;

public class Car {
	
	public static int serialNum = 10000;
	int carNum;
	
	public Car ( ) {
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	
}
