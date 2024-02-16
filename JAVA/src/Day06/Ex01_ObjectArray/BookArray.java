package Day06.Ex01_ObjectArray;

import java.util.Scanner;

/*
 * 책 제목, 저자명을 갖는 Book 클래스를 정의하고,
 * Book 클래스타입의 객체 배열을 생성하여,
 * 사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오.
 * */

// 하나의 클래스 파일에서 여러개의 클래스를 정의할 수 있다.
class Book {
	
	String title;  //책 제목
	String author; //저자 명
	
	//생성자
	public Book() {
		this("제목없음", "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	//toString()
	//:객체를 출력문에 출력 시, 출력할 템플릿을 지정하는 메소드
	// - Object(최상위 클래스)에 정의된 toString()메소드를 오버라이딩하면
	// 반환값을 출력문에서 출력문에서 출력하는 객체를 대신하여 출력.
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}


//메인 클래스: 클래스파일 이름과 클래스 이름이 같아야함.
public class BookArray {
	
	public static void main(String[] args) {
		//Book타입의 객체 배열 선언 및 생성.
		Book[] bookArray = new Book[3];
		
		Scanner input = new Scanner(System.in);
		
		//사용자 입력받기
		for (int i = 0; i < bookArray.length; i++) {
			System.out.print("제목: ");
			String title = input.nextLine();
			System.out.print("저자: ");
			String author = input.nextLine();
			
			bookArray[i] = new Book(title, author);
		}
		
		//출력
		//  (타입  변수명 : 접근할 객체배열)
		for (Book book : bookArray) {
			System.out.println(book);
		}
		
		input.close();
	}
}
