package view_for_manager;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class ManagerPane {

	private static Stage stage;
	private static NewUser user;
	private BorderPane mainPane;
	private static Scene scene;

	public ManagerPane() {
		stage = new Stage();

		mainPane = new BorderPane();
		mainPane.setCenter(new Label("LOOK"));
		scene = new Scene(mainPane, 900, 500);
		stage.setScene(scene);
		stage.setTitle("Manager View");
	}

	public static void showStage() {
		stage.show();
	}

	public static void setUser(NewUser newUser) {
		user = newUser;
	}

	public static Scene getScene() {
		return scene;
	}

}