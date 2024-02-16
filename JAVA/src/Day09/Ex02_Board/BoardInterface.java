package Day09.Ex02_Board;

//보드 인터페이스!
// 게시판 기능을 정의해놓음. 게시판 껍데기.!!!!!!!

/*
 * 게시판 인터페이스
 * - 데이터 등록 C reat
 * - 데이터 목록
 * - 데이터 조회 R ead
 * - 데이터 수정 U pdate
 * - 데이터 삭제 D elete
*/

public interface BoardInterface {
	
	//데이터 등록
	Board creat(Board board);
	
	//데이터 목록
	Board[] list();
	
	//데이터 조회
	Board read(int no); //글 번호로 조회해서 해당 글번호의 보드를 반환
	
	//데이터 수정
	int update(Board board);
	
	//데이터 삭제
	int delete(int no); //몇번게시글인지만 알면 삭제할 수 잇으므로.. int형 변수를 매개변수로 받음..
	

}
