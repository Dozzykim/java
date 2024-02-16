package Day09.Ex02_Board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BoardInterface boardInterface = new BoardAccess();

		int menuNo;

		do {
			System.out.println("------게시판------");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.print("메뉴번호: ");

			menuNo = input.nextInt();
			input.nextLine();

			switch (menuNo) {
			case 1: // 게시글 목록
				Board[] boardList = boardInterface.list();

				for (Board board : boardList) {
					System.out.println(board);
				}
				break;

			case 2: // 게시글 등록
				System.out.print("제목: ");
				String title = input.nextLine();

				System.out.print("작성자: ");
				String writer = input.nextLine();

				System.out.print("내용: ");
				String content = input.nextLine();

				Board board = new Board(title, writer, content);
				Board createdBoard = boardInterface.creat(board);

				if (createdBoard != null) {
					System.out.print("생성된 게시글 정보: ");
					System.out.println(createdBoard);
				}
				break;

			case 3: // 게시글 조회
				System.out.print("조회할 글 번호: ");
				int no = input.nextInt();
				input.nextLine();

				Board selectedBoard = boardInterface.read(no);
				if (selectedBoard != null) {
					System.out.print("조회된 게시글 정보: ");
					System.out.println(selectedBoard);
				}
				break;

			case 4: // 게시글 수정
				System.out.print("수정할 글 번호: ");
				int updateNo = input.nextInt();
				input.nextLine();

				System.out.print("제목: ");
				String rev_title = input.nextLine();
				System.out.print("작성자: ");
				String rev_writer = input.nextLine();
				System.out.print("내용: ");
				String rev_content = input.nextLine();

				Board updateBoard = new Board(rev_title, rev_writer, rev_content);
				updateBoard.setNo(updateNo);

				int result = boardInterface.update(updateBoard);
				if (result > 0) {
					System.out.println("게시글 수정을 완료하였습니다.");
				} else {
					System.err.println("게시글 수정에 실패하였습니다.");
				}
				break;

			case 5: // 게시글 삭제
				System.out.print("삭제할 글 번호: ");
				int deleteNo = input.nextInt();
				input.nextLine();

				result = boardInterface.delete(deleteNo);

				if (result > 0) {
					System.out.println("게시글 삭제를 완료하였습니다.");
				} else {
					System.err.println("게시글 삭제에 실패하였습니다.");
				}
				break;

			default:
				break;
			}

		} while (menuNo != 0);

		
		input.close();
	}

}
