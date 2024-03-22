package pack;

import pack.a.User;

public class PackageMain3 {

	public static void main(String[] args) {
		User userA = new User();
		pack.b.User userB = new pack.b.User(); 
		// 중복된 클래스명을 가지고있다면,
		//둘중 하나 임포트 했을 시, 다른 하나는 패키지명을 써줘야함
		
	}
}
