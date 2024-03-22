package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

//화면 시작 메서드
public class Main extends Application {
	@Override
	public void start(Stage stage) {
		// 단일 Stage 객체로부터 화면이 시작됨.

		Group root = new Group(); // Scene을 지정하기위한 그룹 객체

		// Scene 생성
		// - new Scene(레이아웃);
		Scene scene = new Scene(root);
		
		/*Stage 설정*/
		// Stage 타이틀 설정
		stage.setTitle("소리바다");
		
		// Stage 프로그램 아이콘 지정
		Image icon = new Image("icon.png");
		stage.getIcons().add(icon);

		// Stage 윈도우 크기 지정
		stage.setWidth(600);
		stage.setHeight(400);
		
		//Stage 크기 조절 가능 여부 설정
		stage.setResizable(false);
		
		//Stage 위치 설정
		stage.setX(600);
		stage.setY(300);
		
		// 전체화면 모드
		stage.setFullScreen(true);
		
		// 전체화면 모드 종료 단축키 설정
		stage.setFullScreenExitKeyCombination( KeyCombination.valueOf("Q"));
		
		// 전체화면 모드 종료 힌트 설정
		stage.setFullScreenExitHint("전체화면 종료 (Q)");
		
		// Scene을 Stage에 지정
		stage.setScene(scene);
		
		//Stage 출력
		stage.show();
	}

	// 프로그램 시작
	public static void main(String[] args) {
		launch(args); // launch가 실행되면 프로그램 시작 준비 작업 후 -> start 메서드 호출함.
	}
}
