package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class aController {

	@FXML
	TextField textInput;

	/* B로 이동하기 */
	public void toB(ActionEvent event) throws IOException {
		// B로 데이터 전달하기
		FXMLLoader bFXML = new FXMLLoader(getClass().getResource("B.fxml")); // B.fxml을 새로운 인스턴스로 생성하여
		Parent bRoot = bFXML.load();
		
		bController bController = bFXML.getController(); // b컨트롤러 가져오기

		String data = textInput.getText(); // A화면의 텍스트 필드의 입력값 가져오기
		bController.showData(data); // A에서 B화면으로 데이터 전달

		// B로 화면 전환
//		Main.setRoot("B"); // => 이 메서드는 새로운 인스턴스를 생성하여 화면을 띄워주므로 A에서 입력받은 데이터가 들어있지않음
		Main.setRoot(bRoot);
	}

}
