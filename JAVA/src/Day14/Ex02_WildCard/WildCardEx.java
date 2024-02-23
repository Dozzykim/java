package Day14.Ex02_WildCard;

public class WildCardEx {

	// ? (와일드 카드)
	// : 알 수 없는 타입을 대체하기 위해서 사용하는 기호

	// 메인메소드에서 Course의 타입매개변수가 뭐로 지정될지 static에서는 아직 모름.
	// 그래서 Course의 타입매개변수를 ?로 줌

	// 일반 과정
	public static void checkCourse(Course<?> course) {
		System.out.println("과정명: " + course.getName());
		Object[] studentList = course.getStudents();
		System.out.println("반 학생: ");
		for (Object student : studentList) {
			System.out.print(student + ", ");
		}
		System.out.println();
	}

	// 직장인 과정 매개변수인 course의 타입을 한정시킴.
	// 아래 메서드는 super Worker로 지정함으로써,
	// course변수는 Worker타입 or Worker타입의 부모만 올 수 있음
	public static void checkWorkerCourse(Course<? super Worker> course) {
		System.out.println("과정명: " + course.getName());
		Object[] studentList = course.getStudents();
		System.out.println("반 학생: ");
		for (Object student : studentList) {
			System.out.print(student + ", ");
		}
		System.out.println();
	}
	
	//학생과정
	public static void checkStudentCourse(Course<? extends Student> course) {
		System.out.println("과정명: " + course.getName());
		Object[] studentList = course.getStudents();
		System.out.println("반 학생: ");
		for (Object student : studentList) {
			System.out.print(student + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// 일반과정, 정원 5명
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		personCourse.add(new MiddleStudent("중학생"));

		checkCourse(personCourse);
		System.out.println();

		// 직장인, 정원 5명
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		// Course의 타입매개변수가 Worker 타입이므로 Worker타입 이외의 요소들은 추가가 안됨.
//		workerCourse.add(new Person("일반인")); 
		workerCourse.add(new Worker("직장인"));
//		workerCourse.add(new Student("학생"));
//		workerCourse.add(new HighStudent("고등학생"));
//		workerCourse.add(new MiddleStudent("중학생"));
		checkCourse(workerCourse);
		checkWorkerCourse(workerCourse);
		checkWorkerCourse(personCourse);
		System.out.println();

		// 일반과정, 정원 5명
		Course<Student> studentCourse = new Course<>("학생과정", 5);
//		studentCourse.add(new Person("일반인"));
//		studentCourse.add(new Worker("직장인"));
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		studentCourse.add(new MiddleStudent("중학생"));

		checkCourse(studentCourse);
		System.out.println();
		
		//중학생과정
		Course<MiddleStudent> middleSCourse = new Course<>("중학생과정", 5);
		//고등학생과정
		Course<HighStudent> highSCourse = new Course<>("고등학생과정", 5);
		
		checkStudentCourse(middleSCourse);
		checkStudentCourse(highSCourse);
		checkStudentCourse(studentCourse);
	}

}
