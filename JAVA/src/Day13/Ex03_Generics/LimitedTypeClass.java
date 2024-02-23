package Day13.Ex03_Generics;

class A {
}

class B extends A {
}

class C extends A {
}

class D<T extends A> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

/* 1) Integer 클래스만 타입 매개변수로 사용가능하도록 제한 (하는 의미가 없음. 자식클래스가 없어서 Integer로만 생성가능함..)
 * 2) Number 클래스로 제한(Double, Integer 등 숫자타입 클래스만 사용가능하도록 제한)
*/
class E <T extends Number> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class LimitedTypeClass {

	public static void main(String[] args) {
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();

		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());

		// d1<A> <--자식객체임 B,C 대입 가능 (업캐스팅)
		d1.setT(new B());
		d1.setT(new C());

		// d2<B>, d3<C> <--부모객체인 A 대입 불가
		// (에러)d2.setT( new A() );
		// (에러)d3.setT( new A() );

		// *타입 지정을 생략하면,
		// 제네릭 타입을 제한한 A클래스를 기본으로 생성한다.
		// or D<A> d5 = new D<A>();으로 무슨 타입으로 쓸지 지정해줘야함
		D d5 = new D();
		d5.setT( new B() );
		d5.setT( new C() );
		
		//Wrapper
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		//(에러: 숫자타입 아님) E<Boolean> e4 = new E<Boolean>();
		
		e1.setT(100);
		System.out.println(e1.getT());
		
		e2.setT(12.34);
		System.out.println(e1.getT());
		
		e3.setT((byte)127);
		// e3.setT(127);이 에러나는 이유
		// : 127은 기본형인 int형으로 지정되기 때문에, 큰 자료타입을 작은 자료타입에 대입할 수 없어 강제형변환이 이루어져야함!!!! 
		System.out.println(e1.getT());
		
	}
}
