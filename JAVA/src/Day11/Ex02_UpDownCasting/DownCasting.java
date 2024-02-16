package Day11.Ex02_UpDownCasting;

public class DownCasting {

	public static void main(String[] args) {
		//다운 캐스팅 (강제 형변환)
		//전제조건: 업 캐스팅
		//업캐스팅된 부모 객체를 자식 객체로 변환하는 것.
		//(부모객체를 자식객체로 변환하는 직접적인 방법은 없음. 그래서 자식객체를 부모객체로 업캐스팅한 후 그 업캐스팅한걸 부모객체에 넣는 방법밖에..)
		
		// 업캐스팅: 부모 <- 자식
		// 다운캐스팅: 자식 <- 부모
		
		
		//업캐스팅
		Person person = new Student("김도희", 28, 3, "스페인 중남미학");
		
		System.out.println(person);
		System.out.println(person.work());
		
		
		//다운캐스팅
		Student student = (Student) person;
		
		System.out.println(student);
		System.out.println(student.work());
		
		System.out.println("grade: " + student.grade);
		System.out.println("major: " + student.major);
	}

}
