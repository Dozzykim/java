package _05.ex;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2000, 2, 30);
		date1.isValid();
		
		MyDate date2 = new MyDate(2006, 10, 2);
		date2.isValid();
	}
}
