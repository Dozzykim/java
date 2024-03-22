package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML
	private AnchorPane scenePane;
	
	@FXML
	private Circle circle;  // Main.fxml의 fx:id = "circle"인 요소의 객체를 가져옴
	private double x;
	private double y;
	
	/*방향키와 연결*/
	
	public void up(ActionEvent e) {
		System.out.println("UP");
		circle.setCenterY(y -= 10);
	}
	
	public void down(ActionEvent e) {
		System.out.println("DOWN");
		circle.setCenterY(y += 10);
		
	}
	
	public void left(ActionEvent e) {
		System.out.println("LEFT");
		circle.setCenterY(x -= 10);
		
	}
	
	public void rigth(ActionEvent e) {
		System.out.println("RIGHT");
		circle.setCenterY(x += 10);
		
	}
	
}
