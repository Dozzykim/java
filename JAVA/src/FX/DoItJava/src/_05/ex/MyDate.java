package _05.ex;

public class MyDate {
	
	//멤버변수
	private int year;
	private int month;
	private int day;
	
	
	//생성자
	public MyDate (int year, int month, int day ) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	
	//getter, setter,,,,
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//날짜유효확인 메서드
	public boolean isValid() {
		if(month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜입니다.");
				return true;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜입니다.");
				return true;
			}
		} else {
			if (day < 1 || day > 30) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜입니다.");
				return true;
			}
			
		}
		
	}
	

}
