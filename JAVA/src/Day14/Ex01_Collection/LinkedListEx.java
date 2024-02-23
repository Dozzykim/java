package Day14.Ex01_Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Day09.Ex02_Board.Board;

/*
 * ArrayList
 * 순차적으로 추가/삭제			- 빠르다
 * 중간에 추가/삭제				- 느리다
 * 검색						- 빠르다
	
	LinkedList
 * 순차적으로 추가/삭제			- 느리다
 * 중간에 추가/삭제				- 빠르다
 * 검색						- 느리다
 */

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		LinkedList<Board> boardList = new LinkedList<Board>();
		
		do {
			System.out.println("1. 게시글 쓰기");
			System.out.println("0. 종료");
			
			System.out.print("입력: ");
			int menu = input.nextInt();
			input.nextLine();
			
			if (menu == 0) {
				break;
			}
			
			if (menu == 1) {
				System.out.print("제목: ");
				String title = input.nextLine();
				
				System.out.print("작성자: ");
				String writer = input.nextLine();
				
				System.out.print("내용: ");
				String content = input.nextLine();
				
				Board board = new Board(title, writer, content);
				boardList.add(board);
			}
			
			for (Board board : boardList) {
				System.out.println(board);
			}
			
		} while (true);
		
		
		input.close();
	}
}
