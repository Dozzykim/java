package Day10.Ex01_NestedClass;

public class NestedClass2 {
	
	public static void main(String[] args) {
		
		X x  = new X();
		
		X.Y y = x.new Y();
		y.value = 10;
		System.out.println("X의 Y 객체의 변수: " + y.value);
		y.method1();
		
		X.Z z = new X.Z();
		z.value1 = 20; //value1은 일반 멤버변수여서 z객체를 만들어져야지만 사용가능
		System.out.println("X의 Z객체 변수: " + z.value1);
		
		X.Z.value2 = 30; //value2는 static변수로, z객체 생성이 안되어도 사용가능.
		System.out.println("X의 Z객체 static 변수: " + X.Z.value2);
		z.method1();
		X.Z.method2();
		
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		x.method();  //내부에서 L 객체 생성
	}

}
