package view.new_user_panel.stage;

import javafx.scene.Scene;
import javafx.stage.Stage;
import view.new_user.scenes.NewUserPanel1;

public class NewUserStage {

	private static Stage stage;
	private static Scene scene;
	private NewUserPanel1 newUserPanel1;

	public NewUserStage() {
		stage = new Stage();
		stage.setScene(NewUserPanel1.getScene());
		stage.setTitle("New User");
		
	}

	public static void showStage() {
		stage.show();
		stage.setScene(scene);
	}

	public static void closeStage() {
		stage.close();
	}

	public static Stage getStage() {
		return stage;
	}
	
	public NewUserPanel1 getNewUserPanel1() {
		return newUserPanel1;
	}
}
