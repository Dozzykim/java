package Day05.Class;

//상속
//키워드:      자식클래스 extnds  부모클래스
public class Raichu extends Pikachu {
	
	//부모 생성자 그대로 만들기: alt + Shift + S, C
	public Raichu() {
		super();   //super() ->자식클래스에서 부모클래스의 생성자를 호출하는 메소드
	}
	
	public Raichu(int energy, String type) {
		super(energy, type);
	}


	//메소드 오버라이딩 over-riding "메소드 재정의"
	// 부모 클래스의 메소드를 자식 클레스에서 재정의하여, 부모 메소드 무시하고 자식 메소드를 우선실행하는 것.
	
	@Override  // @ -> 어노테이션 : 명시하는 역할
	public String aAttack() {
		return "백만볼트";
	}
	
	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack( ) {
		return "아이언테일";
	}
	
	
	

}
