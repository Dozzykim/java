package JavaFX_TableView.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {
	
    @FXML
    private TextField tTitle;

    @FXML
    private TextField tWriter;

    @FXML
    private TextArea tContent;
    
    /* 글 등록 처리 */
    public void insert(ActionEvent event) throws Exception {
    	Board board = new Board(tTitle.getText(), tWriter.getText(), tContent.getText());
    	
    	//글쓰기 화면에서 입력한 내용 콘솔창에 출력
    	System.out.println("title: " + tTitle.getText());
    	System.out.println("writer: " + tWriter.getText());
    	System.out.println("content: " + tContent.getText());
    	
    	// boardList에 새 글 추가
    	// (보류)
    	
    	// 게시글 목록 화면(메인)으로 이동
    	Main.setRoot("Main");  // Main.fxml 화면으로 이동
    }

}
