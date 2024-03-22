package _06.StaticEx;

public class Student1 {
	
	public static int serialNo = 1000;
	public int stdId;
	public String stdName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNo++;
		stdId = serialNo;
	}
	
	public String getStudentName() {
		return stdName;
	}
	
	public void setStudentName(String name) {
		stdName = name;
	}
}
