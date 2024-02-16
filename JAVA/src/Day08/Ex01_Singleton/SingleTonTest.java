package Day08.Ex01_Singleton;

public class SingleTonTest {
	
	public static void main(String[] args) {
//		Singleton s = new SingleTon();
		
		SingleTon s01 = SingleTon.getInstance();
		SingleTon s02 = SingleTon.getInstance();
		
		//인스턴스가 메모리 공간에 한개만 할당되어있는지 확인 (= 동일한 인스턴스인지 확인)
		System.out.println(s01);
		System.out.println(s02);
		
		System.out.println("s01과 s02가 같은 지?: ");
		System.out.println(s01 == s02);
	}

}
