package view.login_panel.new_user.stage;

import javafx.stage.Stage;
import view.login_panel.new_user.scenes.NewUserPanel1;

public class NewUserStage {

	private static Stage stage;

	public NewUserStage() {
		stage = new Stage();
		stage.setScene(NewUserPanel1.getScene());
		stage.setTitle("New User");
	}

	public static void showStage() {
		stage.show();
	}

	public static void closeStage() {
		stage.close();
	}

	public static Stage getStage() {
		return stage;
	}

}
