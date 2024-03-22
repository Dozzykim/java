package _06.StaticEx;

public class Student {
	
	public static int serialNo = 1000;
	public int stdId;
	public String stdName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return stdName;
	}
	
	public void setStudentName(String name) {
		stdName = name;
	}
}
