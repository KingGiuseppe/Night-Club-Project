package view_for_owner;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model_for_newuser.NewUser;

public class OwnerPane {

	private static Stage stage;
	private static NewUser user;
	private BorderPane mainPane;
	private static Scene scene;

	public OwnerPane() {
		stage = new Stage();

		mainPane = new BorderPane();
		mainPane.setCenter(new Label("LOOK"));
		scene = new Scene(mainPane, 900, 500);
		stage.setScene(scene);
		stage.setTitle("The King's View");
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
