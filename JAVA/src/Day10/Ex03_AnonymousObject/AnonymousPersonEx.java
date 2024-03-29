package Day10.Ex03_AnonymousObject;

public class AnonymousPersonEx {

	public static void main(String[] args) {
		AnonymousPerson ap = new AnonymousPerson();
		ap.method();
		
		//익명 자식 객체 생성
		Person person = new Person() {
			String name = "최민식";
			int age = 60;
			
			void work( ) {
				System.out.println(name + "(" + age + ")");
				System.out.println("연기를 합니다.");
				System.out.println();
			}
		};
		
		person.work();
	}

}
