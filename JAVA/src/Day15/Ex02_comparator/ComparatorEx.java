package Day15.Ex02_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	class User implements Comparator<User> {
	String Id;
	String name;
	int age;
	
	//생성자
	public User() {
		this("-", "-", 0);
		
	}
	
	public User(String Id, String name, int age) {
		this.Id = Id;
		this.name = name;
		this.age = age;
	}

	//getter, setter...
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//toString
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// 정렬기준 1: 나이 순-오름차순
		// 정렬기준 2: 이름 순- 내림차순
		int thisAge = o1.getAge();
		int comAge = o2.getAge();
		int gap = thisAge - comAge;
		
		String thisName = o1.getName();
		String comName = o2.getName();
		int result = thisName.compareTo(comName);
		
		if (gap == 0) return result;
		return gap == 0 ? -result : gap;
		
		//방법 1.
//		if (gap > 0) {
//			return 1;
//		}
//		if (gap == 0) {
//			int result = thisName.compareTo(comName);
//			return -result;
//		}
//		if (gap < 0) {
//			return -1;
//		}
//		
	}
}

public class ComparatorEx {
	
	public static void main(String[] args) {

		// 책 리스트 만들기
		List<User> userList = new ArrayList<User>();
		userList.add(new User("user1004", "홍조은", 22));
		userList.add(new User("joeun1234", "전조은", 25));
		userList.add(new User("joeun1234", "김조은", 25));
		userList.add(new User("joeun1234", "배조은", 25));
		userList.add(new User("joeun1234", "주조은", 25));
		userList.add(new User("joeun1234", "황조은", 25));
		userList.add(new User("aloha2024", "박조은", 28));
		userList.add(new User("tjoeun11", "권조은", 30));
		userList.add(new User("hana96", "이조은", 22));

		System.out.println("정렬 전----");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println();

		// 정렬
		// *Book 객체에 구현된 compareTo() 메소드의 비교기준으로 정렬
		Collections.sort(userList, new User());

		System.out.println("정렬 후----");
		for (User user : userList) {
			System.out.println(user);
		}

	}

}
