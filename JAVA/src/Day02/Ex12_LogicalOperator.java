package Day02;

public class Ex12_LogicalOperator {
	
	public static void main(String[] args) {
		//논리 연산자
		// AND = && 둘다 true일 때만, true 반환
		System.out.println("논리연산자 AND &&");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("-------");
		
		// OR = ||  둘 중 하나만 true여도 true 반환
		System.out.println("논리연산자 OR ||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("-------");
		
		
		// NOT = ! 현재 논리를 부정
		System.out.println("논리연산자 NOT !");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println("-------");
		
		
		//쇼트 서킷: 논리 연산의 결과를 미리 알아서, 남은 논리식을 확인하지 않는 것.
		System.out.println("쇼트 서킷!");
		int value1 = 3;
		System.out.println(false && ++value1 > 10); //이미 false에서부터 dead code이므로 뒤의 ++value1는 연산이 아예 작용하지않음.
		System.out.println("value1: " + value1);
		
		int value2 = 3;
		System.out.println(true || ++value2 > 10);//이미 true에서부터 dead code이므로 뒤의 ++value1는 연산이 아예 작용하지않음.
		System.out.println("value2: " + value2);
		
		
		//비트 연산자는, 쇼트 서킷이 적용되지않음.
		int value3 = 3;
		System.out.println(false & ++value3 > 10);
		System.out.println("value3: " + value3);
		
		int value4 = 3;
		System.out.println(true | ++value4 > 10);
		System.out.println("value4: " + value4);
	}
	
}

