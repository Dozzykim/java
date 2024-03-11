package BOARD.Oracle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import BOARD.Oracle.DTO.Board;
import BOARD.Oracle.Service.BoardService;
import BOARD.Oracle.Service.BoardServiceImpl;


//프레젠테이션 계층
public class Main {

	// 필요한 객체 생성
	static List<Board> boardList = null; // 게시글 목록
	static Scanner input = new Scanner(System.in);

	// 비즈니스 로직 계층의 객체를 생성하는 로직 만들기
	static BoardService boardService = new BoardServiceImpl();
	
	//메뉴판 출력메소드
	public static void menu() {
		System.out.println("---------- 게시판 ----------");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 게시글 등록");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 종료");
		System.out.print("---------- 번호: ");
	}
	//게시글 목록 출력
	private static void list() {
		System.out.println();
		System.out.println("----- 게시글 목록 -----");
		System.out.println();
		boardList = boardService.list();
		printAll(boardList);
	}

	/*
	 * 글 목록 전체 출력
	 * @param board
	*/
	public static void printAll(List<Board> list) {
		if (list == null || list.isEmpty()) {
			System.err.println("조회된 글이 없습니다.");
			return;
		}
		for (Board board : list) {
			print(board);
		}
	}
	
	/*
	 * 게시글 출력
	 * @param board
	*/
	public static void print(Board board) {
		if (board == null) {
			System.err.println("조회할 수 없는 게시글입니다.");
			return;
		}
		int no = board.getNo();
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		
		//날짜 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
		String reg = sdf.format(regDate);
		String upd = sdf.format(updDate);
		
		System.out.println("* 글번호: " + no);
		System.out.println("* 제목 : " + title);
		System.out.println("* 작성자: " + writer);
		System.out.println("-------------------------------");
		System.out.println("* " + content);
		System.out.println("* 등록일자 : " + reg);
		System.out.println("* 수정일자 : " + upd);
		System.out.println("-------------------------------");
		System.out.println();
		
	}
	
	//데이터 조회
	public static void select() {
		System.out.println("----- 게시글 조회 -----");
		System.out.print("글 번호: ");
		int no = input.nextInt();
		input.nextLine();
		Board board = boardService.select(no);
		
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		
		
		
		System.out.println("* 글번호: " + no);
		System.out.println("* 제목 : " + title);
		System.out.println("* 작성자: " + writer);
		System.out.println("-------------------------------");
		System.out.println("* " + content);
		System.out.println("* 등록일자 : " + regDate);
		System.out.println("* 수정일자 : " + updDate);
		System.out.println("-------------------------------");
		System.out.println();
		
	}
	
	//게시글 등록
	public static void insert() {
		System.out.println("----- 게시글 등록 -----");
		
		Board board = input();
		
		//게시글 둥록 요청
		int result = boardService.insert(board);
		if (result > 0) {
			System.out.println("게시글이 등록되었습니다.");
		} else {
			System.out.println("게시글 등록에 실패하였습니다.");
		}
	}
	
	
	// 게시글 정보 입력
	public static Board input() {
		System.out.print("제목: ");
		String title = input.nextLine();
		System.out.print("작성자: ");
		String writer = input.nextLine();
		System.out.print("내용: ");
		String content = input.nextLine();
		
		Board board = new Board(title, writer, content);
		
		return board;
	}
	
	//게시글 수정
	public static void update() {
		System.out.println("----- 게시글 수정 -----");
		
		System.out.print("게시글 번호: ");
		int no = input.nextInt();
		input.nextLine();
		
		Board board = input();
		board.setNo(no);
		
		//게시글 수정 요청
		int result = boardService.update(board);
		if (result > 0) {
			System.out.println("게시글이 수정되었습니다.");
		} else {
			System.out.println("게시글 수정에 실패하였습니다.");
		}
	}
	
	//게시글 삭제
		public static void delete() {
			System.out.println("----- 게시글 삭제 -----");
			
			System.out.print("게시글 번호: ");
			int no = input.nextInt();
			input.nextLine();
			
			//게시글 삭제 요청
			int result = boardService.delete(no);
			if (result > 0) {
				System.out.println("게시글이 삭제되었습니다.");
			} else {
				System.out.println("게시글을 삭제하였습니다.");
			}
		}
		
	public static void main(String[] args) {
		// 1. 게시글 목록
		// 2. 게시글 조회
		// 3. 게시글 등록
		// 4. 게시글 수정
		// 5. 게시글 삭제
		int menuNo = 0;

		do {
			//메뉴판 출력메소드
			menu();
			
			//메뉴번호 입력
			menuNo = input.nextInt();
			input.nextLine();

			if (menuNo == 0) {
				break;
			}

			switch (menuNo) {
			case 1: // 게시글 목록
				list();
				break;

			case 2: // 게시글 조회
				select();
				break;

			case 3: // 게시글 등록
				insert();
				break;

			case 4: // 게시글 수정
				update();
				break;

			case 5: // 게시글 삭제
				delete();
				break;
			}
		} while (menuNo != 0);

		System.out.println("프로그램을 종료합니다...");
	}

}
