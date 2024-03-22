package _06.StaticEx;

public class Student3 {
	
	private static int serialNo = 1000;
	public int stdId;
	public String stdName;
	public int grade;
	public String address;
	static int cardNo;
	
	public Student3() {
		serialNo++;
		cardNo = serialNo + 100;
		stdId = serialNo;
	}
	
	public String getStudentName() {
		return stdName;
	}
	
	public void setStudentName(String name) {
		stdName = name;
	}
	
	public static int getSerialNo() {
		int i = 10;
		return serialNo;
	}
	
	public static void setSerialNo(int serialNo) {
		Student3.serialNo = serialNo;
		
	}
}
