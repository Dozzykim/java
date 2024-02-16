package Day08.Ex01_Singleton;

// 디자인 패턴 ?
// -프로그램 코드를 효율적으로 작성하기 위한 모범 답안

/*
 * 싱글톤 패턴
 * -디자인 패턴 중 하나로,
 *  프로그램이 시작될 때, 최초로 한번만 메모리를 할당해서 인스턴스를 사용하는 패턴
 * -객체가 필요할 때마다 새로운 객체를 생성하지않고, 기존의 인스턴스를 활용하는 코드 패턴
 * 
 * 장점: 객체를 하나만 생성하기 때문에 메모리를 효율적으로 사용할 수 있음.
 *  
*/

public class SingleTon {
	
	//static으로 유일한 객체를 생성
	private static SingleTon instance = new SingleTon();
	
	//생성자를 private 으로 지정하여 외부에서의 인스턴스 생성을 막음.
	
	private SingleTon() {
		
	}
	
	//이미 만들어놓은 유일한 객체를 가져오는 메소드 정의
	public static SingleTon getInstance() {
		if (instance ==null) {
			instance = new SingleTon();
		}
		return instance;
	}

}
