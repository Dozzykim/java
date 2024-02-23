package Day13.Ex03_Generics;

//제네릭 기법으로 타입 매개변수 2개 지정
class KeyValue<K, V> {

	private K key;
	private V value;

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public V getValue() {
		return value;
	}

}

public class TowTypeGeneric {

	public static void main(String[] args) {
		// 제네릭으로 객체 생성
		// 클래스타입<타입1, 타입2> 객체명 = new 클래스<타입1,타입2>();
		// -객체 생성하는 클래스명 뒤의 타입은 생략가능
		//  new 클래스<>();
		
//		KeyValue<String, Integer> kv = new KeyValue<String, Integer>(); 생성자 앞의 타입 지정 생략 가능
		KeyValue<String, Integer> kv = new KeyValue<>();
		
		kv.setKey("자바");
		kv.setValue(100);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(100);
		kv2.setValue("java");
		
		System.out.println("kv - key: " + kv.getKey());
		System.out.println("kv - value: " + kv.getValue());
		
		System.out.println("kv2 - key: " + kv2.getKey());
		System.out.println("kv2 - value: " + kv2.getValue());
		
		//K타입은 지정하고, V타입은 지정하지 않으려면?
		//Void: 해당 타입에는 변수를 사용하지 않도록 지정
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("only key");
		String key3 = kv3.getKey();
		System.out.println("key3: " + key3);
		
	}
}
