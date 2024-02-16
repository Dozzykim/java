package Day09.Ex02_Board;

//보드 설계도!

/*
 * 게시글 정보
 * -글 번호
 * -제목
 * -작성자
 * -내용
 * -등록일자
 * -수정일자
*/
public class Board {
	private int no;
	private String title;
	private String writer;
	private String content;
	private String regDate; // 등록일자
	private String updDate; // 수정일자

	// 기본 생성자
	public Board() {
		this("제목없음", "작성자X", "내용없음");
	}

	// 매개변수가 있는 생성자
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getUpdDate() {
		return updDate;
	}

	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}

	@Override
	public String toString() {
		return "Board [글번호=" + no + ", 제목=" + title + ", 작성자=" + writer + ", 내용=" + content + ", 등록일자="
				+ regDate + ", 수정일자=" + updDate + "]";
	}

	
}
