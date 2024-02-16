package Day09.Ex02_Board;

//보드 껍데기를 가져와서 구현한 보드 관리 클래스

public class BoardAccess implements BoardInterface {

	int count = 5; // 게시글 갯수

	Board board1 = new Board("제목01", "작성자01", "내용01");
	Board board2 = new Board("제목02", "작성자02", "내용02");
	Board board3 = new Board("제목03", "작성자03", "내용03");
	Board board4 = new Board("제목04", "작성자04", "내용04");
	Board board5 = new Board("제목05", "작성자05", "내용05");

	Board[] boardList = { board1, board2, board3, board4, board5 };

	@Override
	public Board creat(Board board) {
		// 최대 게시글 수 제한
		if (this.count == 5) {
			System.out.println("게시글 목록이 가득 찼습니다.");
			return null;
		} else {
			int boardNo = ++count;
			String regData = "2024/02/15 - 12:00";
			String updDate = "2024/02/15 - 12:00";
			board.setNo(boardNo);
			board.setRegDate(regData);
			board.setUpdDate(updDate);
			boardList[count - 1] = board;
		}
		System.out.println(board);
		System.out.println("게시글이 등록되었습니다.");
		return board;
	}

	// 데이터 목록 조회
	@Override
	public Board[] list() {
		if (this.count == 0) {
			System.out.println("조회된 게시글이 없습니다.");
			return null;
		}
		System.out.println("게시글 목록을 조회합니다.");
		return boardList;
	}

	// 데이터 조회
	@Override
	public Board read(int no) {
		if (no > 5 || no < 0) {
			System.out.println("1~5번의 게시글만 존재합니다.");
			return null;
		}
		System.out.println(no + "번 게시글을 조회합니다.");
		return boardList[no - 1];
	}

	@Override
	public int update(Board board) {
		int no = board.getNo(); // 수정할 게시글 번호
		if (no > 5 || no < 0) {
			System.out.println("1~5번의 게시글만 존재합니다.");
			return 0;
		}
		// 게시글 수정
		board.setUpdDate("2024/02/15 - 14:00");
		boardList[no - 1] = board;

		return 1; // 수정된 게시글 1건
	}

	@Override
	public int delete(int no) {
		if (no > 5 || no < 0) {
			System.out.println("1~5번의 게시글만 존재합니다.");
			return 0;
		}

		if (count == 0) {
			System.out.println("삭제할 게시글이 없습니다.");
			return 0;
		}

		// 게시글 삭제
		boardList[no - 1] = null; // null 참조할 객체(데이터)가 없음을 의미

		// i 시작값: 삭제할 글 index+1
		for (int i = no; i < boardList.length; i++) {
			// 바로앞 위치 = 현재 접근한 글 위치
			boardList[i - 1] = boardList[i];
		}
		// 앞으로 당기고 남은 가작 마지막 글 위치는 비움...
		// (위의 for문에서는 대입이기때문에, 객체가 이동하는 것이 아니라 복사해서 이동하므로, 마지막 값을 null처리 해줘야함)
		boardList[count - 1] = null;
		// 삭제 후, 게시글 개수 1 감소
		count--;

		return 1; // 삭제한 게시글 개수
	}

}
