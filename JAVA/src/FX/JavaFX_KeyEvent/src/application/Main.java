package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	//start 메소드는 UI를 생성하고, UI창을 실행시켜주는 역할
	public void start(Stage stage) {
		try {
			
			/*모듈 설정파일(module-info.java)에 fxml 모듈 설정해야 사용 가능*/
			// fxml파일을 로드하고 루트 노드를 생성
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			
			/* Scene 생성 */
			// 새로운 Scene을 루트 노드와 함께 생성합니다.
			Scene scene = new Scene(root);
			
			/* 키 이벤트 등록*/
			setEvent(scene, root);
			
			/* Scene을 Stage에 등록 */
			 // Scene을 Stage에 설정하고, Stage를 표시합니다.
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 키보드로 도형을 이동시키는 이벤트 정의
	public void setEvent(Scene scene, Parent root) {
		// ID가 "circle"인 Circle 노드를 찾습니다.
		Circle circle = (Circle) root.lookup("#circle");
		if (circle != null) {
			//원이 존재하는 경우
			System.out.println("원의 반지름: " + circle.getRadius());
		} else {
			//원이 존재하지 않는 경우
			System.out.println("원을 찾을 수 없습니다.");
			return; //원 객체 없으면 메소드 종료
		}
		
		// 키 입력 이벤트 등록
		// 키는 대상이 없이 입력받는거니, scene으로 받아서 이벤트를 받는 것!
		// 버튼 클릭은, 버튼이라는 대상을 통해서 이벤트를 받으니 controlloer 클래스를 사용..
		scene.setOnKeyPressed( event ->  {
			double x = circle.getCenterX(); // 원의 중심 x좌표
			double y = circle.getCenterY(); // 원의 중심 y좌표
			switch (event.getCode()) {		// event.getCode(): 입력한 키의 코드값
			case UP:
				System.out.println("UP");
				circle.setCenterY(y -= 10);
				break;
			
			case DOWN:
				System.out.println("DOWN");
				circle.setCenterY(y += 10);
				break;
				
			case LEFT:
				System.out.println("LEFT");
				circle.setCenterX(x -= 10);
				break;
				
			case RIGHT:
				System.out.println("UP");
				circle.setCenterX(x += 10);
				break;
				
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
