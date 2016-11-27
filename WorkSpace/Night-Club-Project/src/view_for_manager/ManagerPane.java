package view_for_manager;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ManagerPane {

	private static Stage stage;
	private BorderPane mainPane;
	private Scene scene;

	public ManagerPane() {
		stage = new Stage();
		
		mainPane = new BorderPane();
		
		scene = new Scene(mainPane, 900,500);
		stage.setScene(scene);
		stage.setTitle("Manager View");
		
	}
	
	public static void showStage() {
		stage.show();
	}
	
	
	
}
