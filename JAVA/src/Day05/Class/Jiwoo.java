package Day05.Class;

public class Jiwoo {

	public static void main(String[] args) {
	  //객체 생성
      //클래스타입    객체명  =  new 클래스명();
		Pikachu pikachu =  new Pikachu();  //피카츄 클래스에서 생성자를 호출함.
		
		
		// (.)접근 연산자: 객체의 변수, 메소드에 접근하는 연산자
//		pikachu.energy = 100;
//		pikachu.type = "전기";
		
		
		System.out.println("####### 피카츄 #######");
		System.out.println("에너지: " + pikachu.energy);
		System.out.println("타입: " + pikachu.type);
		System.out.println("공격 A: " + pikachu.aAttack());
		System.out.println("공격 B: " + pikachu.bAttack());
		
		Pikachu pikachu2 =  new Pikachu(200, "불속성");  //피카츄 클래스에서 생성자를 호출함.
		System.out.println("####### 피카츄 (Lv.20)#######");
		System.out.println("에너지: " + pikachu2.energy);
		System.out.println("타입: " + pikachu2.type);
		System.out.println("공격 A: " + pikachu2.aAttack());
		System.out.println("공격 B: " + pikachu2.bAttack());
		
		Raichu raichu = new Raichu();
		System.out.println("####### 라이츄 #######");
		System.out.println("에너지: " + raichu.energy);
		System.out.println("타입: " + raichu.type);
		System.out.println("공격 A: " + raichu.aAttack());
		System.out.println("공격 B: " + raichu.bAttack());
		
		Raichu raichu40 = new Raichu(300, "슈퍼전기");
		System.out.println("####### 라이츄(Lv.40) #######");
		System.out.println("에너지: " + raichu40.energy);
		System.out.println("타입: " + raichu40.type);
		System.out.println("공격 A: " + raichu40.aAttack());
		System.out.println("공격 B: " + raichu40.bAttack());
		System.out.println("공격 C: " + raichu40.cAttack());
	}
}

