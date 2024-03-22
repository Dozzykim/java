module JavaFX_TableView {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
}
