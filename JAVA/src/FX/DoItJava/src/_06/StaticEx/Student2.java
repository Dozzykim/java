package _06.StaticEx;

public class Student2 {
	
	private static int serialNo = 1000;
	public int stdId;
	public String stdName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNo++;
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
		Student2.serialNo = serialNo;
	}
}
