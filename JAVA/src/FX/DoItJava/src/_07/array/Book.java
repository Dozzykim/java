package _07.array;

public class Book {

	private String bookName;
	private String author;

	public Book() {
		// 디폴트 생성자
	}
	
	//매개변수를 받는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	//getter, setter
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//책정보 출력해주는 메서드
	public void showBookInfo()	{
		System.out.println(bookName + "," + author);
	}
	
	
}